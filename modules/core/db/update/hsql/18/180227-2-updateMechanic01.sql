alter table WORKSHOP_MECHANIC add constraint FK_WORKSHOP_MECHANIC_ORDER foreign key (ORDER_ID) references WORKSHOP_ORDER(ID);
create index IDX_WORKSHOP_MECHANIC_ORDER on WORKSHOP_MECHANIC (ORDER_ID);
