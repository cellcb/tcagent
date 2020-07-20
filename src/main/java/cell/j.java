////
//// Source code recreated from a .class file by IntelliJ IDEA
//// (powered by Fernflower decompiler)
////
//
//package jetbrains.buildServer.a;
//
//import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;
//import jetbrains.buildServer.a.a.b;
//import jetbrains.buildServer.a.a.d;
//import jetbrains.buildServer.a.b.c;
//import jetbrains.buildServer.serverSide.LicenseKey;
//import jetbrains.buildServer.serverSide.LicenseKeyData;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//
//public class j implements LicenseKey {
//    private final String a;
//    @Nullable
//    private final b b;
//    private String c;
//    private boolean d;
//    private static final Set<Integer> e;
//    private static final String[] f;
//
//    j(@NotNull b var1, @NotNull String var2) {
//        if (var1 == null) {
//            a(0);
//        }
//
//        if (var2 == null) {
//            a(1);
//        }
//
//        super();
//        this.b = var1;
//        this.a = var2;
//    }
//
//    public j(String var1) {
//        super();
//        this.a = var1;
//
//        d var2;
//        try {
//            var2 = (new c()).c(var1);
//        } catch (w var4) {
//            var2 = null;
//            this.a(var4.getMessage());
//        }
//
//        this.b = var2;
//    }
//
//    public boolean isMaintenanceExpiringIn(int param1) {
//        // $FF: Couldn't be decompiled
//    }
//
//    public boolean isLicenseExpiringIn(int param1) {
//        // $FF: Couldn't be decompiled
//    }
//
//    public String getKey() {
//        return this.a;
//    }
//
//    public String getUniquePartOfKey() {
//        b var1 = this.b;
//
//        String var10000;
//        try {
//            if (var1 != null) {
//                var10000 = var1.o();
//                return var10000;
//            }
//        } catch (w var2) {
//            throw var2;
//        }
//
//        var10000 = this.a;
//        return var10000;
//    }
//
//    public void a(String var1) {
//        this.c = var1;
//    }
//
//    public boolean isValid() {
//        // $FF: Couldn't be decompiled
//    }
//
//    public String getValidateError() {
//        return this.c;
//    }
//
//    public boolean isEvaluationLicenseKey() {
//        // $FF: Couldn't be decompiled
//    }
//
//    public boolean isMultipleEvaluationKey() {
//        // $FF: Couldn't be decompiled
//    }
//
//    public boolean isEAPLicenseKey() {
//        // $FF: Couldn't be decompiled
//    }
//
//    public boolean hasMaintenancePeriodValidFor(@NotNull Date param1) {
//        // $FF: Couldn't be decompiled
//    }
//
//    public boolean isEnterpriseLicense() {
//        // $FF: Couldn't be decompiled
//    }
//
//    public boolean isOpenSourceLicenseKey() {
//        // $FF: Couldn't be decompiled
//    }
//
//    public boolean isUnlimitedAgentsLicense() {
//        // $FF: Couldn't be decompiled
//    }
//
//    public boolean isPerUsageLicense() {
//        // $FF: Couldn't be decompiled
//    }
//
//    public boolean isObsolete() {
//        return this.d;
//    }
//
//    @Nullable
//    public LicenseKeyData getLicenseKeyData() {
//        final b var1 = this.b;
//
//        try {
//            if (var1 == null) {
//                return null;
//            }
//        } catch (w var2) {
//            throw var2;
//        }
//
//        return new LicenseKeyData() {
//            private static final String[] a;
//
//            public int getLicenseType() {
//                return var1.c();
//            }
//
//            public int getMajorVersion() {
//                return var1.f();
//            }
//
//            public int getMinorVersion() {
//                return var1.e();
//            }
//
//            @NotNull
//            public Date getGenerationDate() {
//                try {
//                    Date var10000 = var1.g();
//                    if (var10000 == null) {
//                        a(0);
//                    }
//
//                    return var10000;
//                } catch (IllegalStateException var1x) {
//                    throw var1x;
//                }
//            }
//
//            @Nullable
//            public Date getExpirationDate() {
//                return var1.h();
//            }
//
//            @NotNull
//            public Date getMaintenanceDueDate() {
//                try {
//                    Date var10000 = var1.i();
//                    if (var10000 == null) {
//                        a(1);
//                    }
//
//                    return var10000;
//                } catch (IllegalStateException var1x) {
//                    throw var1x;
//                }
//            }
//
//            public boolean isTimeBasedLicense() {
//                return var1.j();
//            }
//
//            public boolean isLicenseExpired() {
//                return var1.k();
//            }
//
//            public int getNumberOfAgents() {
//                return var1.m();
//            }
//
//            public String describeLicense() {
//                return var1.n();
//            }
//
//            static {
//                String[] var10000 = new String[4];
//                String[] var10001 = var10000;
//                byte var10002 = 0;
//                String var10003 = "5\u0004;\b&<\u0004=.7;\u000e!\u000b\"&\u0004";
//                byte var10004 = -1;
//
//                while(true) {
//                    char[] var5;
//                    label38: {
//                        char[] var3 = var10003.toCharArray();
//                        int var10006 = var3.length;
//                        int var0 = 0;
//                        var5 = var3;
//                        int var4 = var10006;
//                        char[] var7;
//                        int var10007;
//                        if (var10006 <= 1) {
//                            var7 = var3;
//                            var10007 = var0;
//                        } else {
//                            var5 = var3;
//                            var4 = var10006;
//                            if (var10006 <= var0) {
//                                break label38;
//                            }
//
//                            var7 = var3;
//                            var10007 = var0;
//                        }
//
//                        while(true) {
//                            char var10008 = var7[var10007];
//                            byte var10009;
//                            switch(var0 % 5) {
//                                case 0:
//                                    var10009 = 82;
//                                    break;
//                                case 1:
//                                    var10009 = 97;
//                                    break;
//                                case 2:
//                                    var10009 = 79;
//                                    break;
//                                case 3:
//                                    var10009 = 79;
//                                    break;
//                                default:
//                                    var10009 = 67;
//                            }
//
//                            var7[var10007] = (char)(var10008 ^ var10009);
//                            ++var0;
//                            if (var4 == 0) {
//                                var10007 = var4;
//                                var7 = var5;
//                            } else {
//                                if (var4 <= var0) {
//                                    break;
//                                }
//
//                                var7 = var5;
//                                var10007 = var0;
//                            }
//                        }
//                    }
//
//                    String var8 = (new String(var5)).intern();
//                    switch(var10004) {
//                        case 0:
//                            var10001[var10002] = var8;
//                            var10001 = var10000;
//                            var10002 = 2;
//                            var10003 = "\u0012/ ;\r'\r#o.7\u0015' 'rD<af!A\":0&A! 7r\u0013*;6 \u000fo!6>\r";
//                            var10004 = 1;
//                            break;
//                        case 1:
//                            var10001[var10002] = var8;
//                            var10001 = var10000;
//                            var10002 = 3;
//                            var10003 = "5\u0004;\u0002\";\u000f;*-3\u000f,*\u0007'\u0004\u000b.77";
//                            var10004 = 2;
//                            break;
//                        case 2:
//                            var10001[var10002] = var8;
//                            a = var10000;
//                            return;
//                        default:
//                            var10001[var10002] = var8;
//                            var10001 = var10000;
//                            var10002 = 1;
//                            var10003 = "8\u0004;-13\b!<l0\u0014&#'\u0001\u0004=9& N.`)v\u0000";
//                            var10004 = 0;
//                    }
//                }
//            }
//        };
//    }
//
//    public void a(boolean var1) {
//        this.d = var1;
//    }
//
//    public boolean equals(Object param1) {
//        // $FF: Couldn't be decompiled
//    }
//
//    public int hashCode() {
//        try {
//            if (this.b != null) {
//                return this.b.o().hashCode();
//            }
//        } catch (w var1) {
//            throw var1;
//        }
//
//        int var10000;
//        try {
//            if (this.a != null) {
//                var10000 = this.a.hashCode();
//                return var10000;
//            }
//        } catch (w var2) {
//            throw var2;
//        }
//
//        var10000 = 0;
//        return var10000;
//    }
//
//    public String toString() {
//        return this.a;
//    }
//
//    static {
//        String[] var10000 = new String[7];
//        String[] var10001 = var10000;
//        byte var10002 = 0;
//        String var10003 = "N&\u0013\f%E*\t\u001dxF6\u000e\u00023w&\u0015\u00182Vl\u0006A=";
//        byte var10004 = -1;
//
//        while(true) {
//            char[] var5;
//            label41: {
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
//                        break label41;
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
//                            var10009 = 36;
//                            break;
//                        case 1:
//                            var10009 = 67;
//                            break;
//                        case 2:
//                            var10009 = 103;
//                            break;
//                        case 3:
//                            var10009 = 110;
//                            break;
//                        default:
//                            var10009 = 87;
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
//                    var10003 = "O&\u001e";
//                    var10004 = 1;
//                    break;
//                case 1:
//                    var10001[var10002] = var8;
//                    var10001 = var10000;
//                    var10002 = 3;
//                    var10003 = "H*\u0004\u000b9W&.\u00001K";
//                    var10004 = 2;
//                    break;
//                case 2:
//                    var10001[var10002] = var8;
//                    var10001 = var10000;
//                    var10002 = 4;
//                    var10003 = "V&\u000b\u000b6W&#\u000f#A";
//                    var10004 = 3;
//                    break;
//                case 3:
//                    var10001[var10002] = var8;
//                    var10001 = var10000;
//                    var10002 = 5;
//                    var10003 = "\u0018*\t\u0007#\u001a";
//                    var10004 = 4;
//                    break;
//                case 4:
//                    var10001[var10002] = var8;
//                    var10001 = var10000;
//                    var10002 = 6;
//                    var10003 = "e1\u0000\u001b:A-\u0013N1K1G.\u0019K7)\u001b;Hc\u0017\u000f%E.\u0002\u001a2Vc@K$\u0003c\b\bw\u00010IK$\u0004.\u0012\u001d#\u0004-\b\u001awF&G\u0000\"H/";
//                    var10004 = 5;
//                    break;
//                case 5:
//                    var10001[var10002] = var8;
//                    f = var10000;
//                    e = new HashSet();
//                    e.add(5);
//                    e.add(11);
//                    e.add(12);
//                    e.add(7);
//                    e.add(6);
//                    e.add(10);
//                    e.add(8);
//                    return;
//                default:
//                    var10001[var10002] = var8;
//                    var10001 = var10000;
//                    var10002 = 1;
//                    var10003 = "L\"\u0014#6M-\u0013\u000b9E-\u0004\u000b\u0007A1\u000e\u00013r\"\u000b\u00073b,\u0015";
//                    var10004 = 0;
//            }
//        }
//    }
//}
