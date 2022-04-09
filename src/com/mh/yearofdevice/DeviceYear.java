package com.mh.yearofdevice;

import com.facebook.device.yearclass.YearClass;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;

public class DeviceYear extends AndroidNonvisibleComponent {

  public DeviceYear(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction
  public int DeviceYear(){
    int year = YearClass.get(form.getApplicationContext());
    return year;
  }
}
