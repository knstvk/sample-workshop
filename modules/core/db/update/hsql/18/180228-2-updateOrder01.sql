alter table WORKSHOP_ORDER add constraint FK_WORKSHOP_ORDER_PART1 foreign key (PART1_ID) references WORKSHOP_SPARE_PART(ID);
create index IDX_WORKSHOP_ORDER_PART1 on WORKSHOP_ORDER (PART1_ID);
