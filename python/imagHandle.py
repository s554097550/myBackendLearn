from PIL import Image
im = Image.open('test.jpg')
print(im.format,im.size,im.mode)
im.thumbnail((100,100))
im.save('test_thumb.jpg','JPEG')