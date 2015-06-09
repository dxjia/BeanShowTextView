# BeanShowTextView
show text one by one. <br>
逐字显示文字的一个TextView，使用handler定时sendEmptyMessageDelayed完成。<br>
非常简单，都不能算得上是一个库。

# Usage
via xml<br>
```xml
    <com.dxjia.beanshowing.library.BeanShowingTextView
        android:id="@+id/bean_test"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:text="This is a text for bean show!" />
```
via java code<br>
```java
     BeanShowingTextView mBeanShowTextView = (BeanShowingTextView) findViewById(R.id.bean_test);
     mBeanShowTextView.setText("test");
```
# ScreenShot
![image](https://github.com/dxjia/BeanShowTextView/blob/master/screenshot.gif)

# License
```
Copyright (C) 2015 dxjia

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
