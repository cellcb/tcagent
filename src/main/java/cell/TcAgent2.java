package cell;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.LoaderClassPath;

import java.io.ByteArrayInputStream;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

public class TcAgent2 {

    public static void premain(String agentArgs, Instrumentation inst) {
        inst.addTransformer(new UpdateTransformer());
    }

    private static class UpdateTransformer implements ClassFileTransformer {

        private static final String CLASS_NAME = "jetbrains.buildServer.controllers.license.ServerLicenseBean";

        private static final String CLASS_NAME_INTERNAL = CLASS_NAME.replace('.', '/');

        public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
            if (className == null) {
                return null;
            }
            // 如果不是 hudson.model.UpdateSite 就忽略掉，不做修改
            // 这个方法传入的 className 是使用 “/” 分割的类名，而不是标准的 "." 分割的类名
            if (!CLASS_NAME_INTERNAL.equals(className)) {
                return null;
            }
            try {
                System.out.println("----jetbrains.buildServer.controllers.license.ServerLicenseBean---|||||||||||||||||||||||||||----cell.TcAgent-----------------------------------------");
                // 加载 javassist 类池
                ClassPool cp = ClassPool.getDefault();
                // WAR 包发布，还需要把 loader 补充进去，不然下面 javassist 解析字节码会报告找不到 import 的类
                cp.appendClassPath(new LoaderClassPath(loader));
                // 把字节码载入进去，生成 CtClass
                CtClass cc = cp.makeClass(new ByteArrayInputStream(classfileBuffer));

                // 返回重新编译的字节码
                return cc.toBytecode();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

    }




}
