alter table WORKSHOP_ORDER add constraint FK_WORKSHOP_ORDER_PART2 foreign key (PART2_ID) references WORKSHOP_SPARE_PART(ID);
create index IDX_WORKSHOP_ORDER_PART2 on WORKSHOP_ORDER (PART2_ID);
