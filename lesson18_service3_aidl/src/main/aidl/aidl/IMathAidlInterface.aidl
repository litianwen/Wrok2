// IMathAidlInterface.aidl
package aidl;
import aidl.User;
// Declare any non-default types here with import statements

interface IMathAidlInterface {


    int add(int i,int j);


    User login(inout User user); //使用用户名和密码登录，返回所有值
}
