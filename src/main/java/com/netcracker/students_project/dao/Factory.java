package com.netcracker.students_project.dao;


 public  class Factory {
    private static AssignmentDao assignmentDao = null;
    private static CommentsTaskDao commentsTaskEntityDao = null;
    //private static RoleDao roleDao = null;
    private static StepDao stepDao = null;
    private static SubmissionDao submissionDao = null;
    private static TaskDao taskEntityDao = null;
    private static TaskTegDao taskTegsEntityDao = null;
    private static TagDao tegEntityDao = null;
    private static UserDao userEntityDao = null;

    private static Factory instance;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }
    private Factory(){

    }
    public AssignmentDao getAssignmentDao() {
        if (assignmentDao == null) {
            assignmentDao = new AssignmentDao();
        }
        return assignmentDao;
    }

    public CommentsTaskDao getCommentsTaskDao() {
        if (commentsTaskEntityDao == null) {
            commentsTaskEntityDao = new CommentsTaskDao();
        }
        return commentsTaskEntityDao;

    }

//    public RoleDao getRoleDao() {
//        if (roleDao == null) {
//            roleDao = new RoleDao();
//        }
//        return roleDao;
//    }

    public StepDao getStepDao() {
        if (stepDao == null) {
            stepDao = new StepDao();
        }
        return stepDao;
    }

    public SubmissionDao getSubmissionDao() {
        if (submissionDao == null) {
            submissionDao = new SubmissionDao();
        }
        return submissionDao;
    }

    public TaskDao getTaskDao() {
        if (taskEntityDao == null) {
            taskEntityDao = new TaskDao();
        }
        return taskEntityDao;
    }

    public TaskTegDao getTaskTegsDao() {
        if (taskTegsEntityDao == null) {
            taskTegsEntityDao = new TaskTegDao();
        }
        return taskTegsEntityDao;
    }

    public TagDao getTegDao() {
        if (tegEntityDao == null) {
            tegEntityDao = new TagDao();
        }
        return tegEntityDao;
    }

    public UserDao getUserDao() {
        if (userEntityDao == null) {
            userEntityDao = new UserDao();
        }
        return userEntityDao;
    }
}
