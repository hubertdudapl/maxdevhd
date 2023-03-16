FROM  bitnami/nginx
 #RUN apt-get update && apt-get upgrade -y

 COPY my_server_block.conf /opt/bitnami/nginx/conf/server_blocks
 
 COPY mas-classes.zip /app

 EXPOSE 7755

 CMD ["nginx", "-g", "daemon off;"]