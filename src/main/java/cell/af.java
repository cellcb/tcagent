////
//// Source code recreated from a .class file by IntelliJ IDEA
//// (powered by Fernflower decompiler)
////
//
//package jetbrains.buildServer.controllers.agent;
//
//import jetbrains.buildServer.serverSide.LicenseKeysManager;
//import jetbrains.buildServer.serverSide.LicensingPolicyEx;
//import jetbrains.buildServer.users.PropertyKey;
//import jetbrains.buildServer.users.SimplePropertyKey;
//import jetbrains.buildServer.users.User;
//
//public class AgentListBaseForm {
//    public static final PropertyKey DO_NOT_GROUP_BY_POOL_PROPERTY_KEY = new SimplePropertyKey("do.not.group.agent.lists.by.pool");
//    protected final LicensingPolicyEx myLicensingPolicy;
//    private User myUser;
//    private boolean myHasSeveralPools;
//    private String myState;
//    private String myStatus;
//    private boolean myNoAgentDetailsPermission;
//
//    public AgentListBaseForm(LicenseKeysManager var1) {
//        this.myLicensingPolicy = var1.getLicensingPolicy();
//    }
//
//    public void setHasSeveralPools(boolean var1) {
//        this.myHasSeveralPools = var1;
//    }
//
//    public void setUser(User var1) {
//        this.myUser = var1;
//    }
//
//    public boolean isGroupByPools() {
//        return this.myUser == null || !this.myUser.getBooleanProperty(DO_NOT_GROUP_BY_POOL_PROPERTY_KEY);
//    }
//
//    public boolean isHasSeveralPools() {
//        return this.myHasSeveralPools;
//    }
//
//    public boolean isActuallyGroupByPools() {
//        return !this.myNoAgentDetailsPermission && this.isGroupByPools() && this.isHasSeveralPools();
//    }
//
//    public boolean isEnabledOnly() {
//        return this.myState != null && AgentListBaseForm.StateOption.ENABLED.name().equals(this.myState);
//    }
//
//    public boolean isRunningOnly() {
//        return this.myStatus != null && AgentListBaseForm.StatusOption.RUNNING.name().equals(this.myStatus);
//    }
//
//    public String getState() {
//        return this.myState;
//    }
//
//    public void setState(String var1) {
//        this.myState = var1;
//    }
//
//    public String getStatus() {
//        return this.myStatus;
//    }
//
//    public void setStatus(String var1) {
//        this.myStatus = var1;
//    }
//
//    public int getLicensesLeft() {
//        return this.myLicensingPolicy.getAgentsLicensesLeft();
//    }
//
//    public boolean isCanAuthorizeMoreAgents() {
//        return this.getLicensesLeft() != 0;
//    }
//
//    public boolean isNoAgentDetailsPermission() {
//        return this.myNoAgentDetailsPermission;
//    }
//
//    public void setNoAgentDetailsPermission(boolean var1) {
//        this.myNoAgentDetailsPermission = var1;
//    }
//
//    public static enum StatusOption {
//        IDLE,
//        RUNNING;
//
//        private StatusOption() {
//        }
//    }
//
//    public static enum StateOption {
//        ENABLED,
//        DISABLED;
//
//        private StateOption() {
//        }
//    }
//}
