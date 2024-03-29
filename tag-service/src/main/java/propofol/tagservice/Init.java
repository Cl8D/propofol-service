package propofol.tagservice;//package propofol.tagservice.api;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//import propofol.tagservice.domain.Tag;
//
//import javax.annotation.PostConstruct;
//import javax.persistence.EntityManager;
//
//@Component
//@RequiredArgsConstructor
//public class Init {
//    private final InitService initService;
//
//    @PostConstruct
//    public void init(){
//        initService.init();
//    }
//
//    @Component
//    @RequiredArgsConstructor
//    static class InitService{
//        private final EntityManager em;
//
//        @Transactional
//        public void init(){
//            em.persist(new Tag("ANSYS"));
//            em.persist(new Tag("ArcGIS"));
//            em.persist(new Tag("AutoCAD"));
//            em.persist(new Tag("Altibase"));
//            em.persist(new Tag("AWS Alexa"));
//            em.persist(new Tag("Ajax"));
//            em.persist(new Tag("Akamai"));
//            em.persist(new Tag("Algolia"));
//            em.persist(new Tag("AWS API Gateway"));
//            em.persist(new Tag("AWS CloudFront"));
//            em.persist(new Tag("AWS CloudWatch"));
//            em.persist(new Tag("AWS DynamoDB"));
//            em.persist(new Tag("AWS EC2"));
//            em.persist(new Tag("AWS RDS"));
//            em.persist(new Tag("AWS Redshift"));
//            em.persist(new Tag("AWS Route 53"));
//            em.persist(new Tag("AWS S3"));
//            em.persist(new Tag("Android"));
//            em.persist(new Tag("Angular.JS"));
//            em.persist(new Tag("Apache Aurora"));
//            em.persist(new Tag("Apache HTTP Server"));
//            em.persist(new Tag("Apache Maven"));
//            em.persist(new Tag("Babel"));
//            em.persist(new Tag("Big Data"));
//            em.persist(new Tag("Bower"));
//            em.persist(new Tag("Blockchain"));
//            em.persist(new Tag("Bootstrap"));
//            em.persist(new Tag("Beacon"));
//            em.persist(new Tag("C#"));
//            em.persist(new Tag("Capistrano"));
//            em.persist(new Tag("C++"));
//            em.persist(new Tag("CSS"));
//            em.persist(new Tag("CloudFare"));
//            em.persist(new Tag("COM+"));
//            em.persist(new Tag("Cobol"));
//            em.persist(new Tag("CodeIgniter"));
//            em.persist(new Tag("CentOS"));
//            em.persist(new Tag("COM"));
//            em.persist(new Tag("DDS"));
//            em.persist(new Tag("Data Analysis"));
//            em.persist(new Tag("Datadog"));
//            em.persist(new Tag("Deep Learning"));
//            em.persist(new Tag("Django"));
//            em.persist(new Tag("Docker"));
//            em.persist(new Tag("Database"));
//            em.persist(new Tag("Design Pattern"));
//            em.persist(new Tag("DevExpress"));
//            em.persist(new Tag("Db2"));
//            em.persist(new Tag("Ehcache"));
//            em.persist(new Tag("ElasticSearch"));
//            em.persist(new Tag("EmberJS"));
//            em.persist(new Tag("ESLint"));
//            em.persist(new Tag("ExpressJS"));
//            em.persist(new Tag("Electron"));
//            em.persist(new Tag("Esper"));
//            em.persist(new Tag("Erlang"));
//            em.persist(new Tag("Firebase"));
//            em.persist(new Tag("Flask"));
//            em.persist(new Tag("Flutter"));
//            em.persist(new Tag("FCS"));
//            em.persist(new Tag("Finatra"));
//            em.persist(new Tag("Finagle"));
//            em.persist(new Tag("Git"));
//            em.persist(new Tag("Github"));
//            em.persist(new Tag("GitLab"));
//            em.persist(new Tag("Go"));
//            em.persist(new Tag("Google Cloud Platform"));
//            em.persist(new Tag("Gradle"));
//            em.persist(new Tag("GraphQL"));
//            em.persist(new Tag("Grunt"));
//            em.persist(new Tag("Google Dialogflow"));
//            em.persist(new Tag("Google cloud Datastore"));
//            em.persist(new Tag("Grapevine"));
//            em.persist(new Tag("Google BigQuery"));
//            em.persist(new Tag("Google API"));
//            em.persist(new Tag("Google Maps API"));
//            em.persist(new Tag("HAProxy"));
//            em.persist(new Tag("Hibernate"));
//            em.persist(new Tag("HTML"));
//            em.persist(new Tag("HTML5"));
//            em.persist(new Tag("Handlebars.js"));
//            em.persist(new Tag("H2 database"));
//            em.persist(new Tag("Hyperledger"));
//            em.persist(new Tag("IOCP"));
//            em.persist(new Tag("IOS"));
//            em.persist(new Tag("IoT"));
//            em.persist(new Tag("Image processing"));
//            em.persist(new Tag("ITIL"));
//            em.persist(new Tag("IBM cloud"));
//            em.persist(new Tag("Java"));
//            em.persist(new Tag("Javascript"));
//            em.persist(new Tag("Jekyll"));
//            em.persist(new Tag("Jenkins"));
//            em.persist(new Tag("JQuery"));
//            em.persist(new Tag("Julia"));
//            em.persist(new Tag("JUnit"));
//            em.persist(new Tag("Jupyter"));
//            em.persist(new Tag("Java Persistence API"));
//            em.persist(new Tag("JDBC"));
//            em.persist(new Tag("JPA"));
//            em.persist(new Tag("Java Servlet"));
//            em.persist(new Tag("Google Firebase Performance Monitoring"));
//            em.persist(new Tag("Google Cloud FileStore"));
//            em.persist(new Tag("Apache Hadoop"));
//            em.persist(new Tag("Apache HBase"));
//            em.persist(new Tag("Google AI Hub"));
//            em.persist(new Tag("AWS Mobile Hub"));
//            em.persist(new Tag("Apache Hama"));
//            em.persist(new Tag("Apache Helix"));
//            em.persist(new Tag("Apache HttpComponents"));
//            em.persist(new Tag("Keras"));
//            em.persist(new Tag("Kotlin"));
//            em.persist(new Tag("Kubernetes"));
//            em.persist(new Tag("Kibana"));
//            em.persist(new Tag("AWS Key Management"));
//            em.persist(new Tag("Google Kubernetes Engine"));
//            em.persist(new Tag("Kendo UI"));
//            em.persist(new Tag("KoNLPy"));
//            em.persist(new Tag("Google Security Key Enforcement"));
//            em.persist(new Tag("Google Cloud Key Management Service"));
//            em.persist(new Tag("Apache Karaf"));
//            em.persist(new Tag("Apache Kibble"));
//            em.persist(new Tag("Apache Knox"));
//            em.persist(new Tag("Azure Kinect DK"));
//            em.persist(new Tag("Azure Kubernetes Service"));
//            em.persist(new Tag("Apache Kudu"));
//            em.persist(new Tag("Laravel"));
//            em.persist(new Tag("Linux"));
//            em.persist(new Tag("Lisp"));
//            em.persist(new Tag("Lua"));
//            em.persist(new Tag("AWS CLI"));
//            em.persist(new Tag("Logstash"));
//            em.persist(new Tag("Logback"));
//            em.persist(new Tag("Apache Lens"));
//            em.persist(new Tag("Google Cloud Deep Learning VM Image"));
//            em.persist(new Tag("MariaDB"));
//            em.persist(new Tag("MATLAB"));
//            em.persist(new Tag("Machine Learning"));
//            em.persist(new Tag("Memcached"));
//            em.persist(new Tag("XGBoost"));
//            em.persist(new Tag("XpressEngine"));
//            em.persist(new Tag("Xtest"));
//            em.persist(new Tag("Xplatform"));
//            em.persist(new Tag("Yarn"));
//            em.persist(new Tag("Apache Yetus"));
//            em.persist(new Tag("Yara"));
//            em.persist(new Tag("Yona"));
//            em.persist(new Tag("YOLO"));
//            em.persist(new Tag("Youtube Data API"));
//            em.persist(new Tag("Apache ZooKeeper"));
//            em.persist(new Tag("Zappa"));
//            em.persist(new Tag("ZeroMQ"));
//            em.persist(new Tag("ZEIT"));
//            em.persist(new Tag("Zeroboard"));
//            em.persist(new Tag("Zeplin"));
//            em.persist(new Tag("Zuul"));
//            em.persist(new Tag("Mesosphere"));
//            em.persist(new Tag("ZXing"));
//            em.persist(new Tag("MeteorJS"));
//            em.persist(new Tag("Microsoft Azure"));
//            em.persist(new Tag("Microsoft IIS"));
//            em.persist(new Tag("MMO"));
//            em.persist(new Tag("MSSQL (Microsoft SQL Server)"));
//            em.persist(new Tag("Mocha"));
//            em.persist(new Tag("MVC"));
//            em.persist(new Tag("MongoDB"));
//            em.persist(new Tag("MySQL"));
//            em.persist(new Tag("MFC"));
//            em.persist(new Tag("MSBuild"));
//            em.persist(new Tag("Machine Vision"));
//            em.persist(new Tag("NoSQL"));
//            em.persist(new Tag("Node.js"));
//            em.persist(new Tag("Next.js"));
//            em.persist(new Tag("Netlify"));
//            em.persist(new Tag("Google Cloud Natural Language"));
//            em.persist(new Tag("CNN (Convolution Neural Network)"));
//            em.persist(new Tag("Objective-C"));
//            em.persist(new Tag("OOP"));
//            em.persist(new Tag("OpenCV"));
//            em.persist(new Tag("OpenGL"));
//            em.persist(new Tag("WRF"));
//            em.persist(new Tag("WCF"));
//            em.persist(new Tag("Windows Forms"));
//            em.persist(new Tag("WDF"));
//            em.persist(new Tag("Wsgi"));
//            em.persist(new Tag("WordPress"));
//            em.persist(new Tag("WebRTC"));
//            em.persist(new Tag("Websocket"));
//            em.persist(new Tag("AWS WorkDocs"));
//            em.persist(new Tag("AWS Workspcaes"));
//            em.persist(new Tag("Xml"));
//            em.persist(new Tag("XAML"));
//            em.persist(new Tag("Apache XML Graphics"));
//            em.persist(new Tag("OAuth"));
//            em.persist(new Tag("Oracle"));
//            em.persist(new Tag("OpenCL"));
//            em.persist(new Tag("Pascal"));
//            em.persist(new Tag("PostgreSQL"));
//            em.persist(new Tag("Prolog"));
//            em.persist(new Tag("Python"));
//            em.persist(new Tag("PostCSS"));
//            em.persist(new Tag("Presto"));
//            em.persist(new Tag("Padrino"));
//            em.persist(new Tag("Qubicle"));
//            em.persist(new Tag("Querydsl"));
//            em.persist(new Tag("Quartz"));
//            em.persist(new Tag("AWS Simple Queue Service (AWS SQS)"));
//            em.persist(new Tag("Azure QnA Maker"));
//            em.persist(new Tag("Azure Queue Storage"));
//            em.persist(new Tag("QML"));
//            em.persist(new Tag("AWS QuickSight"));
//            em.persist(new Tag("Ubuntu"));
//            em.persist(new Tag("Unity"));
//            em.persist(new Tag("Unreal Engine"));
//            em.persist(new Tag("Semantic UI"));
//            em.persist(new Tag("UML"));
//            em.persist(new Tag("Unix"));
//            em.persist(new Tag("Urwid"));
//            em.persist(new Tag("UWP"));
//            em.persist(new Tag("Upbit API"));
//            em.persist(new Tag("UDP/IP"));
//            em.persist(new Tag("Udebug"));
//            em.persist(new Tag("Underscore.js"));
//            em.persist(new Tag("VB.NET"));
//            em.persist(new Tag("Visual Basic"));
//            em.persist(new Tag("VR"));
//            em.persist(new Tag("Vue.js"));
//            em.persist(new Tag("Vanilla JS"));
//            em.persist(new Tag("Vert.x"));
//            em.persist(new Tag("Vuex"));
//            em.persist(new Tag("Azure Computer Vision"));
//            em.persist(new Tag("WebGL"));
//            em.persist(new Tag("Windows Embedded"));
//            em.persist(new Tag("React Native"));
//            em.persist(new Tag("ReactJS"));
//            em.persist(new Tag("Redis"));
//            em.persist(new Tag("Redux.js"));
//            em.persist(new Tag("Require.JS"));
//            em.persist(new Tag("Ruby"));
//            em.persist(new Tag("Rust"));
//            em.persist(new Tag("RabbitMQ"));
//            em.persist(new Tag("RethinkDB"));
//            em.persist(new Tag("Raspberry PI"));
//            em.persist(new Tag("Redux-Saga"));
//            em.persist(new Tag("Spring cloud"));
//            em.persist(new Tag("Spring data jpa"));
//            em.persist(new Tag("Spring batch"));
//            em.persist(new Tag("Spring rest docs"));
//            em.persist(new Tag("T map API"));
//            em.persist(new Tag("Tensorflow"));
//            em.persist(new Tag("TypeScript"));
//            em.persist(new Tag("TKinter"));
//            em.persist(new Tag("Terraform"));
//            em.persist(new Tag("ThreeJS"));
//            em.persist(new Tag("Trello"));
//            em.persist(new Tag("RPG"));
//            em.persist(new Tag("STS"));
//            em.persist(new Tag("Scala"));
//            em.persist(new Tag("Scikit-Learn"));
//            em.persist(new Tag("Scratch"));
//            em.persist(new Tag("Selenium"));
//            em.persist(new Tag("Shell"));
//            em.persist(new Tag("Spring"));
//            em.persist(new Tag("Spring boot"));
//            em.persist(new Tag("SQL"));
//            em.persist(new Tag("SSO"));
//            em.persist(new Tag("Swift"));
//            em.persist(new Tag("SQLite"));
//            em.persist(new Tag("Solidity"));
//            em.persist(new Tag("SteamWorks"));
//
//            em.flush();
//            em.close();
//        }
//    }
//}
