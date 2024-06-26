-- 서브쿼리
select
	category_code
from
	tbl_menu
where
	menu_name = '민트미역국';
    
select
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
from
	tbl_menu;
select
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
from
	tbl_menu
where
	category_code = 
    (select
		category_code
	from
		tbl_menu
	where
		menu_name = '민트미역국');
/* 서브쿼리(제일위에)에서 변경된 문구를 메인쿼리에
쓰여진 서브쿼리의 값이 자동으로 바뀐다.*/

select
	count(*) 'conut'
from
	tbl_menu
group by
	category_code;
    
select
	max(count)
from
	(select
		count(*) 'count'
	from
		tbl_menu
	group by
		category_code) as countmenu;
-- from절에 사용된 서브쿼리는 반드시 별칭(countmenu)이 있어야한다.

select
	avg(menu_price)
from
	tbl_menu
where
	category_code = 4;
-- 카테고리 코드 4번인 것들의 평균을 구한다.

/* 카테고리별 평균 가격보다 높은 가격의 메뉴 조회 */
select
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
from
	tbl_menu a
where
	menu_price > (
		select
			avg(menu_price)
		from
			tbl_menu
		where
			category_code = a.category_code);
-- where절 안에 서브 쿼리 사용

/* exists */
-- 조회 결과가 있을 때 true 아니면 false

-- 메뉴가 있는 카테고리 조회
select
	category_name
from
	tbl_category a
where exists (
	select 1
	from tbl_menu b
	where b.category_code = a.category_code)
order by 1;

/* cte(common table expressions)
파생테이블과 비슷한 개념이며 코드의 가독성과 재사용성을
위해 파생테이블 대신 사용하게된다.
from절에서만 사용 됨(join일 시 join 구문에서도 가능) */
with
	menucate as (
		select
			menu_name,
            category_name
		from
			tbl_menu a
		join
			tbl_category b on a.category_code = b.category_code
		)
select
	*
from
	menucate
order by
	menu_name;