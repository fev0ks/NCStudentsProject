package com.netcracker.students_project.dao;


public class Factory {
    private static StudentDAO studentDAO = null;
    private static AssignementDao assignementDao = null;
    private static CommentsTaskDao commentsTaskEntityDao = null;
    private static RoleDao roleDao = null;
    private static StepDao stepDao = null;
    private static SubmissionDao submissionDao = null;
    private static TaskDao taskEntityDao = null;
    private static TaskTegsDao taskTegsEntityDao = null;
    private static TegsDao tegsEntityDao = null;
    private static UserDao userEntityDao = null;

    private static Factory instance;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public AssignementDao getAssignementDao() {
        if (assignementDao == null) {
            assignementDao = new AssignementDao();
        }
        return assignementDao;
    }

    public CommentsTaskDao getCommentsTaskDao() {
        if (commentsTaskEntityDao == null) {
            commentsTaskEntityDao = new CommentsTaskDao();
        }
        return commentsTaskEntityDao;

    }

    public RoleDao getRoleDao() {
        if (roleDao == null) {
            roleDao = new RoleDao();
        }
        return roleDao;

    }

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

    public TaskTegsDao getTaskTegsDao() {
        if (taskTegsEntityDao == null) {
            taskTegsEntityDao = new TaskTegsDao();
        }
        return taskTegsEntityDao;
    }

    public TegsDao getTegsDao() {
        if (tegsEntityDao == null) {
            tegsEntityDao = new TegsDao();
        }
        return tegsEntityDao;
    }

    public UserDao getUserDao() {
        if (userEntityDao == null) {
            userEntityDao = new UserDao();
        }
        return userEntityDao;
    }
}
