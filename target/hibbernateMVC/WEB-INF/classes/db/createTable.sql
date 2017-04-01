CREATE TABLE user_tb (
  id bigserial PRIMARY KEY,
  email varchar(128),
  nickname varchar(32),
  dt_registration date NOT NULL,
  vk_id bigint NOT NULL,
  vk_token  varchar(256),
  UNIQUE(email, nickname, vk_id)
);

CREATE TABLE role (
  id serial PRIMARY KEY,
  value varchar(32) NOT NULL
);

CREATE TABLE task (
  id bigserial PRIMARY KEY,
  name varchar(256) NOT NULL ,
  description varchar(2048),
  dt_created date NOT NULL
);

CREATE TABLE assignment (
  id bigserial PRIMARY KEY,
  user_id bigserial,
  task_id bigserial,
  role varchar(32) NOT NULL,
  email_notification boolean DEFAULT true,
  FOREIGN KEY(user_id) REFERENCES user(id),
  FOREIGN KEY(task_id) REFERENCES  task(id),
  UNIQUE (user_id, task_id)
);

CREATE TABLE step (
  id bigserial PRIMARY KEY,
  name varchar(256) NOT NULL,
  description varchar(1024),
  deadline date NOT NULL,
  proof_photo bytea,
  dt_finished date,
  dt_started date,
  task_id bigserial NOT NULL,
  FOREIGN KEY(task_id) REFERENCES task(id)
);

CREATE TABLE submission (
  id bigserial PRIMARY KEY,
  result boolean DEFAULT false,
  mentor_id bigserial NOT NULL,
  step_id   bigserial NOT NULL,
  FOREIGN KEY(mentor_id) REFERENCES user_tb(id),
  FOREIGN KEY(step_id) REFERENCES step(id)
);

CREATE TABLE teg (
  id serial PRIMARY KEY,
  text varchar(64) NOT NULL
);

CREATE TABLE tasks_tegs (
  task_id bigserial REFERENCES task,
  teg_id serial REFERENCES teg,
  PRIMARY KEY(task_id, teg_id)
);

CREATE TABLE comments_task (
  id bigserial PRIMARY KEY,
  user_id serial NOT NULL,
  task_id bigserial NOT NULL,
  text varchar(512) NOT NULL,
  dt_created date NOT NULL,
  FOREIGN KEY(user_id) REFERENCES user_tb(id),
  FOREIGN KEY(task_id) REFERENCES task(id)
);

