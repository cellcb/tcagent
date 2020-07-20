////
//// Source code recreated from a .class file by IntelliJ IDEA
//// (powered by Fernflower decompiler)
////
//
//package jetbrains.buildServer.a;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Date;
//import java.util.Iterator;
//import java.util.concurrent.CopyOnWriteArrayList;
//import jetbrains.buildServer.serverSide.LicenseKey;
//import jetbrains.buildServer.serverSide.LicenseKeyData;
//import jetbrains.buildServer.serverSide.LicenseList;
//import jetbrains.buildServer.util.ItemProcessor;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//
//public class q implements LicenseList {
//    @NotNull
//    private final CopyOnWriteArrayList<LicenseKey> a;
//    @NotNull
//    private final CopyOnWriteArrayList<LicenseKey> b;
//    @NotNull
//    private final o c;
//    @NotNull
//    private final n d;
//    private static final String[] f;
//
//    public q(@NotNull o var1, @NotNull n var2) {
//        if (var1 == null) {
//            a(0);
//        }
//
//        if (var2 == null) {
//            a(1);
//        }
//
//        super();
//        this.a = new CopyOnWriteArrayList();
//        this.b = new CopyOnWriteArrayList();
//        this.c = var1;
//        this.d = var2;
//    }
//
//    public void a(@NotNull LicenseKey var1) {
//        try {
//            if (var1 == null) {
//                a(2);
//            }
//        } catch (IllegalArgumentException var3) {
//            throw var3;
//        }
//
//        label31: {
//            try {
//                if (var1.isEnterpriseLicense()) {
//                    this.a.addIfAbsent(var1);
//                    break label31;
//                }
//            } catch (IllegalArgumentException var4) {
//                throw var4;
//            }
//
//            this.b.addIfAbsent(var1);
//        }
//
//        try {
//            if (var1.isPerUsageLicense()) {
//                this.d.b(this.c());
//            }
//
//        } catch (IllegalArgumentException var2) {
//            throw var2;
//        }
//    }
//
//    public void a(Collection<LicenseKey> var1) {
//        this.a.removeAll(var1);
//        this.b.removeAll(var1);
//    }
//
//    public boolean hasEnterpriseLicense() {
//        boolean var10000;
//        try {
//            if (!this.a().isEmpty()) {
//                var10000 = true;
//                return var10000;
//            }
//        } catch (IllegalArgumentException var1) {
//            throw var1;
//        }
//
//        var10000 = false;
//        return var10000;
//    }
//
//    @NotNull
//    public Collection<LicenseKey> getAllLicenses() {
//        ArrayList var1 = new ArrayList(this.b);
//
//        try {
//            var1.addAll(this.a);
//            if (var1 == null) {
//                a(3);
//            }
//
//            return var1;
//        } catch (IllegalArgumentException var2) {
//            throw var2;
//        }
//    }
//
//    private void a(@NotNull ItemProcessor<LicenseKeyData> param1) {
//        // $FF: Couldn't be decompiled
//    }
//
//    @NotNull
//    public Collection<LicenseKey> getActiveLicenses() {
//        try {
//            Collection var10000 = this.b();
//            if (var10000 == null) {
//                a(5);
//            }
//
//            return var10000;
//        } catch (IllegalArgumentException var1) {
//            throw var1;
//        }
//    }
//
//    @NotNull
//    public Collection<LicenseKey> getInactiveLicenses() {
//        Collection var1 = this.getAllLicenses();
//
//        try {
//            var1.removeAll(b(var1));
//            if (var1 == null) {
//                a(6);
//            }
//
//            return var1;
//        } catch (IllegalArgumentException var2) {
//            throw var2;
//        }
//    }
//
//    public int getLicensedAgentCount() {
//        byte var10000;
//        label16: {
//            try {
//                if (this.hasEnterpriseLicense()) {
//                    var10000 = 0;
//                    break label16;
//                }
//            } catch (IllegalArgumentException var3) {
//                throw var3;
//            }
//
//            var10000 = 3;
//        }
//
//        byte var1 = var10000;
//        final int[] var2 = new int[]{var1};
//        this.a(new ItemProcessor<LicenseKeyData>() {
//            public boolean a(LicenseKeyData var1) {
//                if (var1.getLicenseType() == 9 || var1.getLicenseType() == 5 || var1.getLicenseType() == 12) {
//                    int[] var10000 = var2;
//                    var10000[0] += var1.getNumberOfAgents();
//                }
//
//                return true;
//            }
//        });
//        return var2[0];
//    }
//
//    public int getLicensedBuildTypesCount() {
//        boolean var1 = true;
//        final int[] var2 = new int[]{100};
//        this.a(new ItemProcessor<LicenseKeyData>() {
//            public boolean a(LicenseKeyData var1) {
//                if (var1.getLicenseType() == 9) {
//                    int[] var10000 = var2;
//                    var10000[0] += var1.getNumberOfAgents() * 10;
//                }
//
//                return true;
//            }
//        });
//        return var2[0];
//    }
//
//    public boolean b(LicenseKey param1) {
//        // $FF: Couldn't be decompiled
//    }
//
//    @Nullable
//    public LicenseKey findTimeBasedLicenseKey() {
//        // $FF: Couldn't be decompiled
//    }
//
//    public boolean isEvaluationMode() {
//        Iterator var1 = this.a().iterator();
//
//        while(var1.hasNext()) {
//            LicenseKey var2 = (LicenseKey)var1.next();
//
//            try {
//                if (var2.isEvaluationLicenseKey()) {
//                    return true;
//                }
//            } catch (IllegalArgumentException var3) {
//                throw var3;
//            }
//        }
//
//        return false;
//    }
//
//    @NotNull
//    private Collection<LicenseKey> a() {
//        try {
//            Collection var10000 = b((Collection)this.a);
//            if (var10000 == null) {
//                a(7);
//            }
//
//            return var10000;
//        } catch (IllegalArgumentException var1) {
//            throw var1;
//        }
//    }
//
//    public boolean isEAPEvaluationMode() {
//        Iterator var1 = this.a().iterator();
//
//        while(var1.hasNext()) {
//            LicenseKey var2 = (LicenseKey)var1.next();
//
//            try {
//                if (var2.isEAPLicenseKey()) {
//                    return true;
//                }
//            } catch (IllegalArgumentException var3) {
//                throw var3;
//            }
//        }
//
//        return false;
//    }
//
//    public boolean isOpenSourceMode() {
//        Iterator var1 = this.a().iterator();
//
//        while(var1.hasNext()) {
//            LicenseKey var2 = (LicenseKey)var1.next();
//
//            try {
//                if (var2.isOpenSourceLicenseKey()) {
//                    return true;
//                }
//            } catch (IllegalArgumentException var3) {
//                throw var3;
//            }
//        }
//
//        return false;
//    }
//
//    public boolean isUnlimitedAgents() {
//        // $FF: Couldn't be decompiled
//    }
//
//    public boolean isPerUsageMode() {
//        // $FF: Couldn't be decompiled
//    }
//
//    public boolean isPerUsageLicenseActive() {
//        // $FF: Couldn't be decompiled
//    }
//
//    public boolean isUnlimitedBuildTypes() {
//        return this.hasEnterpriseLicense();
//    }
//
//    public int getNumberOfPredefinedAgents() {
//        try {
//            if (this.isUnlimitedAgents()) {
//                return 0;
//            }
//        } catch (IllegalArgumentException var2) {
//            throw var2;
//        }
//
//        try {
//            return this.hasEnterpriseLicense() ? 0 : 3;
//        } catch (IllegalArgumentException var1) {
//            throw var1;
//        }
//    }
//
//    public int getNumberOfPredefinedBuildTypes() {
//        try {
//            return this.isUnlimitedBuildTypes() ? 0 : 100;
//        } catch (IllegalArgumentException var1) {
//            throw var1;
//        }
//    }
//
//    @Nullable
//    public Date getLicenseExpirationDate() {
//        // $FF: Couldn't be decompiled
//    }
//
//    @NotNull
//    public Date getReleaseDate() {
//        try {
//            Date var10000 = this.c.a();
//            if (var10000 == null) {
//                a(8);
//            }
//
//            return var10000;
//        } catch (IllegalArgumentException var1) {
//            throw var1;
//        }
//    }
//
//    @NotNull
//    private Collection<LicenseKey> b() {
//        try {
//            Collection var10000 = b(this.getAllLicenses());
//            if (var10000 == null) {
//                a(9);
//            }
//
//            return var10000;
//        } catch (IllegalArgumentException var1) {
//            throw var1;
//        }
//    }
//
//    @NotNull
//    private static Collection<LicenseKey> b(@NotNull Collection<LicenseKey> param0) {
//        // $FF: Couldn't be decompiled
//    }
//
//    private long c() {
//        return System.currentTimeMillis();
//    }
//
//    static {
//        String[] var10000 = new String[19];
//        String[] var10001 = var10000;
//        byte var10002 = 0;
//        String var10003 = "=\u0004a`\u00160\u0005_{\u0010;\u001f`w\u0000";
//        byte var10004 = -1;
//
//        while(true) {
//            char[] var7;
//            label68: {
//                char[] var5 = var10003.toCharArray();
//                int var10006 = var5.length;
//                int var0 = 0;
//                var7 = var5;
//                int var6 = var10006;
//                char[] var9;
//                int var10007;
//                if (var10006 <= 1) {
//                    var9 = var5;
//                    var10007 = var0;
//                } else {
//                    var7 = var5;
//                    var6 = var10006;
//                    if (var10006 <= var0) {
//                        break label68;
//                    }
//
//                    var9 = var5;
//                    var10007 = var0;
//                }
//
//                while(true) {
//                    char var10008 = var9[var10007];
//                    byte var10009;
//                    switch(var0 % 5) {
//                        case 0:
//                            var10009 = 94;
//                            break;
//                        case 1:
//                            var10009 = 113;
//                            break;
//                        case 2:
//                            var10009 = 19;
//                            break;
//                        case 3:
//                            var10009 = 18;
//                            break;
//                        default:
//                            var10009 = 115;
//                    }
//
//                    var9[var10007] = (char)(var10008 ^ var10009);
//                    ++var0;
//                    if (var6 == 0) {
//                        var10007 = var6;
//                        var9 = var7;
//                    } else {
//                        if (var6 <= var0) {
//                            break;
//                        }
//
//                        var9 = var7;
//                        var10007 = var0;
//                    }
//                }
//            }
//
//            String var10 = (new String(var7)).intern();
//            switch(var10004) {
//                case 0:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 2;
//                    var10003 = "4\u0014gp\u0001?\u0018}a\\<\u0004z~\u0017\r\u0014ad\u0016,^r=\u0002";
//                    var10004 = 1;
//                    break;
//                case 1:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 3;
//                    var10003 = ",\u0014\u007fw\u0012-\u0014Ws\u0007;9|~\u0017;\u0003";
//                    var10004 = 2;
//                    break;
//                case 2:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 4;
//                    var10003 = "9\u0014gS\u0010*\u0018ew60\u0005v`\u0003,\u0018`w?7\u0012v|\u0000;\u0002";
//                    var10004 = 3;
//                    break;
//                case 3:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 5;
//                    var10003 = "=\u001e~b\u0006*\u0014Rq\u00077\u0007v^\u001a=\u0014}a\u0016-";
//                    var10004 = 4;
//                    break;
//                case 4:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 6;
//                    var10003 = "9\u0014g@\u00162\u0014ra\u0016\u001a\u0010gw";
//                    var10004 = 5;
//                    break;
//                case 5:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 7;
//                    var10003 = "?\u0015w^\u001a=\u0014}a\u0016";
//                    var10004 = 6;
//                    break;
//                case 6:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 8;
//                    var10003 = ".\u0003|q\u0016-\u0002|`";
//                    var10004 = 7;
//                    break;
//                case 7:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 9;
//                    var10003 = "\u001e?|f=+\u001d\u007f2\u001e;\u0005{}\u0017~T`<V-Q~g\u0000*Q}}\u0007~\u0003vf\u0006,\u001f3|\u00062\u001d";
//                    var10004 = 8;
//                    break;
//                case 8:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 10;
//                    var10003 = "9\u0014gS\u0010*\u0018ew?7\u0012v|\u0000;\u0002";
//                    var10004 = 9;
//                    break;
//                case 9:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 11;
//                    var10003 = "4\u0014gp\u0001?\u0018}a\\<\u0004z~\u0017\r\u0014ad\u0016,^r=\u0002";
//                    var10004 = 10;
//                    break;
//                case 10:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 12;
//                    var10003 = "\u001f\u0003tg\u001e;\u001fg2\u00151\u00033R=1\u0005]g\u001f2Qcs\u0001?\u001cvf\u0016,Q47\u0000yQ|tS{\u0002=7\u0000~\u001cfa\u0007~\u001f|fS<\u00143|\u00062\u001d";
//                    var10004 = 11;
//                    break;
//                case 11:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 13;
//                    var10003 = "9\u0014g[\u001d?\u0012g{\u0005;=zq\u00160\u0002va";
//                    var10004 = 12;
//                    break;
//                case 12:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 14;
//                    var10003 = "b\u0018}{\u0007`";
//                    var10004 = 13;
//                    break;
//                case 13:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 15;
//                    var10003 = "0\u0014dY\u0016'";
//                    var10004 = 14;
//                    break;
//                case 14:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 16;
//                    var10003 = ".\u0003|q\u0016-\u0002Rq\u00077\u0007v\\\u001c0%z\u007f\u0016\u001c\u0010`w\u0017\u0012\u0018pw\u001d-\u0014`";
//                    var10004 = 15;
//                    break;
//                case 15:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 17;
//                    var10003 = ".\u0014aG\u0000?\u0016v^\u001a=\u0014}a\u0016\u001a\u0010gs";
//                    var10004 = 16;
//                    break;
//                case 16:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 18;
//                    var10003 = "9\u0014gS\u001f2=zq\u00160\u0002va";
//                    var10004 = 17;
//                    break;
//                case 17:
//                    var10001[var10002] = var10;
//                    f = var10000;
//
//                    boolean var2;
//                    label49: {
//                        try {
//                            if (!q.class.desiredAssertionStatus()) {
//                                var2 = true;
//                                break label49;
//                            }
//                        } catch (IllegalArgumentException var1) {
//                            throw var1;
//                        }
//
//                        var2 = false;
//                    }
//
//                    e = var2;
//                    return;
//                default:
//                    var10001[var10002] = var10;
//                    var10001 = var10000;
//                    var10002 = 1;
//                    var10003 = "=\u001e~b\u0006*\u0014Rq\u00077\u0007v^\u001a=\u0014}a\u0016-";
//                    var10004 = 0;
//            }
//        }
//    }
//}
