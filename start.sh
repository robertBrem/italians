docker stop italians && docker rm italians

docker run -d \
 --name italians \
 -p 8083:8080 \
 robertbrem/italians:0.0.1