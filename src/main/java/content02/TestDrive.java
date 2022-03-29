package content02;

public class TestDrive {

    public static void main(String[] args) {

        TelescopeStarbucksSol1 telescopeStarbucksSol1 =
                new TelescopeStarbucksSol1("tall",true, "");

        JavaBeanStarbucksSol2 javaBeanStarbucksSol2 = new JavaBeanStarbucksSol2();
        javaBeanStarbucksSol2.setSüt("fazla");
        javaBeanStarbucksSol2.setYumusatıcı(true);

        BuilderStarbucksSol3 builderStarbucksSol3 =
                new BuilderStarbucksSol3.Builder("tall").laktozsuzTayfa("laktozsuz")
                        .yumuşakİçenler("asdcx").build();

    }
}
