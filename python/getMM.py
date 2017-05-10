#!/usr/bin/python3.6
# -*- coding: utf-8 -*-  
import requests #导入requests
from bs4 import BeautifulSoup #BeautifulSoup导入
import os

headers = {'User-Agent':"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.1 (KHTML, like Gecko) Chrome/22.0.1207.1 Safari/537.1"}##浏览器请求头（大部分网站没有这个请求头会报错、请务必加上哦）
all_url = 'http://www.mzitu.com/all'  ##开始的URL地址
start_html = requests.get(all_url,headers=headers)
#print(start_html.text) #打印出start_html（注意，start_html.content是二进制数据，
                                            #一般用于获取图片，视频，影频这些二进制文件
                                            #打印网页用start_html.text就够了）
soup = BeautifulSoup(start_html.text,'lxml') #使用BeautifulSoup来解析我们获取的html网页
all_a = soup.find('div',class_='all').find_all('a') #获取class为all下的所有a连接。find为查找到第一个就停止了
                                                    #find_all是查找到最后一个。就像是jquery的next()/nextAll()

for a in all_a:
    title = a.get_text()
    print('开始采集'+title)
    path = str(title).strip()
    os.makedirs(os.path.join("D:\mzitu",path))
    os.chdir("D:\mzitu\\"+path)
    href = a['href']
    html = requests.get(href,headers=headers)
    html_soup = BeautifulSoup(html.text,'lxml')
    max_span = html_soup.find('div',class_='pagenavi').find_all('span')[-2].get_text()
    for page in range(1,int(max_span)+1):
        page_url = href+'/'+str(page)
        img_html = requests.get(page_url,headers=headers)
        img_soup = BeautifulSoup(img_html.text,'lxml')
        img_url = img_soup.find('div',class_='main-image').find('img')['src']
        name = img_url[-9:-4]
        img = requests.get(img_url,headers=headers)
        f = open(name+'.jpg','ab')
        f.write(img.content)
        f.close()
        
    
    
