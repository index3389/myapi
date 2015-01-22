#!/bin/sh

read -p "请输入将要部署的ip(例如:10.4.18.171): " ip
read -p "请输入部署的分支名称(例如:develop): " branch
read -p "请输入部署的环境(例如:product|test): " env
read -p "请输入程序操作(例如:start|stop|restart): " handle
read -p "请输入用户名: " user

echo $ip $branch $env $handle $pull

myProject=.
rootDir=/opt/deploy
project=$rootDir/my-api
appName=bxr-api-$env-0.0.1.jar
jar_file=$myProject/target/$appName

cd $myProject
git checkout -B $branch
git pull origin $branch
mvn clean package -P${env}

scp $jar_file deploy/apiService.sh $user@$ip:$project/
ssh $user@$ip sh $project/apiService.sh $handle $project $appName
