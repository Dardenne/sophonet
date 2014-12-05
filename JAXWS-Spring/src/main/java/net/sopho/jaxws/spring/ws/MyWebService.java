package net.sopho.jaxws.spring.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import net.sopho.jaxws.spring.bo.MyObject;

@WebService(serviceName = "MyWebService")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL,
	parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class MyWebService {

    //Dependency Injection (DI) via Spring
    private MyObject myBObject;

    @WebMethod(exclude = true)
    public void setMyBObject(MyObject bObject) {
	this.myBObject = bObject;
    }

    @WebMethod(operationName = "printMessage")
    public String printMessage() {

	return myBObject.printMessage();

    }
}
