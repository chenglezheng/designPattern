import com.clz.design.pattern.constructionPattern.adapter.classAdapter.Adapter;
import com.clz.design.pattern.constructionPattern.adapter.interfaceAdapter.SourceSub1;
import com.clz.design.pattern.constructionPattern.adapter.interfaceAdapter.SourceSub2;
import com.clz.design.pattern.constructionPattern.adapter.interfaceAdapter.Sourceable;
import com.clz.design.pattern.constructionPattern.adapter.objectAdapter.Source;
import com.clz.design.pattern.constructionPattern.adapter.objectAdapter.Wrapper;
import com.clz.design.pattern.constructionPattern.bridge.Bridge;
import com.clz.design.pattern.constructionPattern.bridge.MyBridge;
import com.clz.design.pattern.constructionPattern.bridge.Sourceable1;
import com.clz.design.pattern.constructionPattern.bridge.Sourceable2;
import com.clz.design.pattern.constructionPattern.composite.Tree;
import com.clz.design.pattern.constructionPattern.composite.TreeNode;
import com.clz.design.pattern.constructionPattern.decoration.Decorator;
import com.clz.design.pattern.constructionPattern.facade.Computer;
import com.clz.design.pattern.constructionPattern.proxy.Proxy;
import com.clz.design.pattern.establishPattern.abstractFactory.Provider;
import com.clz.design.pattern.establishPattern.abstractFactory.SendMailFactory;
import com.clz.design.pattern.establishPattern.builder.BuilderFactory;
import com.clz.design.pattern.establishPattern.factory.SendFactory;
import com.clz.design.pattern.establishPattern.factory.Sender;
import com.clz.design.pattern.establishPattern.singleton.SingleExcellentWithUpdate;
import com.clz.design.pattern.establishPattern.singleton.Singleton;
import com.clz.design.pattern.establishPattern.singleton.SingletonExcellent;
import org.junit.Test;

public class DesignPatternTest {

    /**
     * 工厂模式测试
     */
    @Test
    public void testFactory(){
        SendFactory sendFactory=new SendFactory();
        Sender sender=sendFactory.prducee("mail");
        sender.send();
        sender=sendFactory.prducee("sms");
        sender.send();
        /*sender=sendFactory.prducee("121");
        sender.Send();*/
        sender=sendFactory.produceMail();
        sender.send();
        sender=sendFactory.produceSms();
        sender.send();
        SendFactory.produceStaticMail().send();
        SendFactory.produceStaticSms().send();
    }

    /**
     * 抽象工厂模式测试
     */
    @Test
    public void testAbstractFactory(){
        Provider provider=new SendMailFactory();
        com.clz.design.pattern.establishPattern.abstractFactory.Sender
                sender= (com.clz.design.pattern.establishPattern.abstractFactory.Sender) provider.produce();
        sender.send();
    }

    /**
     * 建造者模式测试
     */
   @Test
    public void testBuilderFactory(){
       BuilderFactory builderFactory=new BuilderFactory();
       builderFactory.produceMailSender(10);
   }

    /**
     * 单例模式测试
     */
   @Test
    public void  testSingleton(){
       Singleton singleton=Singleton.getInstance();  //非线程安全
       SingletonExcellent singletonExcellent=SingletonExcellent.getInstance(); //线程安全
       SingleExcellentWithUpdate singleExcellentWithUpdate=SingleExcellentWithUpdate.getInstance(); //影子模式，更新单例属性对象
   }

   @Test
    public void testAdapter(){
       Adapter adapter=new Adapter();
       adapter.method1();
       adapter.method2();

       Source source=new Source();
       Wrapper wrapper=new Wrapper(source);
       wrapper.method1();
       wrapper.method2();

       Sourceable sourceable1=new SourceSub1();
       Sourceable sourceable2=new SourceSub2();
       sourceable1.method1();
       sourceable1.method2();
       sourceable2.method1();
       sourceable2.method2();

       /*类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，
       可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
       对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，
       可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
       接口的适配器模式：当不希望实现一个接口中所有的方法时，
       可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。*/
   }

   @Test
    public void testDecorate(){
       com.clz.design.pattern.constructionPattern.decoration.Sourceable sourceable= (com.clz.design.pattern.constructionPattern.decoration.Sourceable) new Source();
       com.clz.design.pattern.constructionPattern.decoration.Sourceable obj=new Decorator(sourceable);
       obj.method();
      /* 装饰器模式的应用场景：
       1、需要扩展一个类的功能。
       2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
       缺点：产生过多相似的对象，不易排错！*/
   }

   /*测试代理模式*/
   @Test
   public void testProxy(){
       com.clz.design.pattern.constructionPattern.proxy.Sourceable sourceable=new Proxy();
       sourceable.method();
   }


   /*测试外观模式*/
   @Test
    public void testFacade(){
       Computer computer=new Computer();
       computer.startup();
       computer.shutdown();
   }

    /*测试桥接模式*/
    @Test
    public void testBridge(){
        Bridge bridge=new MyBridge();

        /*调用第一个对象*/
        com.clz.design.pattern.constructionPattern.bridge.Sourceable sourceable=new Sourceable1();
        bridge.setSourceable(sourceable);
        bridge.method();

        /*调用第一个对象*/
        com.clz.design.pattern.constructionPattern.bridge.Sourceable sourceable2=new Sourceable2();
        bridge.setSourceable(sourceable2);
        bridge.method();
    }

    /*桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化，像我们常用的JDBC桥DriverManager一样，
    JDBC进行连接数据库的时候，在各个数据库之间进行切换，基本不需要动太多的代码，甚至丝毫不用动，
    原因就是JDBC提供统一接口，每个数据库提供各自的实现，用一个叫做数据库驱动的程序来桥接就行了。*/

    //测试组合模式
    @Test
    public void testCompostie(){
        //在TreeNode的main方法中测试
        //合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便
        //将多个对象组合在一起进行操作
    }

}
