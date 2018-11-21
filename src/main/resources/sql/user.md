findUserByName
===
*根据名称获取用户
select * from tb_user where name=#name#

findUserByCondition
===
select * from tb_user where 1=1
@if(!isEmpty(age)){
and age = #age#
@}
@if(!isEmpty(name)){
and name = #name#
@}