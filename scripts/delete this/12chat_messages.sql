delete from chat_message;
alter table chat_message auto_increment = 1;

call insert_chat_message("Hola. En qué condiciones se encuentra el producto?", "dCalvo", 1);
call insert_chat_message("Buenas. Está en perfectas condiciones a pesar de su antigüedad", "tCalvo", 1);
call insert_chat_message("Excelente. Entonces coordinemos la compra", "dCalvo", 1);