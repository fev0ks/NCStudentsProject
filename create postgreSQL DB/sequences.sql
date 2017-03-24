CREATE SEQUENCE user_id_seq START 1;
ALTER TABLE user_tb 
	ALTER COLUMN id 
	SET DEFAULT nextval('user_id_seq');
ALTER SEQUENCE user_id_seq OWNED BY user_tb.id; 