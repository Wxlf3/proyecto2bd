delete from chat;
alter table chat auto_increment = 1;

call insert_chat(1);
call insert_chat(2);
call insert_chat(3);
call insert_chat(4);
call insert_chat(5);
call insert_chat(6);
call insert_chat(7);