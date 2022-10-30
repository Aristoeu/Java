package StandardScore;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.6174981309146284d), (-20617.70491827632d), 3325.4330485669584d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.199820329875534d + "'", double3 == 6.199820329875534d);
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(16979.992812919598d, (-7.957376315539241E-6d), 1.1517885680153465E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.474228282204198E10d + "'", double3 == 1.474228282204198E10d);
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.7213114754098355d), (-1321.0332618716707d), (-94607.25286096858d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.013924005935698557d) + "'", double3 == (-0.013924005935698557d));
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.010644913539679234d), 0.0016339285714285715d, 162772.69699750235d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.543551429449017E-8d) + "'", double3 == (-7.543551429449017E-8d));
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4836.99819182414d, (-0.13998227701084454d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.081212852733868d, (-0.005714285714285714d), 72.77859719385503d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06989592180374785d + "'", double3 == 0.06989592180374785d);
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.025371718504164222d), 203710.45534935882d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(791.2764751368901d, (-196.86320693956702d), (-12.057538907475166d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-81.95202102676626d) + "'", double3 == (-81.95202102676626d));
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) '4', (-99.70956268961719d), 0.0015511267324521702d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97806.0396456324d + "'", double3 == 97806.0396456324d);
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100, (-0.6527390014518221d), 1046.6286357600898d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.09616853157123405d + "'", double3 == 0.09616853157123405d);
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-0.047808065325613415d), (-0.008789022205749395d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.439520370575405d) + "'", double3 == (-5.439520370575405d));
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-855.4205352124766d), (-13.659944808043116d), (-5900332.769841715d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4266324006451166E-4d + "'", double3 == 1.4266324006451166E-4d);
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-50.17055488661449d), (-0.9714562908496731d), (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.9461365114570157d) + "'", double3 == (-0.9461365114570157d));
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.04456892170494916d, 38010.25819494771d, 2081.075077892601d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-18.264700793263554d) + "'", double3 == (-18.264700793263554d));
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5997.88850639995d, (-3.1608795582227505E-5d), 465146.84984962095d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.012894612830223024d + "'", double3 == 0.012894612830223024d);
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(465146.84984962095d, (-4.5920422856791114E-5d), (-9227.722631526587d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-50.407545660980695d) + "'", double3 == (-50.407545660980695d));
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.753743136477039d, 0.005141121230260358d, (-27.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.13774983309039368d) + "'", double3 == (-0.13774983309039368d));
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.010644913539679234d), 9520.692313357085d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9520.702958270625d) + "'", double3 == (-9520.702958270625d));
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.9118185305298744d, 131.4647556520893d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.083499824907562d, 68.33333333333334d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(93304.39105865342d, (-0.04582412771193874d), 0.15225896938846545d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 612800.9223859196d + "'", double3 == 612800.9223859196d);
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.5831170849805628E-5d), 0.0d, (-0.008046938651515831d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0019673532426922945d + "'", double3 == 0.0019673532426922945d);
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(22.628457922462168d, (-1.5831170849805628E-5d), 0.4851129400087209d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 46.64578469753089d + "'", double3 == 46.64578469753089d);
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(595.4193621384683d, (-0.6600153033134007d), 2.138675582324624d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 278.7142577248092d + "'", double3 == 278.7142577248092d);
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-601.7604818022787d), (-653.4214262971092d), 25.01838673699937d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0649190948203606d + "'", double3 == 2.0649190948203606d);
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.4192793605482405E8d), (-0.05729572789109639d), 1.0599135034971061d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.2259984882668483E8d) + "'", double3 == (-3.2259984882668483E8d));
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.03137934133093799d), 1.6681931311196593E-7d, (-17.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0018229999973003023d + "'", double3 == 0.0018229999973003023d);
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-36816.32715833758d), (-0.15847193644261548d), 1.4266324006451166E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.5806345537752432E8d) + "'", double3 == (-2.5806345537752432E8d));
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(599.7651782375282d, (-0.02357952454682086d), (-5.15695681635064E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.163067249003105E8d) + "'", double3 == (-1.163067249003105E8d));
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2729439708142521d), 84.45213259648938d, 1.9118381070872112d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-44.316030867481174d) + "'", double3 == (-44.316030867481174d));
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.15225896938846545d, 9.681947024916315d, (-0.004268766379812227d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2232.42201789151d + "'", double3 == 2232.42201789151d);
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.273266038932729d, (-10.491428571428573d), (-3.7931008323228093E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-41561.496272450415d) + "'", double3 == (-41561.496272450415d));
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-50.407545660980695d), (-3532.8464053416346d), (-27.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-127.9691388195903d) + "'", double3 == (-127.9691388195903d));
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(125529.76571116375d, (-0.28855900038211735d), (-0.28855900038211735d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-435023.874160688d) + "'", double3 == (-435023.874160688d));
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-14.777217294347949d), (-1.0100543270955753E7d), 9611.837475567056d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1050.8426218622233d + "'", double3 == 1050.8426218622233d);
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.5020705481508303d), (-0.01534717083845554d), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.34867233773123746d) + "'", double3 == (-0.34867233773123746d));
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-153.29942073470883d), (-9.449978071646475d), (-8.30230443750921d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 17.326447584017874d + "'", double3 == 17.326447584017874d);
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.9118381070872112d, (-12.057538907475166d), (-0.004719704291657331d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2959.7992059068197d) + "'", double3 == (-2959.7992059068197d));
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.084793700399203d, 3335.96438123599d, 9.818018633727817d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-339.3637465801493d) + "'", double3 == (-339.3637465801493d));
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.8752524071118676E-4d, (-1.5831170849805628E-5d), (-3.5020705481508303d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.806748001360767E-5d) + "'", double3 == (-5.806748001360767E-5d));
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5387626085229231d), 1.760854173120857d, (-31856.923773494596d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.218577656757598E-5d + "'", double3 == 7.218577656757598E-5d);
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 0, (-2959.7992059068197d), 59.552578146489715d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.700605717290564d + "'", double3 == 49.700605717290564d);
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.0d, 16.811315308380642d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-855.4205352124766d), 0.06630722343360997d, 1.9118381070872112d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-447.4682449652029d) + "'", double3 == (-447.4682449652029d));
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.025697295243334962d, 0.1405837852482137d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.18278989428235987d) + "'", double3 == (-0.18278989428235987d));
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.017574460359640873d, 24375.32745104039d, (-94.57434905081192d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 257.7370092548448d + "'", double3 == 257.7370092548448d);
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-74.91382257376331d), 16979.992812919598d, (-11.60305703182941d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1469.8632083517716d + "'", double3 == 1469.8632083517716d);
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5126.331674374675d, (-0.0026713611904894117d), 12.953457588734812d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 395.75027058366766d + "'", double3 == 395.75027058366766d);
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(15.793329548119049d, 0.00284193505237051d, (-0.492719128061608d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-32.04764482188377d) + "'", double3 == (-32.04764482188377d));
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3189912780877604d, 0.0d, (-163.95336996416071d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.008044917151602828d) + "'", double3 == (-0.008044917151602828d));
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-4.465365853658536d), 7.499925715596078E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 59538.801089360364d + "'", double3 == 59538.801089360364d);
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.587479427085652E-7d), 1000909.86017476d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.22398699524613494d), (-447.4682449652029d), 0.5379425299724522d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 831.3978409419682d + "'", double3 == 831.3978409419682d);
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 961.3970359880889d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.03790395662113255d, (-0.028595986065227025d), 15.14151383587133d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.004391895249523627d + "'", double3 == 0.004391895249523627d);
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(595.4193621384683d, 2.753675041129709E8d, 2.3496190917066646d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1719640415995845E8d) + "'", double3 == (-1.1719640415995845E8d));
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.015278681790882827d, (-163.95336996416071d), (-0.056591864232780474d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2897.3890658822615d) + "'", double3 == (-2897.3890658822615d));
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-17.469439687889192d), (-0.01534717083845554d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1138.2840441259614d) + "'", double3 == (-1138.2840441259614d));
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(46.34676267368015d, (-4.859744364937509d), 0.9118185305298744d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 56.158660220318865d + "'", double3 == 56.158660220318865d);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.4599001644111297E-10d, (-6.234767913021508E-7d), 10.006904238401965d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.231925143496529E-8d + "'", double3 == 6.231925143496529E-8d);
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.97271665616187d), (-0.05636670655498643d), (-7116507.983360336d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.908374108624884E-7d + "'", double3 == 6.908374108624884E-7d);
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-171.92101887315275d), 2.89345994471712E-5d, (-0.1363415853798087d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1260.9582566377621d + "'", double3 == 1260.9582566377621d);
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.474228282204198E10d, 0.04591987170694782d, (-3.8365163560519195d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.8426221743433523E9d) + "'", double3 == (-3.8426221743433523E9d));
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.1517885680153465E-6d, (-1.3186540337544608d), 0.07430549635937711d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 17.746401681584608d + "'", double3 == 17.746401681584608d);
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.3462883598823992E13d), 6.733333333333334d, (-1.4071387060023755d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.6674179665974676E13d + "'", double3 == 1.6674179665974676E13d);
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-81.95202102676626d), 0.0032785402170468036d, (-216.4416206660676d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.37864852108747754d + "'", double3 == 0.37864852108747754d);
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-50821.32290394331d), (-1.8768837570345962E9d), 213.07831205463037d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8808183.796906078d + "'", double3 == 8808183.796906078d);
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.135416666666667d, (-36717.982617732654d), (-0.26157790631375005d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-140379.27954953242d) + "'", double3 == (-140379.27954953242d));
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-411.7432728113756d), (-0.05672342154368765d), (-3647.7283598492904d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1128610764774275d + "'", double3 == 0.1128610764774275d);
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.7806835538443396E-8d, (-30022.485396605553d), (-1.1719640415995845E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.561724108503911E-4d) + "'", double3 == (-2.561724108503911E-4d));
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.587479427085652E-7d), 223589.88869996622d, 0.005978609982788297d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.739830652011312E7d) + "'", double3 == (-3.739830652011312E7d));
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-19.64194884052652d), 0.1852516396085581d, (-105.12487240829857d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.18860617878447877d + "'", double3 == 0.18860617878447877d);
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.4071387060023755d), (-44.316030867481174d), (-0.015973479995594054d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2686.258233854758d) + "'", double3 == (-2686.258233854758d));
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.1446576867922154d), (-0.1921715267680537d), (-0.5727365229100048d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.08295933308814714d) + "'", double3 == (-0.08295933308814714d));
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-3012.0898484574304d), 2485.10722964984d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.2120562897729945d + "'", double3 == 1.2120562897729945d);
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.06444874751764998d, 1413.3683407971002d, 2.0649190948203606d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-684.4354801089842d) + "'", double3 == (-684.4354801089842d));
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-196.27469186580916d), 185.41419335293355d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(34.16666666666667d, 142914.48465082634d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.9d), 864017.8193252782d, (-5.721082216921438E-10d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.5102365017054655E15d + "'", double3 == 1.5102365017054655E15d);
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.1059507740593383E-6d, 0.005141121230260358d, 16.723566459486438d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.073516221517825E-4d) + "'", double3 == (-3.073516221517825E-4d));
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.8365163560519195d), 0.0d, 9.9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.387526904651709d) + "'", double3 == (-0.387526904651709d));
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(71.61799922201182d, (-0.15010773598714786d), 0.0023457492850929374d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30594.960601322553d + "'", double3 == 30594.960601322553d);
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1987915654186478E-4d), 38010.25819494771d, (-2260427.644899097d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.016815516480078976d + "'", double3 == 0.016815516480078976d);
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.6600153033134007d), 5.28891613658762E8d, 0.06444874751764998d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.206390887176429E9d) + "'", double3 == (-8.206390887176429E9d));
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9105.932177423267d), 0.33593526285222397d, 1.4325933296457168E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.35649205133331E7d) + "'", double3 == (-6.35649205133331E7d));
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) -1, (-0.13998227701084454d), (-3144.743169398907d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.7347788886478163E-4d + "'", double3 == 2.7347788886478163E-4d);
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.263231850117096d, (-0.6527390014518221d), 168.5543027975198d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01729988972795197d + "'", double3 == 0.01729988972795197d);
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(397037.78437912045d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.03430050119057761d), (double) 100.0f, 25458.87965250162d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.003929249906775104d) + "'", double3 == (-0.003929249906775104d));
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.474228282204198E10d, (-53.178161845656376d), (-27.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.417344911978487E8d) + "'", double3 == (-5.417344911978487E8d));
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.09722222222222221d), 17.746401681584608d, 28.56079092674287d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.6247594455480912d) + "'", double3 == (-0.6247594455480912d));
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-339.3637465801493d), (-7.993490166556919E15d), 0.002182743530206641d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.662129817789373E18d + "'", double3 == 3.662129817789373E18d);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-232260.55752452716d), (-0.005714285714285714d), (-17.783989825804095d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 13060.092481229245d + "'", double3 == 13060.092481229245d);
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(26.075599609358164d, (-9520.702958270625d), (-56446.19464108165d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.16913059628880311d) + "'", double3 == (-0.16913059628880311d));
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-20.251023116279637d), 0.0452656794425087d, 2.9233794304743282E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-694274.8718878754d) + "'", double3 == (-694274.8718878754d));
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.6656266955699158d, (-684.4354801089842d), 125.52511591592129d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.4578806942783125d + "'", double3 == 5.4578806942783125d);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.012861186212075172d), 1260.9582566377621d, (-2686.258233854758d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4694154500606188d + "'", double3 == 0.4694154500606188d);
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2176.404460537546d, 46.34676267368015d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.4192793605482405E8d), (-0.1525255461339563d), (-717.351836035973d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 476653.04349364195d + "'", double3 == 476653.04349364195d);
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 59.552578146489715d, 0.8878201595235209d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-67.07729882868468d) + "'", double3 == (-67.07729882868468d));
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(22.628457922462168d, (-56.98276689365725d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) 0, 7.499925715596078E-5d, 0.32571822743541134d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.302580907015185E-4d) + "'", double3 == (-2.302580907015185E-4d));
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-94607.25286096858d), (-2299.0769252473447d), (-71.4347613908908d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1292.2024815147233d + "'", double3 == 1292.2024815147233d);
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.302580907015185E-4d), 0.0d, 476653.04349364195d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.830727378007184E-10d) + "'", double3 == (-4.830727378007184E-10d));
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(26.075599609358164d, Double.NEGATIVE_INFINITY, 85.14070865971769d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3012.0898484574304d), (-48.56521324652172d), (-400.2869205463187d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.403501046614858d + "'", double3 == 7.403501046614858d);
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.285714285714286d, (-0.037321193336271166d), (-8.1811134720201d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.2618130177947d) + "'", double3 == (-1.2618130177947d));
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.3496190917066646d, 0.005141121230260358d, (-36717.982617732654d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.385094722889697E-5d) + "'", double3 == (-6.385094722889697E-5d));
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.6101172237222836d, (-0.18278989428235987d), (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03792907118004643d + "'", double3 == 0.03792907118004643d);
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1000909.86017476d, (-0.005129344935279409d), 125529.76571116375d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.973486285373436d + "'", double3 == 7.973486285373436d);
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(50.492714018919415d, (-112.57965019863204d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(22913.90558322626d, 0.28485144954940284d, (-73557.70987558049d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.31150535777329197d) + "'", double3 == (-0.31150535777329197d));
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.002609834244060252d, Double.NEGATIVE_INFINITY, 1413.3683407971002d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9316.35136841457d, 46645.53242972464d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0d), (-71.4347613908908d), (-3.739830652011312E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.8833676694160043E-6d) + "'", double3 == (-1.8833676694160043E-6d));
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(599.7651782375282d, (-49.17055488661449d), (-0.20980700448575385d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3093.012717638825d) + "'", double3 == (-3093.012717638825d));
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1115.123854893759d), (-866.3339659824051d), 576.4304228548518d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.43160436896995724d) + "'", double3 == (-0.43160436896995724d));
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.753675041129709E8d, (-26406.993606320168d), (-7.957376315539241E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.460863231625546E13d) + "'", double3 == (-3.460863231625546E13d));
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 1.6451240016813788d, (-99212.66715592718d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.6581793926533862E-5d + "'", double3 == 1.6581793926533862E-5d);
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3189912780877604d, 10.028571428571428d, (-0.03137934133093799d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 277.5577746718535d + "'", double3 == 277.5577746718535d);
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1753.0335108122406d, 10.006904238401965d, 21.27789925075722d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 81.91723186732399d + "'", double3 == 81.91723186732399d);
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.12150050300469178d, 76.42112965228029d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0015898810127189268d) + "'", double3 == (-0.0015898810127189268d));
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.037321193336271166d), 0.10767296306181094d, 24.851043877147877d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.005834529813510712d) + "'", double3 == (-0.005834529813510712d));
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 0.0f, (double) (short) 0, 8.81084214573422E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(131.4647556520893d, (-1.0087742059352795E7d), (-4.027936507936508d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2504476.7970477305d) + "'", double3 == (-2504476.7970477305d));
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-517.550204162918d), 0.0019673532426922945d, (-0.6174981309146284d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 838.1437053899591d + "'", double3 == 838.1437053899591d);
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.168353752547599d), (-0.08295933308814714d), 0.6656266955699158d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-13.64938407658132d) + "'", double3 == (-13.64938407658132d));
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(42.40967615841203d, 2.3642492621684885E-4d, 2.1639100219545377d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 19.59852272192897d + "'", double3 == 19.59852272192897d);
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.004391895249523627d, 0.9764516704652357d, 6.472826932117897E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1501.754620369026d) + "'", double3 == (-1501.754620369026d));
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.004673611336567765d), (-0.005584544177643519d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.025371718504164222d), 1.9554042867703132d, 24.449669813176985d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.08101442761435378d) + "'", double3 == (-0.08101442761435378d));
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9105.932177423267d), 1.6674179665974676E13d, (-6.234767913021508E-7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.6743865862682817E19d + "'", double3 == 2.6743865862682817E19d);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(953.6363634384901d, (-6.812158732714832E-5d), (-190.41098095896922d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.008305859028016d) + "'", double3 == (-5.008305859028016d));
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.387526904651709d), 0.0d, (-112.57965019863204d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.003442246480318322d + "'", double3 == 0.003442246480318322d);
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.9292419531570836d, 30022.548093205085d, 0.8362499952866399d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-35900.29180324417d) + "'", double3 == (-35900.29180324417d));
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-51.64639858342376d), (-0.09865590851564983d), 11089.914183574241d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0046481642528179105d) + "'", double3 == (-0.0046481642528179105d));
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 1, 131.4647556520893d, 2309.7573905377603d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0564841814930677d) + "'", double3 == (-0.0564841814930677d));
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.2618130177947d), 0.9292419531570836d, 49.700605717290564d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.044085075812054494d) + "'", double3 == (-0.044085075812054494d));
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(30.431142272710556d, 2.1639100219545377d, (-137.481191005291d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.2056079965852794d) + "'", double3 == (-0.2056079965852794d));
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.7662607002774456d, 17.071702602005715d, 1.0173792530493562d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-16.026906242540846d) + "'", double3 == (-16.026906242540846d));
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.0921455421803116E-5d, 0.04160688665710186d, 1147713.356304015d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.6242468533808546E-8d) + "'", double3 == (-3.6242468533808546E-8d));
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.1783738876319942d), (-0.5649782107488386d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.79862889834898d, 244.49669813176985d, 68.33333333333334d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.4931424765866463d) + "'", double3 == (-3.4931424765866463d));
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.4467164732553828E-4d), (-3080.7231536915333d), (-0.04799920498346337d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-64182.79240419197d) + "'", double3 == (-64182.79240419197d));
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0737847753545197d), (double) (-1L), 6.310598231883354d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14677138214344188d + "'", double3 == 0.14677138214344188d);
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(13.439970251589838d, (-137.481191005291d), 0.5313323016898746d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 284.04288761832095d + "'", double3 == 284.04288761832095d);
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(588.5635443720768d, (-2840.4091094178507d), 0.012894612830223024d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 265922.8856994398d + "'", double3 == 265922.8856994398d);
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0029268292682926825d, (-0.046785698335864295d), (-5.435269469819528d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.009146285732509897d) + "'", double3 == (-0.009146285732509897d));
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 790223.0071615296d, (-3.7931008323228093E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.08331663747946E9d + "'", double3 == 2.08331663747946E9d);
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.4931424765866463d), (-631.7732991932455d), 92.56364379175143d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.7875477993298965d + "'", double3 == 6.7875477993298965d);
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-243.73163541018437d), (-60.536079301173494d), (-0.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.27096727177068d), (double) 10.0f, (-0.16913059628880311d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 66.64061689065804d + "'", double3 == 66.64061689065804d);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.2521480669283976E-6d), (-1.2521480669283976E-6d), 0.20992462917425397d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2900.5607116403717d, 59.552578146489715d, 0.20992462917425397d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 13533.46743861875d + "'", double3 == 13533.46743861875d);
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.6949686296169904d), 0.14677138214344188d, (-3.0931547619047617d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9187189877335759d + "'", double3 == 0.9187189877335759d);
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(54.71206935067825d, 9.999836607142857d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.4851129400087209d, 0.1852516396085581d, (-0.013924005935698557d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-21.53556252309361d) + "'", double3 == (-21.53556252309361d));
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.02357952454682086d), (-24925.365853658535d), 0.0024536239201452753d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0158583012452127E7d + "'", double3 == 1.0158583012452127E7d);
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-28.21311475409836d), (-0.9d), 0.1526315789473684d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-178.94799321650655d) + "'", double3 == (-178.94799321650655d));
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9520.692313357085d, (-5.2978206743815415d), (-0.015973479995594054d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-596362.8549733063d) + "'", double3 == (-596362.8549733063d));
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.906825088732021d, (-0.1525255461339563d), (-2299.0769252473447d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.607721573961723E-4d) + "'", double3 == (-4.607721573961723E-4d));
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3142124542124545d, 831.3978409419682d, 0.01349526848583852d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-61509.23409629216d) + "'", double3 == (-61509.23409629216d));
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-49.17055488661449d), 0.0d, (-8.1811134720201d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.010252156357536d + "'", double3 == 6.010252156357536d);
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-611.250491851009d), (-3980.65074896532d), (-0.5727365229100048d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5882.984797258602d) + "'", double3 == (-5882.984797258602d));
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-26.08692184267441d), (-0.003392245521890975d), 111.88477646529707d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.23312849541459077d) + "'", double3 == (-0.23312849541459077d));
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-50821.32290394331d), 1.3189912780877604d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-50822.6418952214d) + "'", double3 == (-50822.6418952214d));
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-62379.381928932686d), (-2840.4091094178507d), 18.356021444943778d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3243.5663140889947d) + "'", double3 == (-3243.5663140889947d));
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-677427.3042814778d), (-24.240738918625162d), (-21.223577551332923d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 31917.477715721667d + "'", double3 == 31917.477715721667d);
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-243.73163541018437d), 1.1878670146154202d, (-4637.148358735402d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.05281683558030303d + "'", double3 == 0.05281683558030303d);
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2897.3890658822615d), 1154.7149998702048d, (-631.7732991932455d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.413857741260789d + "'", double3 == 6.413857741260789d);
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.02d, (-1.8929671162328545d), (-20.319684608805325d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.09414354371444772d) + "'", double3 == (-0.09414354371444772d));
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.5379425299724522d, 223589.88869996622d, 2081.075077892601d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-107.43934860046176d) + "'", double3 == (-107.43934860046176d));
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.011234997999734608d), (-5.588504832975711d), 0.8362499952866399d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.669381006171804d + "'", double3 == 6.669381006171804d);
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.0d, 1.0921455421803116E-5d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 71.61799922201182d, 25.01838673699937d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.8626146032068838d) + "'", double3 == (-2.8626146032068838d));
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-35900.29180324417d), (-232260.55752452716d), (-3.7931008323228093E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.176774211958831E8d) + "'", double3 == (-5.176774211958831E8d));
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(15.793329548119049d, 3.662129817789373E18d, 0.12582570479630809d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.9104782871812895E19d) + "'", double3 == (-2.9104782871812895E19d));
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-611.250491851009d), (-0.5434642561268097d), (-694274.8718878754d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.7963291244323E-4d + "'", double3 == 8.7963291244323E-4d);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.007519544840997297d, (-0.6600153033134007d), (-0.7898696145124717d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.8451203032622264d) + "'", double3 == (-0.8451203032622264d));
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-30022.485396605553d), (-1138.2840441259614d), (-1.1719640415995845E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.4645979165927533E-4d + "'", double3 == 2.4645979165927533E-4d);
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(19.59852272192897d, (-0.013924005935698557d), (-10069.896224516728d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0019476314641768719d) + "'", double3 == (-0.0019476314641768719d));
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1291662100956973d, (-3.2259984882668483E8d), 0.0029255559974682515d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.1026958610090727E11d + "'", double3 == 1.1026958610090727E11d);
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1961.506159005122d), 0.06630722343360997d, (-25.511004471706944d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 76.89122819150627d + "'", double3 == 76.89122819150627d);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(85.14070865971769d, (double) ' ', 0.0018229999973003023d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 29150.14193001331d + "'", double3 == 29150.14193001331d);
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(31917.477715721667d, 0.03178106204069363d, (-14.777217294347949d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2159.909088355055d) + "'", double3 == (-2159.909088355055d));
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.4694154500606188d, (-373.8995556680519d), 0.0016339285714285715d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 229121.9932526153d + "'", double3 == 229121.9932526153d);
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.2491203062324345d), (-3.6242468533808546E-8d), (-6.736273757317035d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7792320293230807d + "'", double3 == 0.7792320293230807d);
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.7806835538443396E-8d, 287035.54962783895d, 0.0014412669839387155d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.9915501626449266E8d) + "'", double3 == (-1.9915501626449266E8d));
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0036780564517846265d, 0.1d, 0.1d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.9632194354821538d) + "'", double3 == (-0.9632194354821538d));
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(30594.960601322553d, 52.55596729571826d, (-4.5920422856791114E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.651159273789213E8d) + "'", double3 == (-6.651159273789213E8d));
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.753675041129709E8d, 2392.665682152357d, (-1501.754620369026d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-183362.25353488396d) + "'", double3 == (-183362.25353488396d));
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.16449752507649265d), 29150.14193001331d, (-163.95336996416071d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 177.7963236370834d + "'", double3 == 177.7963236370834d);
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.08576417320182057d), 3.895630454685881d, 56.158660220318865d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.07089547030267625d) + "'", double3 == (-0.07089547030267625d));
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.28855900038211735d), 57.539872235017945d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5782843123540006d) + "'", double3 == (-0.5782843123540006d));
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.07355840702238403d), (-78.77523939134471d), 0.1405837852482137d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 559.8204717945758d + "'", double3 == 559.8204717945758d);
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 1.760854173120857d, 0.01146206392065246d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-153.6245291694921d) + "'", double3 == (-153.6245291694921d));
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.5920422856791114E-5d), (-0.012861186212075172d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.327453864569369d), 0.485062117001907d, (-1.0985766771596108d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.4704140920127693d + "'", double3 == 3.4704140920127693d);
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.9187189877335759d, (-0.047808065325613415d), (-2686.258233854758d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.5980422167835707E-4d) + "'", double3 == (-3.5980422167835707E-4d));
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.357325234240991d), 0.0017132848741286434d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.005714285714285714d), (-622.7364595859364d), 24.851043877147877d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.058534698933222d + "'", double3 == 25.058534698933222d);
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-51.64639858342376d), (-0.06634316602523686d), 4.084793700399203d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-12.627334254936217d) + "'", double3 == (-12.627334254936217d));
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.3496190917066646d, 7.973486285373436d, 0.18860617878447877d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-29.818043236500717d) + "'", double3 == (-29.818043236500717d));
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.006904238401965d, 203710.45534935882d, (-7.820594347784853d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 26046.671056761512d + "'", double3 == 26046.671056761512d);
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.09865590851564983d), 8595.796240032754d, 3.662129817789373E18d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.3472392633885765E-15d) + "'", double3 == (-2.3472392633885765E-15d));
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5678.678064360523d, (-2.4279878645578637E-5d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.35649205133331E7d), 6.310598231883354d, 2081.075077892601d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-30544.27372620324d) + "'", double3 == (-30544.27372620324d));
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.008044917151602828d), 3.4704140920127693d, (-0.019197041519533612d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 181.1976603595365d + "'", double3 == 181.1976603595365d);
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.4817151066253044d), 5886.953471402866d, 2.9233794304743282E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.013914145094137E8d) + "'", double3 == (-2.013914145094137E8d));
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.061156423001374d, (-0.16449752507649265d), (-7122.93809493948d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.5285441275553774E-4d) + "'", double3 == (-4.5285441275553774E-4d));
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) '4', (-8.206390887176429E9d), 6.010252156357536d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3653987762386734E9d + "'", double3 == 1.3653987762386734E9d);
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.2978206743815415d), Double.NaN, (-3144.743169398907d));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-373.8995556680519d), 3163.887346055446d, (-3.327453864569369d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1063.211405992356d + "'", double3 == 1063.211405992356d);
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.85125159414909E-4d), 0.9292419531570836d, (-21.223577551332923d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04380633171140876d + "'", double3 == 0.04380633171140876d);
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.298232900384636d, (-0.9632194354821538d), 2347.155566344006d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0035197719547558812d + "'", double3 == 0.0035197719547558812d);
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-16676.499024060642d), (-1138.2840441259614d), (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1553.821497993468d) + "'", double3 == (-1553.821497993468d));
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.736273757317035d), 6.472826932117897E-4d, 4.462338981444688d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.509728657554644d) + "'", double3 == (-1.509728657554644d));
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(181.1976603595365d, 6.472826932117897E-4d, (-0.17859974514930188d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1014.5423943655138d) + "'", double3 == (-1014.5423943655138d));
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(148.6539684449339d, 14.444541589784027d, (-139.36240834642797d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.9630245949935884d) + "'", double3 == (-0.9630245949935884d));
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.06269659953161594d, 25458.87965250162d, (-94607.25286096858d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.2691000550805069d + "'", double3 == 0.2691000550805069d);
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(100.0d, (-31559.786016838494d), (-94607.25286096858d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.33464438570438754d) + "'", double3 == (-0.33464438570438754d));
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.8932635507964994d), 0.9764516704652357d, (-25.511004471706944d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.07329053716153547d + "'", double3 == 0.07329053716153547d);
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.1026958610090727E11d, (-2159.909088355055d), 23.026151447024002d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.788884869211093E9d + "'", double3 == 4.788884869211093E9d);
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-232260.55752452716d), (-1.9899495607422277E-4d), (-5.2491203062324345d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 44247.520303499696d + "'", double3 == 44247.520303499696d);
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.21319582721798d, (-153.6245291694921d), (-3.966919877862873d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-40.54473746602599d) + "'", double3 == (-40.54473746602599d));
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7183.620461572214d), 1413.3683407971002d, 24375.32745104039d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.3526922384791338d) + "'", double3 == (-0.3526922384791338d));
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2309.7573905377603d, (-8588.49800713237d), (-18.178161845656373d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-599.5246103650596d) + "'", double3 == (-599.5246103650596d));
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9520.702958270625d), 9.455277418787318d, 0.005938246930557758d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1604877.3901011017d) + "'", double3 == (-1604877.3901011017d));
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.1948118355058969E-5d, 0.5243078950544022d, (-2.561724108503911E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2046.6526633199571d + "'", double3 == 2046.6526633199571d);
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.01321763479444169d, 17.326447584017874d, (-0.04582412771193874d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 377.81908382541343d + "'", double3 == 377.81908382541343d);
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(284.04288761832095d, (-0.03303629169296696d), 0.4694154500606188d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 605.1695228040093d + "'", double3 == 605.1695228040093d);
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(838.1437053899591d, 1.6451240016813788d, (-21777.583427379985d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.03841099193478857d) + "'", double3 == (-0.03841099193478857d));
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.9915501626449266E8d), 0.0d, (-0.09137094436930399d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.1796318035145392E9d + "'", double3 == 2.1796318035145392E9d);
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4836.99819182414d, (-373.8995556680519d), 1.0173792530493562d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5121.883242530989d + "'", double3 == 5121.883242530989d);
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.08576417320182057d), (-918.453064571191d), (-6.583223394584583d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-139.5011600477429d) + "'", double3 == (-139.5011600477429d));
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(17.807841915085817d, 265922.8856994398d, 38.47058958622179d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6911.905450826736d) + "'", double3 == (-6911.905450826736d));
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-140379.27954953242d), (-2.151817791815755d), (-70583.59990317124d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.988806577226357d + "'", double3 == 1.988806577226357d);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(14.267015677794571d, 0.0016339285714285715d, (-0.06634316602523686d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-215.02413291214665d) + "'", double3 == (-215.02413291214665d));
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.004719704291657331d), (-0.8451203032622264d), (-2840.4091094178507d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.958730825725353E-4d) + "'", double3 == (-2.958730825725353E-4d));
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.7347788886478163E-4d, (-378.760498737663d), 2.3496190917066646d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 161.2009255255225d + "'", double3 == 161.2009255255225d);
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(26.354327384894013d, 12.166944436037914d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(179.4136678795534d, 6.472826932117897E-4d, 2.9233794304743282E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6137178.729746683d + "'", double3 == 6137178.729746683d);
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(72.77859719385503d, (-4.5285441275553774E-4d), (-16719.06947781108d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.004353056259791097d) + "'", double3 == (-0.004353056259791097d));
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(52.55596729571826d, 26046.671056761512d, 5.7049771730371326E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.5563924799417606E-4d) + "'", double3 == (-4.5563924799417606E-4d));
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-58.13506877150787d), 62.23051424857837d, (-31856.923773494596d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0037783178274178523d + "'", double3 == 0.0037783178274178523d);
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.32571822743541134d, (-0.005834529813510712d), (-0.492719128061608d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.6729041727145324d) + "'", double3 == (-0.6729041727145324d));
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0100543270955753E7d), 18970.42714396637d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.011951369809972E7d) + "'", double3 == (-1.011951369809972E7d));
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-22.862368511464002d), (-0.5649782107488386d), 0.906825088732021d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-24.58841355160647d) + "'", double3 == (-24.58841355160647d));
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3335.96438123599d, (-5592.441403851674d), (-0.9714562908496731d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9190.743700139648d) + "'", double3 == (-9190.743700139648d));
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-215.02413291214665d), 17.746401681584608d, (-0.5857718390563034d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 397.37406115106495d + "'", double3 == 397.37406115106495d);
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.5920422856791114E-5d), 62.23051424857837d, (-0.008789022205749395d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7080.487307028615d + "'", double3 == 7080.487307028615d);
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.0d, (-0.5727365229100048d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.7662607002774456d, (-0.02047435439772061d), (-202.14142258157375d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.003892003156145203d) + "'", double3 == (-0.003892003156145203d));
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.4817151066253044d), (-4.1794108969975924E8d), 1.6681931311196593E-7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.505351936903913E15d + "'", double3 == 2.505351936903913E15d);
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-184.25216526275173d), 0.07581370290688234d, 3.453426257781344d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-53.37539162746745d) + "'", double3 == (-53.37539162746745d));
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(12774.153009464499d, 6.829367844867088d, (-139.36240834642797d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-91.61239241706083d) + "'", double3 == (-91.61239241706083d));
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(59538.801089360364d, 3.3357441478551286d, (-14.777217294347949d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4028.868504761304d) + "'", double3 == (-4028.868504761304d));
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.000286391437786d), 0.8629477722543778d, 6.351409346550463d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.2933575938864831d) + "'", double3 == (-0.2933575938864831d));
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(21.27789925075722d, (-1014.5423943655138d), (-4.5920422856791114E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.255685442720362E7d) + "'", double3 == (-2.255685442720362E7d));
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.041836835908971234d), (-26.15665278012303d), (-0.492719128061608d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-53.00142506533407d) + "'", double3 == (-53.00142506533407d));
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0019476314641768719d), (-50821.32290394331d), 17.807841915085817d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2853.87309695617d + "'", double3 == 2853.87309695617d);
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-190.41098095896922d), 0.04380633171140876d, 0.005159774436090226d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-36911.45604322116d) + "'", double3 == (-36911.45604322116d));
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.33464438570438754d), 0.0d, 157742.8413187583d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.1214552933540486E-6d) + "'", double3 == (-2.1214552933540486E-6d));
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9105.932177423267d), 0.0024375564009978695d, (-447.4682449652029d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.34990128894573d + "'", double3 == 20.34990128894573d);
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-31856.923773494596d), 2.505351936903913E15d, 1.1517885680153465E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.1751838892208806E21d) + "'", double3 == (-2.1751838892208806E21d));
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.583978433521822E-5d), (-0.7371758664955071d), 953.6363634384901d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.729781025267267E-4d + "'", double3 == 7.729781025267267E-4d);
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.44989714344586235d, (-0.08576417320182057d), 474.2632874824059d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0011294597975129053d + "'", double3 == 0.0011294597975129053d);
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-611.250491851009d), (-15.4449034606291d), (-3012.0898484574304d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.19780471976807312d + "'", double3 == 0.19780471976807312d);
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0032785402170468036d, 58.58234368006642d, 0.005445821671331467d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-10756.69911268453d) + "'", double3 == (-10756.69911268453d));
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(125.52511591592129d, (-1.3186540337544608d), (-153.6245291694921d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.8256739378496681d) + "'", double3 == (-0.8256739378496681d));
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.4645979165927533E-4d, 424388.5246618761d, 13533.46743861875d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-31.358447222800585d) + "'", double3 == (-31.358447222800585d));
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.8362499952866399d, (-0.5086896265246781d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.1283590586398613E8d), 397.37406115106495d, 2.7567898564924915d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.4975254724830773E8d) + "'", double3 == (-1.4975254724830773E8d));
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(104.39867431758901d, (-196.27469186580916d), (-3.455366112240529d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-87.01635555152085d) + "'", double3 == (-87.01635555152085d));
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.7931008323228093E-4d), 6.231925143496529E-8d, (-2.6949686296169904d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.407706191138976E-4d + "'", double3 == 1.407706191138976E-4d);
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-26.08692184267441d), (-1.8768837570345962E9d), 612800.9223859196d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3062.7952119263973d + "'", double3 == 3062.7952119263973d);
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.005141121230260358d, (-1.2618130177947d), (-0.6174981309146284d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.051753803931954d) + "'", double3 == (-2.051753803931954d));
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-273.47492579646894d), (-580.0218579234972d), (-2.255685442720362E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.3589968101107747E-5d) + "'", double3 == (-1.3589968101107747E-5d));
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.818018633727817d, 0.07581370290688234d, 131.4647556520893d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.07410507008131427d + "'", double3 == 0.07410507008131427d);
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.037321193336271166d), (-1209.3780841486393d), 0.0011294597975129053d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1070724.930288176d + "'", double3 == 1070724.930288176d);
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5604.062084800248d, 397.37406115106495d, (-0.05672342154368765d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-91790.79614650995d) + "'", double3 == (-91790.79614650995d));
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.06634316602523686d), 6.829367844867088d, (-3000.5621395231774d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0022981397119101587d + "'", double3 == 0.0022981397119101587d);
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2270553277265517d), 2900.5607116403717d, (-0.7371758664955071d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3935.0009933969777d + "'", double3 == 3935.0009933969777d);
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.1811134720201d), 1147713.356304015d, 0.32571822743541134d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3523663.8319391436d) + "'", double3 == (-3523663.8319391436d));
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(229121.9932526153d, (-41561.496272450415d), (-18.87433095138013d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-14341.355474922026d) + "'", double3 == (-14341.355474922026d));
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(588.5635443720768d, (-2247.4992407486698d), 13060.092481229245d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.21715487767004005d + "'", double3 == 0.21715487767004005d);
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8586.388369914019d), 25.058534698933222d, 0.0017132848741286434d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5026278.486811852d) + "'", double3 == (-5026278.486811852d));
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.1796318035145392E9d, 0.0d, (-207.00456697639197d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0529389932556983E7d) + "'", double3 == (-1.0529389932556983E7d));
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7.820594347784853d), (-1501.754620369026d), 132.93978337338487d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11.237674593054386d + "'", double3 == 11.237674593054386d);
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.008789022205749395d), 219.99473074203414d, 76.42112965228029d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.87883103488873d) + "'", double3 == (-2.87883103488873d));
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.07089547030267625d), 24.449669813176985d, (-36911.45604322116d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.643077221003559E-4d + "'", double3 == 6.643077221003559E-4d);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.09414354371444772d), 0.10594565495853255d, (-611.250491851009d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.2734402890550405E-4d + "'", double3 == 3.2734402890550405E-4d);
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.004391895249523627d, 0.0029268292682926825d, 0.005995007607412941d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.2443810045243917d + "'", double3 == 0.2443810045243917d);
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5997.88850639995d, 16.811315308380642d, (-0.0020064545047003323d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2980918.4195705717d) + "'", double3 == (-2980918.4195705717d));
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.9899495607422277E-4d), (-0.05729572789109639d), 2.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.028548366467511084d + "'", double3 == 0.028548366467511084d);
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 100, 0.04329362684255219d, 0.7662607002774456d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 130.44738734084285d + "'", double3 == 130.44738734084285d);
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5026278.486811852d), 0.33593526285222397d, (-1.4467164732553828E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.4742666691539406E10d + "'", double3 == 3.4742666691539406E10d);
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(465146.84984962095d, 59.97350352930122d, (-62379.381928932686d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.455778848144949d) + "'", double3 == (-7.455778848144949d));
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.509728657554644d), (-0.43160436896995724d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(26046.671056761512d, (-1.498706479418816E-4d), 161.2009255255225d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 161.5789184939156d + "'", double3 == 161.5789184939156d);
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.474228282204198E10d, 1.100136813934669E7d, (-30022.485396605553d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-490674.94776992063d) + "'", double3 == (-490674.94776992063d));
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.0d, (-5.721082216921438E-10d), 0.0016375408896772724d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 610.6717742902828d + "'", double3 == 610.6717742902828d);
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.005159774436090226d, (-2.151817791815755d), (-2.6893307157254575E11d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.02049950063502E-12d) + "'", double3 == (-8.02049950063502E-12d));
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-71.4347613908908d), (double) (short) 0, 3.895630454685881d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-18.337150359055514d) + "'", double3 == (-18.337150359055514d));
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.02441966152248684d), (-0.492719128061608d), (-0.008046938651515831d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-58.19597822470113d) + "'", double3 == (-58.19597822470113d));
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.7371758664955071d), (-8.583223394584582d), 0.6947368421052632d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11.293553260128213d + "'", double3 == 11.293553260128213d);
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-12060.887424865063d), 0.0d, (-304.4349314474631d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.617291509619136d + "'", double3 == 39.617291509619136d);
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.4694154500606188d, (-0.09722222222222221d), (-0.003929249906775104d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-144.21013825203696d) + "'", double3 == (-144.21013825203696d));
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.004391895249523627d, 0.0d, (-5.103835691184848E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.60508745826035d) + "'", double3 == (-8.60508745826035d));
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2081.075077892601d, (-1138.2840441259614d), (-3.8365163560519195d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-839.1360346842204d) + "'", double3 == (-839.1360346842204d));
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(21.7414034926249d, (-1.3589968101107747E-5d), (-94.57434905081192d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.22988703914749656d) + "'", double3 == (-0.22988703914749656d));
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-19.64194884052652d), 0.21713154176112798d, 2392.665682152357d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.00829998128464948d) + "'", double3 == (-0.00829998128464948d));
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-53.00142506533407d), 2347.155566344006d, 1461.1037619556068d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.6427012604476918d) + "'", double3 == (-1.6427012604476918d));
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-41232.77548435679d), 0.0014412669839387155d, (-5694566.743298978d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0072407223910658375d + "'", double3 == 0.0072407223910658375d);
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.005978609982788297d, (-9520.702958270625d), 34.16666666666667d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 278.65489571357875d + "'", double3 == 278.65489571357875d);
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3093.012717638825d), (-1.4481903954008661E7d), 474.2632874824059d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30529.057009980253d + "'", double3 == 30529.057009980253d);
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.051418511051468d), 3935.0009933969777d, (-16.026906242540846d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 245.6526763386034d + "'", double3 == 245.6526763386034d);
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.051418511051468d), 378338.3543080885d, (-0.012861186212075172d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.941722477910953E7d + "'", double3 == 2.941722477910953E7d);
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.5563924799417606E-4d), (-0.29397590361445786d), (-0.26157790631375005d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1221141284554832d) + "'", double3 == (-1.1221141284554832d));
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6378457.687275752d, 3.575547437284293d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.5920422856791114E-5d), (-1.3186540337544608d), (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.3186081133316039d) + "'", double3 == (-1.3186081133316039d));
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.966919877862873d), (-71.4347613908908d), (-5.435269469819528d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-12.412970854096056d) + "'", double3 == (-12.412970854096056d));
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-24.240738918625162d), (-4.859744364937509d), 179.4136678795534d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.10802406964166623d) + "'", double3 == (-0.10802406964166623d));
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.06444874751764998d, (-2959.7992059068197d), (-2.3472392633885765E-15d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.260997845776212E18d) + "'", double3 == (-1.260997845776212E18d));
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.1811134720201d), 34.16666666666667d, 1.2120562897729945d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-34.938789968754726d) + "'", double3 == (-34.938789968754726d));
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-112.57965019863204d), (-1.6239623232758535E-4d), 11.484264408496168d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.802934153894292d) + "'", double3 == (-9.802934153894292d));
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.472826932117897E-4d, 61.988755295184255d, 0.028548366467511084d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2171.3364259575205d) + "'", double3 == (-2171.3364259575205d));
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.9187189877335759d, (-839.1360346842204d), 0.0029255559974682515d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 287143.6248012102d + "'", double3 == 287143.6248012102d);
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-258736.8504784611d), 2.616425058066798d, (-2.958730825725353E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.744947822013767E8d + "'", double3 == 8.744947822013767E8d);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.3496190917066646d, 0.019108774049942618d, (-127.9691388195903d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.018211502704118795d) + "'", double3 == (-0.018211502704118795d));
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2232.42201789151d, 20.85909840205065d, (-411.7432728113756d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.371218100028564d) + "'", double3 == (-5.371218100028564d));
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0017132848741286434d, 30.431142272710556d, 1469.8632083517716d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.020702218284624194d) + "'", double3 == (-0.020702218284624194d));
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-876.4615394435142d), 13060.092481229245d, (-411.7432728113756d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 33.8476787380501d + "'", double3 == 33.8476787380501d);
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-14.116811280841457d), 0.09616853157123405d, 7.729781025267267E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-18387.29941501966d) + "'", double3 == (-18387.29941501966d));
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.760854173120857d, 0.005875464115575659d, (-0.0424390243902439d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-41.35294659150376d) + "'", double3 == (-41.35294659150376d));
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5282846310233278d), (-3.1608795582227505E-5d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(257.7370092548448d, 0.007528883973507984d, (-3.073516221517825E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-838549.27644922d) + "'", double3 == (-838549.27644922d));
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2247.4992407486698d), (-5.103835691184848E-4d), (-21.223577551332923d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 105.89631860741352d + "'", double3 == 105.89631860741352d);
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-161.92118226600988d), (-0.23312849541459077d), (-6.651159273789213E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.4309755204295454E-7d + "'", double3 == 2.4309755204295454E-7d);
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.07329053716153547d, (-4.027936507936508d), (-0.11244252910375685d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-36.47398433482066d) + "'", double3 == (-36.47398433482066d));
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1221141284554832d), (-0.047808065325613415d), 0.003084440682492978d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-348.29850002547926d) + "'", double3 == (-348.29850002547926d));
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(59.97350352930122d, 6.724968673526429E-4d, 1.6681931311196593E-7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.5950772074083084E8d + "'", double3 == 3.5950772074083084E8d);
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-56446.19464108165d), (-304.4349314474631d), (-32.16059602649007d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1745.6691307397193d + "'", double3 == 1745.6691307397193d);
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(161.5789184939156d, (-3.5020705481508303d), 161.2009255255225d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0240697347356706d + "'", double3 == 1.0240697347356706d);
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.0158583012452127E7d, (-58.19597822470113d), (-4.4999183035714285d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2257516.808775793d) + "'", double3 == (-2257516.808775793d));
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-30022.485396605553d), (-1.0d), 1.9118381070872112d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-15702.943301169422d) + "'", double3 == (-15702.943301169422d));
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0014412669839387155d, 125529.76571116375d, 5.081212852733868d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-24704.68526079505d) + "'", double3 == (-24704.68526079505d));
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.07317714068437882d), (-24.58841355160647d), 1.34955153245034d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 18.16546891426259d + "'", double3 == 18.16546891426259d);
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(113.97243455562777d, 599.7651782375282d, (-3.1608795582227505E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.5368910290116979E7d + "'", double3 == 1.5368910290116979E7d);
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-373.8995556680519d), 213.07831205463037d, 175.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.354159244129613d) + "'", double3 == (-3.354159244129613d));
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10, 277.5577746718535d, 0.35444509006391633d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-754.8638200168194d) + "'", double3 == (-754.8638200168194d));
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.003442246480318322d, 24.851043877147877d, (-0.27451240016813794d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 90.51540701057033d + "'", double3 == 90.51540701057033d);
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(879.8888888888889d, 1.474228282204198E10d, (-0.5387626085229231d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.736322400429881E10d + "'", double3 == 2.736322400429881E10d);
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.4325933296457168E-4d, (-611.250491851009d), 298.12196409159696d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.050337475042722d + "'", double3 == 2.050337475042722d);
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(278.7142577248092d, (-0.05672342154368765d), (-20.48548860584678d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-13.608217334234764d) + "'", double3 == (-13.608217334234764d));
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.455277418787318d, 28.784818820180682d, (-0.5782843123540006d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 33.42567140151064d + "'", double3 == 33.42567140151064d);
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0012952751777688372d, 7.298232900384636d, 0.04380633171140876d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-166.57266975190436d) + "'", double3 == (-166.57266975190436d));
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-400.2869205463187d), (-41.340724233317324d), 52.55596729571826d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.829789551647064d) + "'", double3 == (-6.829789551647064d));
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-23.538673630532d), (-0.08295933308814714d), (-876.4615394435142d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.026761829517740653d + "'", double3 == 0.026761829517740653d);
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-94607.25286096858d), 46.64578469753089d, (-3745.3768850495107d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.272195976724745d + "'", double3 == 25.272195976724745d);
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.6092955089565593E-5d), (-0.492719128061608d), (-4.5920422856791114E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-10728.843605011743d) + "'", double3 == (-10728.843605011743d));
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-12.412970854096056d), 0.0022981397119101587d, 12.223507767800605d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0156879047856051d) + "'", double3 == (-1.0156879047856051d));
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.7593790285666446d, 0.30711943793911006d, (-3523663.8319391436d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.959402790924032E-7d) + "'", double3 == (-6.959402790924032E-7d));
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0d), 1070724.930288176d, 0.04456892170494916d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.402402592049422E7d) + "'", double3 == (-2.402402592049422E7d));
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3142124542124545d, (-915.6322250395841d), 7.298232900384636d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 125.6395143878556d + "'", double3 == 125.6395143878556d);
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 3155.041661331841d, (-13.608217334234764d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 231.84827107328528d + "'", double3 == 231.84827107328528d);
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.961703135888502d, 0.07581370290688234d, 559.8204717945758d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.017659035228367304d + "'", double3 == 0.017659035228367304d);
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.33391548734539833d, (-73.85842848243861d), 6.231925143496529E-8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.1905204613571002E9d + "'", double3 == 1.1905204613571002E9d);
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1553.821497993468d), (double) 10L, 5126.331674374675d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.3050566364659243d) + "'", double3 == (-0.3050566364659243d));
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.6101172237222836d, 0.3580677144265516d, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3745.3768850495107d), (-0.02441966152248684d), (-0.06634316602523686d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 56454.23168323412d + "'", double3 == 56454.23168323412d);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(28444.63036034656d, (-202.14142258157375d), 2.505351936903913E15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.1434230600882967E-11d + "'", double3 == 1.1434230600882967E-11d);
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(175.0d, (-0.16913059628880311d), 0.0023457492850929374d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 74675.12905555408d + "'", double3 == 74675.12905555408d);
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-252.75954075292424d), 0.0037783178274178523d, 0.0024536239201452753d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-103016.32495324952d) + "'", double3 == (-103016.32495324952d));
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.3060791968549404E13d), 0.0d, 0.14332976584043497d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.112407246300548E13d) + "'", double3 == (-9.112407246300548E13d));
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0424390243902439d), 231.84827107328528d, (-2.6949686296169904d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 86.04579198038081d + "'", double3 == 86.04579198038081d);
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(Double.POSITIVE_INFINITY, (-232260.55752452716d), 157742.8413187583d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.2887659395329154d, (-0.028595986065227025d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2933575938864831d), 12774.153009464499d, 10.439112130526627d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1223.7100442385943d) + "'", double3 == (-1223.7100442385943d));
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0016375408896772724d, (double) (-1.0f), (-0.0019476314641768719d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-514.2849452337225d) + "'", double3 == (-514.2849452337225d));
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.005129344935279409d), (-273.47492579646894d), (-1.3902592402152212E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1967041.7468989366d) + "'", double3 == (-1967041.7468989366d));
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.004580404729745688d), 0.0d, (-18387.29941501966d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.491069855535275E-7d + "'", double3 == 2.491069855535275E-7d);
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-183362.25353488396d), 0.0018768143330709101d, 2.135416666666667d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-85867.2025342587d) + "'", double3 == (-85867.2025342587d));
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-53.37539162746745d), (-0.0028718373568427723d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0019476314641768719d), 791.2764751368901d, 0.8878201595235209d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-891.2598055815954d) + "'", double3 == (-891.2598055815954d));
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-348.29850002547926d), (-0.3526922384791338d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-987.5422876539585d) + "'", double3 == (-987.5422876539585d));
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1119.0111575101134d), 1.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0024536239201452753d, (-0.1d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1321.0332618716707d), (-0.0737847753545197d), 1.407706191138976E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9383772.589843672d) + "'", double3 == (-9383772.589843672d));
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(26.354327384894013d, (-5.371218100028564d), 104.39867431758901d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.30388839410365465d + "'", double3 == 0.30388839410365465d);
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4637.148358735402d), 0.04456892170494916d, 4.341507509246353d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1068.1066237432544d) + "'", double3 == (-1068.1066237432544d));
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.5020705481508303d), 0.01737925304935617d, 1.1026958610090727E11d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.1916777106423085E-11d) + "'", double3 == (-3.1916777106423085E-11d));
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.388109241365902d), 2.1639100219545377d, (-606.8342299716378d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0075012565845753165d + "'", double3 == 0.0075012565845753165d);
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 24375.32745104039d, (-891.2598055815954d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 27.349295119546163d + "'", double3 == 27.349295119546163d);
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-140379.27954953242d), 11.391352756079183d, 2.4309755204295454E-7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.775075467542426E11d) + "'", double3 == (-5.775075467542426E11d));
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.206390887176429E9d), (-0.003392245521890975d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2392.665682152357d, 3.3839331854628965d, (-0.8256739378496681d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2893.7352136721006d) + "'", double3 == (-2893.7352136721006d));
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-71.4347613908908d), 0.005445821671331467d, 0.1852516396085581d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-385.638730990545d) + "'", double3 == (-385.638730990545d));
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.0240697347356706d, (double) '#', 0.485062117001907d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-70.04449342542814d) + "'", double3 == (-70.04449342542814d));
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-517.550204162918d), 84.232524677725d, 213.07831205463037d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.824232663746436d) + "'", double3 == (-2.824232663746436d));
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.617483931146957E-4d), 6.760621070116967E-7d, 31.666666666666664d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.72344564806855E-5d) + "'", double3 == (-2.72344564806855E-5d));
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.388109241365902d), (-32.04764482188377d), (-0.003907855524390268d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7589.721624917432d) + "'", double3 == (-7589.721624917432d));
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-0.004232624137775097d), (-2021.4566648401276d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.093848565440232E-6d) + "'", double3 == (-2.093848565440232E-6d));
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5086896265246781d), 838.1437053899591d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.010644913539679234d), 4.462338981444688d, 0.019230769230769232d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-232.5951625391871d) + "'", double3 == (-232.5951625391871d));
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.41466339807368535d), (-3532.8464053416346d), 2.3496190917066646d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1503.4061284281406d + "'", double3 == 1503.4061284281406d);
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.020527867595720343d), 3.575547437284293d, (-9.168353752547599d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3922269364749126d + "'", double3 == 0.3922269364749126d);
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.736322400429881E10d, 0.025628608078652092d, (-0.009954337617466431d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.748874415939053E12d) + "'", double3 == (-2.748874415939053E12d));
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(38010.25819494771d, 21.7414034926249d, (-361811.4860553608d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.10499533114778578d) + "'", double3 == (-0.10499533114778578d));
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.06634316602523686d), 0.0016375408896772724d, (-1.4975254724830773E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.539535932046214E-10d + "'", double3 == 4.539535932046214E-10d);
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.298232900384636d, (-273.47492579646894d), (-23.81572573286746d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-11.789401752698465d) + "'", double3 == (-11.789401752698465d));
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.643077221003559E-4d, 5997.88850639995d, 6.310598231883354d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-950.4467915242641d) + "'", double3 == (-950.4467915242641d));
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.753743136477039d, 13.439970251589838d, (-7.455778848144949d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.2991569777479117d + "'", double3 == 1.2991569777479117d);
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.18932071331315758d, (-3647.7283598492904d), (-0.004719704291657331d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-772912.3383875459d) + "'", double3 == (-772912.3383875459d));
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-166.57266975190436d), (-0.037321193336271166d), 6.199820329875534d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-26.86131850564634d) + "'", double3 == (-26.86131850564634d));
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100L, 13060.092481229245d, (-23.24610440052088d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 557.5167459429824d + "'", double3 == 557.5167459429824d);
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11.293553260128213d, (-2.8626146032068838d), 1.1905204613571002E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.1890738817876488E-8d + "'", double3 == 1.1890738817876488E-8d);
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(961.3970359880889d, (-0.0564841814930677d), (-56446.19464108165d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.01703309720492361d) + "'", double3 == (-0.01703309720492361d));
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.004580404729745688d), (-0.1d), (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.541959527025432E-4d + "'", double3 == 9.541959527025432E-4d);
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-12060.887424865063d), 0.0d, (-0.0424390243902439d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 284193.32437900436d + "'", double3 == 284193.32437900436d);
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(45573.696922390234d, 0.0d, 0.010547356069728267d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4320864.548527976d + "'", double3 == 4320864.548527976d);
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(46645.53242972464d, (-0.008046938651515831d), 8.7963291244323E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.3028416532417685E7d + "'", double3 == 5.3028416532417685E7d);
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.1905204613571002E9d, 0.03790395662113255d, (-5.721082216921438E-10d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.080935767358759E18d) + "'", double3 == (-2.080935767358759E18d));
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-15702.943301169422d), (-18.264700793263554d), (-15.4449034606291d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1015.5245476514809d + "'", double3 == 1015.5245476514809d);
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2423.9953657685182d, (-3.917591362311537E-5d), 3.6346762673680155d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 666.908199419841d + "'", double3 == 666.908199419841d);
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0031500412764029324d), 16979.992812919598d, 52.27868629896233d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-324.7976788448471d) + "'", double3 == (-324.7976788448471d));
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.80952380952381d), 6.669381006171804d, (-6.583223394584583d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.8955615004590107d + "'", double3 == 1.8955615004590107d);
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.056591864232780474d), (-9.449978071646475d), (-839.1360346842204d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.01119411611366275d) + "'", double3 == (-0.01119411611366275d));
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.025628608078652092d, 2.0d, 0.4425816845525891d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.461032755834129d) + "'", double3 == (-4.461032755834129d));
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.14332976584043497d, (-3.354159244129613d), (-580.4713660041064d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.006025256739270937d) + "'", double3 == (-0.006025256739270937d));
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8808183.796906078d, 2.0649190948203606d, 136.07688523246375d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 64729.448480098086d + "'", double3 == 64729.448480098086d);
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.1214552933540486E-6d), (-32.04764482188377d), 0.1331396435040129d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 240.70698897028777d + "'", double3 == 240.70698897028777d);
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.9461365114570157d), 5997.88850639995d, 3.2734402890550405E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.8325779953796312E7d) + "'", double3 == (-1.8325779953796312E7d));
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.97271665616187d), 0.0d, 0.2443810045243917d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-20.348212684695557d) + "'", double3 == (-20.348212684695557d));
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-105.12487240829857d), 1.9554042867703132d, (-0.08348013881347674d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1282.7036252817327d + "'", double3 == 1282.7036252817327d);
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(61.988755295184255d, (-0.17727103796640375d), 0.6913657118653453d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 89.91771687002392d + "'", double3 == 89.91771687002392d);
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.011951369809972E7d), (-1.6427012604476918d), (-4.5920422856791114E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.20370619995323E11d + "'", double3 == 2.20370619995323E11d);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.04160688665710186d, (-0.13998227701084454d), 8341.733699559149d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.176875577765605E-5d + "'", double3 == 2.176875577765605E-5d);
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(838389.069754146d, (-7.993490166556919E15d), (-6.812158732714832E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.173415136233868E20d) + "'", double3 == (-1.173415136233868E20d));
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-13.659944808043116d), 0.010217828062816556d, (-3.917591362311537E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 348943.046169062d + "'", double3 == 348943.046169062d);
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-12.412970854096056d), (-514.2849452337225d), (-2.7037398106351773d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-185.62140203192257d) + "'", double3 == (-185.62140203192257d));
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1245911.75374839d), (-6.736273757317035d), (-252.75954075292424d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4929.2106393424765d + "'", double3 == 4929.2106393424765d);
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.561724108503911E-4d), (-2.5806345537752432E8d), 28444.63036034656d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9072.484054390221d + "'", double3 == 9072.484054390221d);
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.34867233773123746d), (-0.0022646656629954167d), (-9.802934153894292d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03533714157721124d + "'", double3 == 0.03533714157721124d);
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(114.7323696682487d, 0.28485144954940284d, 0.03533714157721124d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3238.731632229868d + "'", double3 == 3238.731632229868d);
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-490674.94776992063d), 2115.7793041403506d, (-1.8833676694160043E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.616540227787099E11d + "'", double3 == 2.616540227787099E11d);
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) '#', 2.0649190948203606d, 86.04579198038081d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.38276224957856303d + "'", double3 == 0.38276224957856303d);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(240.70698897028777d, 0.005938246930557758d, (-171.92101887315275d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.4000676141929564d) + "'", double3 == (-1.4000676141929564d));
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.01703309720492361d), (-4.830727378007184E-10d), (-0.018932635507964993d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8996685492986446d + "'", double3 == 0.8996685492986446d);
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1413.3683407971002d, 2.263231850117096d, (-41.340724233317324d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-34.13353624341552d) + "'", double3 == (-34.13353624341552d));
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(25.058534698933222d, 6.351409346550463d, 348943.046169062d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.361082720450376E-5d + "'", double3 == 5.361082720450376E-5d);
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-75.0259680625998d), (-0.008046938651515831d), 7.298232900384636d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-10.278915752331587d) + "'", double3 == (-10.278915752331587d));
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-41232.77548435679d), 5604.062084800248d, (-0.0015898810127189268d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.9459335129148602E7d + "'", double3 == 2.9459335129148602E7d);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(169.02211401103276d, (-2.051418511051468d), 0.0016339285714285715d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104700.74121570183d + "'", double3 == 104700.74121570183d);
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.2491203062324345d), (double) (-1L), 18970.42714396637d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.239865383096493E-4d) + "'", double3 == (-2.239865383096493E-4d));
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(58.596196556130764d, 11.237674593054386d, (-1245911.75374839d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.80111366801026E-5d) + "'", double3 == (-3.80111366801026E-5d));
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.439112130526627d, (-324.7976788448471d), 1282.7036252817327d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.261351713964122d + "'", double3 == 0.261351713964122d);
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(20.34990128894573d, 0.23007705294454095d, 1000909.86017476d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0101534650171442E-5d + "'", double3 == 2.0101534650171442E-5d);
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.764457700256903d, 11.293553260128213d, 3.5950772074083084E8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.5379629534736016E-8d) + "'", double3 == (-1.5379629534736016E-8d));
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7122.93809493948d), 1413.3683407971002d, 0.0022981397119101587d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3714441.8990268465d) + "'", double3 == (-3714441.8990268465d));
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-373.8995556680519d), 2.941722477910953E7d, 7.973486285373436d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3689427.387945577d) + "'", double3 == (-3689427.387945577d));
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-19259.69260572524d), (-6.736273757317035d), 838389.069754146d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.02296422630797628d) + "'", double3 == (-0.02296422630797628d));
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.325443884910899d), (-7.820594347784853d), 2.599377845637171d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3446103915751453d + "'", double3 == 1.3446103915751453d);
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-24925.365853658535d), (-0.43160436896995724d), 15.14151383587133d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1646.1322506763238d) + "'", double3 == (-1646.1322506763238d));
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0014412669839387155d, 0.4425816845525891d, 114.7323696682487d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0038449516805433214d) + "'", double3 == (-0.0038449516805433214d));
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.008044917151602828d), 1.9554042867703132d, (-0.020527867595720343d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 95.64798656102286d + "'", double3 == 95.64798656102286d);
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(278.65489571357875d, (-0.19468186134852805d), (-1.27096727177068d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-219.39949498970262d) + "'", double3 == (-219.39949498970262d));
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.961703135888502d, 18.356021444943778d, (-0.08576417320182057d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.87674731384321d + "'", double3 == 97.87674731384321d);
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-12.412970854096056d), 0.07581370290688234d, 8341.733699559149d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0014971449589265787d) + "'", double3 == (-0.0014971449589265787d));
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.09865590851564983d), (-0.009954337617466431d), (-22.862368511464002d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0038798067161635195d + "'", double3 == 0.0038798067161635195d);
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1331396435040129d, (-31559.786016838494d), (-1014.5423943655138d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-31.10754102712416d) + "'", double3 == (-31.10754102712416d));
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3012.0898484574304d), 21.27789925075722d, 0.13935478660469144d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-21767.230402447247d) + "'", double3 == (-21767.230402447247d));
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(179.4136678795534d, 0.028548366467511084d, 18.16546891426259d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.875061324304266d + "'", double3 == 9.875061324304266d);
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-183362.25353488396d), (-9.990971428571429d), (-2.561724108503911E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.157377406676948E8d + "'", double3 == 7.157377406676948E8d);
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.003907855524390268d), 0.0014412669839387155d, (-15702.943301169422d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.406445789007355E-7d + "'", double3 == 3.406445789007355E-7d);
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5886.953471402866d, 1.0173792530493562d, 89.91771687002392d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 65.45913638641358d + "'", double3 == 65.45913638641358d);
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.3839331854628965d, (-2.5806345537752432E8d), (-1119.0111575101134d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-230617.41344533928d) + "'", double3 == (-230617.41344533928d));
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.378796807381013d), 132.93978337338487d, (-0.08576417320182057d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1612.7780985572388d + "'", double3 == 1612.7780985572388d);
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1753.0335108122406d, 1.1905204613571002E9d, 0.07410507008131427d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.606528010859787E10d) + "'", double3 == (-1.606528010859787E10d));
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-339.3637465801493d), 3086.91553409881d, (-6.959402790924032E-7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.923237501279958E9d + "'", double3 == 4.923237501279958E9d);
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.643077221003559E-4d, 112.25635738831615d, 0.0018229999973003023d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-61577.45104050167d) + "'", double3 == (-61577.45104050167d));
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.08101442761435378d), (-0.08101442761435378d), (-580.4713660041064d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.583223394584582d), (-5.15695681635064E-6d), 7.403501046614858d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1593458532098562d) + "'", double3 == (-1.1593458532098562d));
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.818018633727817d, 0.02369851381595228d, (-1.173415136233868E20d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.346849991510424E-20d) + "'", double3 == (-8.346849991510424E-20d));
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-53.178161845656376d), (-50.17055488661449d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0599476518814488d) + "'", double3 == (-1.0599476518814488d));
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.541959527025432E-4d, (-0.09865590851564983d), 0.0015511267324521702d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 64.2179019833403d + "'", double3 == 64.2179019833403d);
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.788884869211093E9d, (double) 1.0f, (-3.8365163560519195d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.2482378344762843E9d) + "'", double3 == (-1.2482378344762843E9d));
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-207.00456697639197d), (-126.23618422351787d), 130.44738734084285d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.6191644340245491d) + "'", double3 == (-0.6191644340245491d));
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.973486285373436d, (-24925.365853658535d), (-0.041836835908971234d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-595966.1814338439d) + "'", double3 == (-595966.1814338439d));
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.60508745826035d), 5.833577161170763E-5d, 24.449669813176985d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.35195345621372265d) + "'", double3 == (-0.35195345621372265d));
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(39.617291509619136d, 66.64061689065804d, (-0.07089547030267625d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 381.17139593922394d + "'", double3 == 381.17139593922394d);
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-103016.32495324952d), 112.25635738831615d, (-4.5920422856791114E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.245810793865246E9d + "'", double3 == 2.245810793865246E9d);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.003929249906775104d), 0.029266685342399384d, 424388.5246618761d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.822062407465601E-8d) + "'", double3 == (-7.822062407465601E-8d));
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1552536081078527E9d), 1461.1037619556068d, 2176.404460537546d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-530808.9972055472d) + "'", double3 == (-530808.9972055472d));
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.97271665616187d), 56.158660220318865d, (-13.659944808043116d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.475228687636128d + "'", double3 == 4.475228687636128d);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.7037398106351773d), (-5.378796807381013d), (-7.957376315539241E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-336173.24236909073d) + "'", double3 == (-336173.24236909073d));
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-274.5462255160796d), 0.007528883973507984d, (-677427.3042814778d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.052888814265645E-4d + "'", double3 == 4.052888814265645E-4d);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2853.87309695617d, (-139.65131017440473d), 2.941722477910953E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0176093868842476E-4d + "'", double3 == 1.0176093868842476E-4d);
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.455277418787318d, (-16719.06947781108d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.07430549635937711d, 0.21713154176112798d, 557.5167459429824d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.5618252086791627E-4d) + "'", double3 == (-2.5618252086791627E-4d));
    }
}

