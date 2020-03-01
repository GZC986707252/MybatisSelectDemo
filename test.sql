create table idcard
(
    id int(10) not null auto_increment,
    code varchar(18) collate utf8_unicode_ci default null,
    primary key(id)
);

create table user
(
    id int(10) not null,
    name varchar(20) collate utf8mb4_unicode_ci default null,
    age int(11) default null,
    idcard_id int(10) default null,
    primary key(id),
    key idcard_id (idcard_id),
    constraint idcard_id foreign key(idcard_id) references idcard(id)
);

create table orders
(
    id int(10) not null auto_increment,
    ordersn varchar(10) collate utf8mb4_unicode_ci default null,
    user_id int(10) default  null,
    primary key (id),
    key user_id (user_id),
    constraint user_id foreign key (user_id) references user(id)
);


create table orders_detail
(
    id int(10) not null auto_increment,
    order_id int(10) default null,
    product_id int(10) default null,
    primary key(id),
    key order_id (order_id),
    key product_id (product_id),
    constraint order_id foreign key (order_id) references orders(id),
    constraint product_id foreign key (product_id) references product(id)
);
