select * from teacher_posts 

inner join teacherpost_opencourses
ON teacher_posts.post_id = 	teacherpost_opencourses.teacher_post_entity_post_id 

inner join teacherpost_studentclasses
ON teacher_posts.post_id = 	teacherpost_studentclasses.teacher_post_entity_post_id 

inner join teacherpost_teachtypes
ON teacher_posts.post_id = 	teacherpost_teachtypes.teacher_post_entity_post_id 

inner join teacherpost_places
ON teacher_posts.post_id = 	teacherpost_places.teacher_post_entity_post_id 

;


