package com.netcracker.students_project.dao;


public class Factory {
    private static StudentDAO studentDAO = null;
    private static AssignementEntityDao assignementEntityDao = null;
    private static CommentsTaskEntityDao commentsTaskEntityDao = null;
    private static RoleEntityDao roleEntityDao = null;
    private static StepEntityDao stepEntityDao = null;
    private static SubmissionEntityDao submissionEntityDao = null;
    private static TaskEntityDao taskEntityDao = null;
    private static TaskTegsEntityDao taskTegsEntityDao = null;
    private static TegsEntityDao tegsEntityDao = null;
    private static UserEntityDao userEntityDao = null;

    private static Factory instance;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public AssignementEntityDao getAssignementEntityDao() {
        if (assignementEntityDao == null) {
            assignementEntityDao = new AssignementEntityDao();
        }
        return assignementEntityDao;
    }

    public CommentsTaskEntityDao getCommentsTaskEntityDao() {
        if (commentsTaskEntityDao == null) {
            commentsTaskEntityDao = new CommentsTaskEntityDao();
        }
        return commentsTaskEntityDao;

    }

    public RoleEntityDao getRoleEntityDao() {
        if (roleEntityDao == null) {
            roleEntityDao = new RoleEntityDao();
        }
        return roleEntityDao;

    }

    public StepEntityDao getStepEntityDao() {
        if (stepEntityDao == null) {
            stepEntityDao = new StepEntityDao();
        }
        return stepEntityDao;
    }

    public SubmissionEntityDao getSubmissionEntityDao() {
        if (submissionEntityDao == null) {
            submissionEntityDao = new SubmissionEntityDao();
        }
        return submissionEntityDao;
    }

    public TaskEntityDao getTaskEntityDao() {
        if (taskEntityDao == null) {
            taskEntityDao = new TaskEntityDao();
        }
        return taskEntityDao;
    }

    public TaskTegsEntityDao getTaskTegsEntityDao() {
        if (taskTegsEntityDao == null) {
            taskTegsEntityDao = new TaskTegsEntityDao();
        }
        return taskTegsEntityDao;
    }

    public TegsEntityDao getTegsEntityDao() {
        if (tegsEntityDao == null) {
            tegsEntityDao = new TegsEntityDao();
        }
        return tegsEntityDao;
    }

    public UserEntityDao getUserEntityDao() {
        if (userEntityDao == null) {
            userEntityDao = new UserEntityDao();
        }
        return userEntityDao;
    }
}
