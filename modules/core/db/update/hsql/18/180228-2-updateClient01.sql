alter table WORKSHOP_CLIENT add constraint FK_WORKSHOP_CLIENT_ORDER_INPUT_OBJECT foreign key (ORDER_INPUT_OBJECT_ID) references WORKSHOP_ORDER_INPUT_OBJECT(ID);
create index IDX_WORKSHOP_CLIENT_ORDER_INPUT_OBJECT on WORKSHOP_CLIENT (ORDER_INPUT_OBJECT_ID);
