////
//// Source code recreated from a .class file by IntelliJ IDEA
//// (powered by Fernflower decompiler)
////
//
//package jetbrains.buildServer.a;
//
//import jetbrains.buildServer.serverSide.LicensingPolicyEx;
//import jetbrains.buildServer.serverSide.ProjectManager;
//import org.jetbrains.annotations.NotNull;
//
//public class m implements LicensingPolicyEx {
//    @NotNull
//    private final r a;
//    @NotNull
//    private final ProjectManager b;
//    private static final String[] c;
//
//    public m(@NotNull r var1, @NotNull ProjectManager var2) {
//        if (var1 == null) {
//            a(0);
//        }
//
//        if (var2 == null) {
//            a(1);
//        }
//
//        super();
//        this.a = var1;
//        this.b = var2;
//    }
//
//    public boolean isEnterpriseMode() {
//        return this.a.getLicenseList().hasEnterpriseLicense();
//    }
//
//    public boolean isEvaluationMode() {
//        return this.a.getLicenseList().isEvaluationMode();
//    }
//
//    public boolean isEAPEvaluationMode() {
//        return this.a.getLicenseList().isEAPEvaluationMode();
//    }
//
//    public boolean isOpenSourceMode() {
//        return this.a.getLicenseList().isOpenSourceMode();
//    }
//
//    public boolean isPerUsageLicenseActive() {
//        // $FF: Couldn't be decompiled
//    }
//
//    public int getMaxNumberOfBuildTypes() {
//        try {
//            if (this.a.getLicenseList().isUnlimitedBuildTypes()) {
//                return -1;
//            }
//        } catch (IllegalArgumentException var1) {
//            throw var1;
//        }
//
//        return this.a.f();
//    }
//
//    public int getMaxNumberOfAuthorizedAgents() {
//        try {
//            if (this.a.getLicenseList().isUnlimitedAgents()) {
//                return -1;
//            }
//        } catch (IllegalArgumentException var1) {
//            throw var1;
//        }
//
//        return this.a.e();
//    }
//
//    public boolean isMaxNumberOfAuthorizedAgentsExceeded() {
//        try {
//            if (this.a.getLicenseList().isUnlimitedAgents()) {
//                return false;
//            }
//        } catch (IllegalArgumentException var1) {
//            throw var1;
//        }
//
//        boolean var10000;
//        try {
//            if (this.a.getLicenseList().getLicensedAgentCount() - this.a.o() < 0) {
//                var10000 = true;
//                return var10000;
//            }
//        } catch (IllegalArgumentException var2) {
//            throw var2;
//        }
//
//        var10000 = false;
//        return var10000;
//    }
//
//    public int getAgentsLicensesLeft() {
//        try {
//            if (this.a.getLicenseList().isUnlimitedAgents()) {
//                return -1;
//            }
//        } catch (IllegalArgumentException var4) {
//            throw var4;
//        }
//
//        int var1 = this.getMaxNumberOfAuthorizedAgents();
//        int var2 = this.a.o();
//
//        int var10000;
//        try {
//            if (var1 > var2) {
//                var10000 = var1 - var2;
//                return var10000;
//            }
//        } catch (IllegalArgumentException var3) {
//            throw var3;
//        }
//
//        var10000 = 0;
//        return var10000;
//    }
//
//    public boolean isMaxNumberOfBuildTypesExceeded() {
//        try {
//            if (this.a.getLicenseList().isUnlimitedBuildTypes()) {
//                return false;
//            }
//        } catch (IllegalArgumentException var3) {
//            throw var3;
//        }
//
//        int var1 = this.b.getNumberOfBuildTypes();
//
//        boolean var10000;
//        try {
//            if (var1 > this.getMaxNumberOfBuildTypes()) {
//                var10000 = true;
//                return var10000;
//            }
//        } catch (IllegalArgumentException var2) {
//            throw var2;
//        }
//
//        var10000 = false;
//        return var10000;
//    }
//
//    public int getBuildTypesLicensesLeft() {
//        try {
//            if (this.a.getLicenseList().isUnlimitedBuildTypes()) {
//                return -1;
//            }
//        } catch (IllegalArgumentException var4) {
//            throw var4;
//        }
//
//        int var1 = this.getMaxNumberOfBuildTypes();
//        int var2 = this.b.getNumberOfBuildTypes();
//
//        int var10000;
//        try {
//            if (var1 > var2) {
//                var10000 = var1 - var2;
//                return var10000;
//            }
//        } catch (IllegalArgumentException var3) {
//            throw var3;
//        }
//
//        var10000 = 0;
//        return var10000;
//    }
//
//    public int getActiveLicensesNum() {
//        return this.a.getLicenseList().getActiveLicenses().size();
//    }
//
//    static {
//        String[] var10000 = new String[5];
//        String[] var10001 = var10000;
//        byte var10002 = 0;
//        String var10003 = "Uy;M\u0013Ju\u0015I\u0013Xw=Z";
//        byte var10004 = -1;
//
//        while(true) {
//            char[] var5;
//            label39: {
//                char[] var3 = var10003.toCharArray();
//                int var10006 = var3.length;
//                int var0 = 0;
//                var5 = var3;
//                int var4 = var10006;
//                char[] var7;
//                int var10007;
//                if (var10006 <= 1) {
//                    var7 = var3;
//                    var10007 = var0;
//                } else {
//                    var5 = var3;
//                    var4 = var10006;
//                    if (var10006 <= var0) {
//                        break label39;
//                    }
//
//                    var7 = var3;
//                    var10007 = var0;
//                }
//
//                while(true) {
//                    char var10008 = var7[var10007];
//                    byte var10009;
//                    switch(var0 % 5) {
//                        case 0:
//                            var10009 = 57;
//                            break;
//                        case 1:
//                            var10009 = 16;
//                            break;
//                        case 2:
//                            var10009 = 88;
//                            break;
//                        case 3:
//                            var10009 = 40;
//                            break;
//                        default:
//                            var10009 = 125;
//                    }
//
//                    var7[var10007] = (char)(var10008 ^ var10009);
//                    ++var0;
//                    if (var4 == 0) {
//                        var10007 = var4;
//                        var7 = var5;
//                    } else {
//                        if (var4 <= var0) {
//                            break;
//                        }
//
//                        var7 = var5;
//                        var10007 = var0;
//                    }
//                }
//            }
//
//            String var8 = (new String(var5)).intern();
//            switch(var10004) {
//                case 0:
//                    var10001[var10002] = var8;
//                    var10001 = var10000;
//                    var10002 = 2;
//                    var10003 = "xb?]\u0010\\~,\b\u001bVbxh3Vd\u0016]\u0011U0(I\u000fX}=\\\u0018K0\u007f\r\u000e\u001e07N]\u001ccv\r\u000e\u0019}-[\t\u0019~7\\][uxF\bU|";
//                    var10004 = 1;
//                    break;
//                case 1:
//                    var10001[var10002] = var8;
//                    var10001 = var10000;
//                    var10002 = 3;
//                    var10003 = "Su,J\u000fXy6[R[e1D\u0019ju*^\u0018K?9\u0007\u0010";
//                    var10004 = 2;
//                    break;
//                case 2:
//                    var10001[var10002] = var8;
//                    var10001 = var10000;
//                    var10002 = 4;
//                    var10003 = "\u0005y6A\t\u0007";
//                    var10004 = 3;
//                    break;
//                case 3:
//                    var10001[var10002] = var8;
//                    c = var10000;
//                    return;
//                default:
//                    var10001[var10002] = var8;
//                    var10001 = var10000;
//                    var10002 = 1;
//                    var10003 = "Ib7B\u0018Zd\u0015I\u0013Xw=Z";
//                    var10004 = 0;
//            }
//        }
//    }
//}
