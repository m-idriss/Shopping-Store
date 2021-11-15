FROM arm64v8/nginx:1.21.4-alpine
COPY /nginx/default.conf /etc/nginx/conf.d/
RUN rm -rf /usr/share/nginx/html/*
COPY dist/shop /usr/share/nginx/html
