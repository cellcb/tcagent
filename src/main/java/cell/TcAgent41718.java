//package cell;
//
//import javassist.ClassPool;
//import javassist.CtClass;
//import javassist.CtMethod;
//import javassist.LoaderClassPath;
//
//import java.io.ByteArrayInputStream;
//import java.lang.instrument.ClassFileTransformer;
//import java.lang.instrument.IllegalClassFormatException;
//import java.lang.instrument.Instrumentation;
//import java.security.ProtectionDomain;
//
//public class TcAgent441708 {
//
//    public static void premain(String agentArgs, Instrumentation inst) {
//        inst.addTransformer(new LicenseKeyTransformer());
//        inst.addTransformer(new UpdateTransformer());
//        inst.addTransformer(new Update2Transformer());
//        inst.addTransformer(new Update3Transformer());
//        inst.addTransformer(new LicenseModeTransformer());
//        inst.addTransformer(new QTransformer());
//        inst.addTransformer(new jetbrainsbuildServeraadTransformer());
//    }
//    private static class Update2Transformer implements ClassFileTransformer {
//
//        private static final String CLASS_NAME = "jetbrains.buildServer.controllers.license.ServerLicenseBean";
//
//        private static final String CLASS_NAME_INTERNAL = CLASS_NAME.replace('.', '/');
//
//        public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
//            if (className == null) {
//                return null;
//            }
//            // 如果不是 hudson.model.UpdateSite 就忽略掉，不做修改
//            // 这个方法传入的 className 是使用 “/” 分割的类名，而不是标准的 "." 分割的类名
//            if (!CLASS_NAME_INTERNAL.equals(className)) {
//                return null;
//            }
//            try {
//                System.out.println("----jetbrains.buildServer.controllers.license.ServerLicenseBean---|||||||||||||||||||||||||||----cell.TcAgent-----------------------------------------");
//                // 加载 javassist 类池
//                ClassPool cp = ClassPool.getDefault();
//                // WAR 包发布，还需要把 loader 补充进去，不然下面 javassist 解析字节码会报告找不到 import 的类
//                cp.appendClassPath(new LoaderClassPath(loader));
//                // 把字节码载入进去，生成 CtClass
//                CtClass cc = cp.makeClass(new ByteArrayInputStream(classfileBuffer));
//
//                CtMethod getLicensedAgentCount = cc.getDeclaredMethod("getLicensedAgentCount");
//                getLicensedAgentCount.setBody("{ return 11111; }");
//
//                CtMethod isUnlimitedBuildTypes = cc.getDeclaredMethod("isUnlimitedBuildTypes");
//                isUnlimitedBuildTypes.setBody("{ return true; }");
//
//                CtMethod isUnlimitedAgents = cc.getDeclaredMethod("isUnlimitedAgents");
//                isUnlimitedAgents.setBody("{ return true; }");
//
//                // 返回重新编译的字节码
//                return cc.toBytecode();
//            } catch (Exception e) {
//                e.printStackTrace();
//                return null;
//            }
//        }
//
//    }
//
//    private static class Update3Transformer implements ClassFileTransformer {
//
//        private static final String CLASS_NAME = "jetbrains.buildServer.controllers.agent.AgentListBaseForm";
//
//        private static final String CLASS_NAME_INTERNAL = CLASS_NAME.replace('.', '/');
//
//        public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
//            if (className == null) {
//                return null;
//            }
//            // 如果不是 hudson.model.UpdateSite 就忽略掉，不做修改
//            // 这个方法传入的 className 是使用 “/” 分割的类名，而不是标准的 "." 分割的类名
//            if (!CLASS_NAME_INTERNAL.equals(className)) {
//                return null;
//            }
//            try {
//                System.out.println("jetbrains.buildServer.controllers.agent.AgentListBaseForm================================================================");
//                // 加载 javassist 类池
//                ClassPool cp = ClassPool.getDefault();
//                // WAR 包发布，还需要把 loader 补充进去，不然下面 javassist 解析字节码会报告找不到 import 的类
//                cp.appendClassPath(new LoaderClassPath(loader));
//                // 把字节码载入进去，生成 CtClass
//                CtClass cc = cp.makeClass(new ByteArrayInputStream(classfileBuffer));
//
//                CtMethod getLicensesLeft = cc.getDeclaredMethod("getLicensesLeft");
//                getLicensesLeft.setBody("{ return 22222; }");
//                // 返回重新编译的字节码
//                return cc.toBytecode();
//            } catch (Exception e) {
//                e.printStackTrace();
//                return null;
//            }
//        }
//
//    }
//
//    private static class UpdateTransformer implements ClassFileTransformer {
//
//        private static final String CLASS_NAME = "jetbrains.buildServer.a.m";
//
//        private static final String CLASS_NAME_INTERNAL = CLASS_NAME.replace('.', '/');
//
//        public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
//            if (className == null) {
//                return null;
//            }
//            // 如果不是 hudson.model.UpdateSite 就忽略掉，不做修改
//            // 这个方法传入的 className 是使用 “/” 分割的类名，而不是标准的 "." 分割的类名
//            if (!CLASS_NAME_INTERNAL.equals(className)) {
//                return null;
//            }
//            try {
//                System.out.println("----------------jetbrains.buildServer.a.m-------------------cell.TcAgent-----------------------------------------");
//                // 加载 javassist 类池
//                ClassPool cp = ClassPool.getDefault();
//                // 因为 Jenkins 是 WAR 包发布，还需要把 loader 补充进去，不然下面 javassist 解析字节码会报告找不到 import 的类
//                cp.appendClassPath(new LoaderClassPath(loader));
//                // 把字节码载入进去，生成 CtClass
//                CtClass cc = cp.makeClass(new ByteArrayInputStream(classfileBuffer));
//
//
//                CtMethod isEnterpriseMode = cc.getDeclaredMethod("isEnterpriseMode");
//                isEnterpriseMode.setBody("{ return true; }");
//
//                CtMethod isEvaluationMode = cc.getDeclaredMethod("isEvaluationMode");
//                isEvaluationMode.setBody("{ return false; }");
//
//                CtMethod isEAPEvaluationMode = cc.getDeclaredMethod("isEAPEvaluationMode");
//                isEAPEvaluationMode.setBody("{ return false; }");
//
//                CtMethod isOpenSourceMode = cc.getDeclaredMethod("isOpenSourceMode");
//                isOpenSourceMode.setBody("{ return false; }");
//
//                CtMethod isPerUsageLicenseActive = cc.getDeclaredMethod("isPerUsageLicenseActive");
//                isPerUsageLicenseActive.setBody("{ return false; }");
//
//                CtMethod getMaxNumberOfBuildTypes = cc.getDeclaredMethod("getMaxNumberOfBuildTypes");
//                getMaxNumberOfBuildTypes.setBody("{ return 10000; }");
//
//                CtMethod getMaxNumberOfAuthorizedAgents = cc.getDeclaredMethod("getMaxNumberOfAuthorizedAgents");
//                getMaxNumberOfAuthorizedAgents.setBody("{ return 10000; }");
//
//                CtMethod isMaxNumberOfAuthorizedAgentsExceeded = cc.getDeclaredMethod("isMaxNumberOfAuthorizedAgentsExceeded");
//                isMaxNumberOfAuthorizedAgentsExceeded.setBody("{ return false; }");
//
//
//                CtMethod getAgentsLicensesLeft = cc.getDeclaredMethod("getAgentsLicensesLeft");
//                getAgentsLicensesLeft.setBody("{ return 100000; }");
//
//                CtMethod isMaxNumberOfBuildTypesExceeded = cc.getDeclaredMethod("isMaxNumberOfBuildTypesExceeded");
//                isMaxNumberOfBuildTypesExceeded.setBody("{ return false; }");
//
//                CtMethod getBuildTypesLicensesLeft = cc.getDeclaredMethod("getBuildTypesLicensesLeft");
//                getBuildTypesLicensesLeft.setBody("{ return 1; }");
//
//                CtMethod getActiveLicensesNum = cc.getDeclaredMethod("getActiveLicensesNum");
//                getActiveLicensesNum.setBody("{ return 1; }");
//
//
//                // 返回重新编译的字节码
//                return cc.toBytecode();
//            } catch (Exception e) {
//                e.printStackTrace();
//                return null;
//            }
//        }
//
//    }
//    private static class LicenseKeyTransformer implements ClassFileTransformer {
//
//        private static final String CLASS_NAME = "jetbrains.buildServer.a.j";
//
//        private static final String CLASS_NAME_INTERNAL = CLASS_NAME.replace('.', '/');
//
//        public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
//            if (className == null) {
//                return null;
//            }
//            // 如果不是 hudson.model.UpdateSite 就忽略掉，不做修改
//            // 这个方法传入的 className 是使用 “/” 分割的类名，而不是标准的 "." 分割的类名
//            if (!CLASS_NAME_INTERNAL.equals(className)) {
//                return null;
//            }
//            try {
//                System.out.println("----------jetbrains.buildServer.a.j-----------LicenseKey--------------cell.TcAgent -----------------------------------------");
//                // 加载 javassist 类池
//                ClassPool cp = ClassPool.getDefault();
//                // 因为 Jenkins 是 WAR 包发布，还需要把 loader 补充进去，不然下面 javassist 解析字节码会报告找不到 import 的类
//                cp.appendClassPath(new LoaderClassPath(loader));
//                // 把字节码载入进去，生成 CtClass
//                CtClass cc = cp.makeClass(new ByteArrayInputStream(classfileBuffer));
//
//
//                CtMethod isMaintenanceExpiringIn = cc.getDeclaredMethod("isMaintenanceExpiringIn");
//                isMaintenanceExpiringIn.setBody("{ return false; }");
//
//                CtMethod isLicenseExpiringIn = cc.getDeclaredMethod("isLicenseExpiringIn");
//                isLicenseExpiringIn.setBody("{ return false; }");
//
//                CtMethod isValid = cc.getDeclaredMethod("isValid");
//                isValid.setBody("{ return true; }");
//
//                CtMethod isEvaluationLicenseKey = cc.getDeclaredMethod("isEvaluationLicenseKey");
//                isEvaluationLicenseKey.setBody("{ return false; }");
//
//                CtMethod isMultipleEvaluationKey = cc.getDeclaredMethod("isMultipleEvaluationKey");
//                isMultipleEvaluationKey.setBody("{ return false; }");
//
//                CtMethod isEAPLicenseKey = cc.getDeclaredMethod("isEAPLicenseKey");
//                isEAPLicenseKey.setBody("{ return false; }");
//
//                CtMethod hasMaintenancePeriodValidFor = cc.getDeclaredMethod("hasMaintenancePeriodValidFor");
//                hasMaintenancePeriodValidFor.setBody("{ return false; }");
//
//                CtMethod isEnterpriseLicense = cc.getDeclaredMethod("isEnterpriseLicense");
//                isEnterpriseLicense.setBody("{ return true; }");
//
//
//                CtMethod isOpenSourceLicenseKey = cc.getDeclaredMethod("isOpenSourceLicenseKey");
//                isOpenSourceLicenseKey.setBody("{ return false; }");
//
//                CtMethod isUnlimitedAgentsLicense = cc.getDeclaredMethod("isUnlimitedAgentsLicense");
//                isUnlimitedAgentsLicense.setBody("{ return true; }");
//
//                CtMethod isPerUsageLicense = cc.getDeclaredMethod("isPerUsageLicense");
//                isPerUsageLicense.setBody("{ return false; }");
//
//                CtMethod isObsolete = cc.getDeclaredMethod("isObsolete");
//                isObsolete.setBody("{ return false; }");
//
//
//                // 返回重新编译的字节码
//                return cc.toBytecode();
//            } catch (Exception e) {
//                e.printStackTrace();
//                return null;
//            }
//        }
//
//    }
//
//    private static class LicenseModeTransformer implements ClassFileTransformer {
//
//        private static final String CLASS_NAME = "jetbrains.buildServer.serverSide.LicenseMode";
//
//        private static final String CLASS_NAME_INTERNAL = CLASS_NAME.replace('.', '/');
//
//        public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
//            if (className == null) {
//                return null;
//            }
//            // 如果不是 hudson.model.UpdateSite 就忽略掉，不做修改
//            // 这个方法传入的 className 是使用 “/” 分割的类名，而不是标准的 "." 分割的类名
//            if (!CLASS_NAME_INTERNAL.equals(className)) {
//                return null;
//            }
//            try {
//                System.out.println("---------------------LicenseMode--------------cell.TcAgent -----------------------------------------");
//                // 加载 javassist 类池
//                ClassPool cp = ClassPool.getDefault();
//                // 因为 Jenkins 是 WAR 包发布，还需要把 loader 补充进去，不然下面 javassist 解析字节码会报告找不到 import 的类
//                cp.appendClassPath(new LoaderClassPath(loader));
//                // 把字节码载入进去，生成 CtClass
//                CtClass cc = cp.makeClass(new ByteArrayInputStream(classfileBuffer));
//
//
//                CtMethod getDetails = cc.getDeclaredMethod("getDetails");
//                getDetails.setBody("{ return \"最牛B\"; }");
//
//
//
//                // 返回重新编译的字节码
//                return cc.toBytecode();
//            } catch (Exception e) {
//                e.printStackTrace();
//                return null;
//            }
//        }
//
//    }
//
//    private static class jetbrainsbuildServeraadTransformer implements ClassFileTransformer {
//
//            private static final String CLASS_NAME = "jetbrains.buildServer.a.a.d";
//
//        private static final String CLASS_NAME_INTERNAL = CLASS_NAME.replace('.', '/');
//
//        public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
//            if (className == null) {
//                return null;
//            }
//            // 如果不是 hudson.model.UpdateSite 就忽略掉，不做修改
//            // 这个方法传入的 className 是使用 “/” 分割的类名，而不是标准的 "." 分割的类名
//            if (!CLASS_NAME_INTERNAL.equals(className)) {
//                return null;
//            }
//            try {
//                System.out.println("----------jetbrains.buildServer.a.a.d--------------------cell.TcAgent -----------------------------------------");
//                // 加载 javassist 类池
//                ClassPool cp = ClassPool.getDefault();
//                // 因为 Jenkins 是 WAR 包发布，还需要把 loader 补充进去，不然下面 javassist 解析字节码会报告找不到 import 的类
//                cp.appendClassPath(new LoaderClassPath(loader));
//                // 把字节码载入进去，生成 CtClass
//                CtClass cc = cp.makeClass(new ByteArrayInputStream(classfileBuffer));
//
//
//                CtMethod m = cc.getDeclaredMethod("m");
//                m.setBody("{ return 999; }");
//
//
//
//                // 返回重新编译的字节码
//                return cc.toBytecode();
//            } catch (Exception e) {
//                e.printStackTrace();
//                return null;
//            }
//        }
//
//    }
//
//
//    private static class QTransformer implements ClassFileTransformer {
//
//        private static final String CLASS_NAME = "jetbrains.buildServer.a.q";
//
//        private static final String CLASS_NAME_INTERNAL = CLASS_NAME.replace('.', '/');
//
//        public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
//            if (className == null) {
//                return null;
//            }
//            // 如果不是 hudson.model.UpdateSite 就忽略掉，不做修改
//            // 这个方法传入的 className 是使用 “/” 分割的类名，而不是标准的 "." 分割的类名
//            if (!CLASS_NAME_INTERNAL.equals(className)) {
//                return null;
//            }
//            try {
//                System.out.println("----------jetbrains.buildServer.a.q--------------------cell.TcAgent -----------------------------------------");
//                // 加载 javassist 类池
//                ClassPool cp = ClassPool.getDefault();
//                // 因为 Jenkins 是 WAR 包发布，还需要把 loader 补充进去，不然下面 javassist 解析字节码会报告找不到 import 的类
//                cp.appendClassPath(new LoaderClassPath(loader));
//                // 把字节码载入进去，生成 CtClass
//                CtClass cc = cp.makeClass(new ByteArrayInputStream(classfileBuffer));
//
//
//                CtMethod hasEnterpriseLicense = cc.getDeclaredMethod("hasEnterpriseLicense");
//                hasEnterpriseLicense.setBody("{ return true; }");
//
//                CtMethod getLicensedAgentCount = cc.getDeclaredMethod("getLicensedAgentCount");
//                getLicensedAgentCount.setBody("{ return 666; }");
//                CtMethod getLicensedBuildTypesCount = cc.getDeclaredMethod("getLicensedBuildTypesCount");
//                getLicensedBuildTypesCount.setBody("{ return 999; }");
//
//
//                CtMethod isUnlimitedAgents = cc.getDeclaredMethod("isUnlimitedAgents");
//                isUnlimitedAgents.setBody("{ return true; }");
//
//
//                CtMethod isUnlimitedBuildTypes = cc.getDeclaredMethod("isUnlimitedBuildTypes");
//                isUnlimitedBuildTypes.setBody("{ return true; }");
//
//                CtMethod getNumberOfPredefinedAgents = cc.getDeclaredMethod("getNumberOfPredefinedAgents");
//                getNumberOfPredefinedAgents.setBody("{ return 777; }");
//
//
//                // 返回重新编译的字节码
//                return cc.toBytecode();
//            } catch (Exception e) {
//                e.printStackTrace();
//                return null;
//            }
//        }
//
//    }
//
//
//}
