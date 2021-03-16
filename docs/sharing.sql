create table category
(
    id             int auto_increment comment 'ID'
        primary key,
    name           varchar(50) not null comment '分类名（英文）',
    name_cn        varchar(50) null comment '分类名（中文）',
    path           varchar(50) not null comment '对应分类路径',
    show_in_navbar tinyint(1)  not null comment '是否在导航栏展示（0：不展示，1：展示）',
    create_time    datetime    null comment '创建时间',
    update_time    datetime    null comment '更新时间',
    status         tinyint(1)  not null comment '状态（0：失效，1：有效）'
)
    DEFAULT CHARSET = utf8 comment '分类';

create table photo
(
    id          bigint unsigned auto_increment comment 'ID'
        primary key,
    category_id int          null comment '分类 ID',
    title       varchar(100) null comment '标题',
    `desc`      varchar(500) null comment '描述',
    path        varchar(500) not null comment '文件路径',
    create_time datetime     null comment '创建时间',
    update_time datetime     null comment '更新时间',
    status      tinyint(1)   not null comment '状态（0：失效，1：有效）'
)
    DEFAULT CHARSET = utf8 comment '照片';

