package StandardScore;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.5276351229119899d, (-3.424338359657732d), (-0.09335836511275178d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-42.331219894401556d) + "'", double3 == (-42.331219894401556d));
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.4704957417854d, 175.0d, 8808183.796906078d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.913328651445846E-5d) + "'", double3 == (-1.913328651445846E-5d));
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.09284987420992283d), (double) (short) 100, (-4425.090047559527d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.022619392780359786d + "'", double3 == 0.022619392780359786d);
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.011072287707266294d, 161.2009255255225d, 7.167913900919501E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-224876.9383476241d) + "'", double3 == (-224876.9383476241d));
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-16774.28987144538d), 37.018327125636084d, 38.47058958622179d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-436.9911763606548d) + "'", double3 == (-436.9911763606548d));
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.3073147507737182E-4d), (-100.0d), (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(287143.6248012102d, (-7183.620461572214d), 0.32179203253940475d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 914650.5056079684d + "'", double3 == 914650.5056079684d);
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.504451572129765E-4d), 557.5167459429824d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(68.39384314040382d, 0.0d, (-6.829789551647064d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-10.014048401229294d) + "'", double3 == (-10.014048401229294d));
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-26.08692184267441d), (double) (byte) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.09722222222222221d), (-3.1891763536845264E-5d), 588.5635443720768d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.6513141425090338E-4d) + "'", double3 == (-1.6513141425090338E-4d));
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-960.4172186271933d), 92249.58419921181d, 245.6526763386034d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-379.43816777049864d) + "'", double3 == (-379.43816777049864d));
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.504451572129765E-4d), (-2.072911887764989E-4d), 5.7049771730371326E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.9642872949936E-13d + "'", double3 == 9.9642872949936E-13d);
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1351037224275184E-6d), (-3.7931008323228093E-4d), (-0.42214589785264567d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.958395223867822E-4d) + "'", double3 == (-8.958395223867822E-4d));
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1494537393527402E8d), (-4.143897996357012d), 0.0014412669839387155d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.975300279012263E10d) + "'", double3 == (-7.975300279012263E10d));
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.30711943793911006d, (-0.35195345621372265d), (-20037.97917199869d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.2891185707679995E-5d) + "'", double3 == (-3.2891185707679995E-5d));
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3418404.844999153d), (-0.005547064099042615d), 10.006904238401965d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-341604.63196337986d) + "'", double3 == (-341604.63196337986d));
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.744848552657145d), (-4947912.4162737755d), 1.4838076379066476d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3334601.1605693833d + "'", double3 == 3334601.1605693833d);
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1612.7780985572388d, Double.NaN, (-6911.905450826736d));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-717.351836035973d), 0.4694154500606188d, (-6.813865147198482d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 105.3471467337691d + "'", double3 == 105.3471467337691d);
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.1905204613571002E9d, (-0.16913059628880311d), 2.616540227787099E11d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.004549979583280079d + "'", double3 == 0.004549979583280079d);
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.3186081133316039d), (-6.35649205133331E7d), (-0.30766356745377826d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.0660528550971392E8d) + "'", double3 == (-2.0660528550971392E8d));
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.1921715267680537d), (-26.15665278012303d), 21.7414034926249d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.194241266998362d + "'", double3 == 1.194241266998362d);
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(278.65489571357875d, (-144.21013825203696d), (-126.23618422351787d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.3497925857524113d) + "'", double3 == (-3.3497925857524113d));
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.378796807381013d), 0.0d, (-2.6893307157254575E11d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0000503381489328E-11d + "'", double3 == 2.0000503381489328E-11d);
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.509728657554644d), (-0.2857142857142857d), 18970.42714396637d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.452223571727333E-5d) + "'", double3 == (-6.452223571727333E-5d));
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5387626085229231d), (-1.260997845776212E18d), (-0.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.220792659563041d), (-3418404.844999153d), 2440.153302131423d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1400.895845855501d + "'", double3 == 1400.895845855501d);
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.014802498512616825d), 17.326447584017874d, (-20.251023116279637d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8563147640965357d + "'", double3 == 0.8563147640965357d);
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-0.0022646656629954167d), (-252.75954075292424d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.959763323866604E-6d) + "'", double3 == (-8.959763323866604E-6d));
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(474.2632874824059d, (-4425.090047559527d), (-103016.32495324952d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.04755899938446978d) + "'", double3 == (-0.04755899938446978d));
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9072.484054390221d, (-11560.515027955293d), (-0.0014167505396309205d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.456360771016233E7d) + "'", double3 == (-1.456360771016233E7d));
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.06381003452916503d), 2.779126012999823E8d, 5.273266038932729d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.270217722981408E7d) + "'", double3 == (-5.270217722981408E7d));
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.539535932046214E-10d, (-0.28855900038211735d), (-0.27451240016813794d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0511692756295508d) + "'", double3 == (-1.0511692756295508d));
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-341604.63196337986d), (-5.882378261446413d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.417344911978487E8d), 7.167913900919501E-4d, 105.89631860741352d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5115706.55451133d) + "'", double3 == (-5115706.55451133d));
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-85450.51646580474d), (-0.004268766379812227d), (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 85450.51219703836d + "'", double3 == 85450.51219703836d);
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1526315789473684d, 0.0d, (-190.41098095896922d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.015902138556718E-4d) + "'", double3 == (-8.015902138556718E-4d));
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(75.83951627653596d, 1.2120562897729945d, (-13.64938407658132d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.467459891820589d) + "'", double3 == (-5.467459891820589d));
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-31.358447222800585d), (-336173.24236909073d), 62.23051424857837d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5401.560439933966d + "'", double3 == 5401.560439933966d);
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5203883404509932d), (-0.007561380684840925d), (-1068.1066237432544d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.8012712248606264E-4d + "'", double3 == 4.8012712248606264E-4d);
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.9139486762730505E7d), (-7.993490166556919E15d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.002820692342975111d, 26.075599609358164d, (-15.4449034606291d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.6881153698032372d + "'", double3 == 1.6881153698032372d);
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1, (-6.35649205133331E7d), (-274.5462255160796d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-231527.20964874543d) + "'", double3 == (-231527.20964874543d));
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.474228282204198E10d, 0.0d, 831.3978409419682d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.773192338981669E7d + "'", double3 == 1.773192338981669E7d);
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.9139486762730505E7d), 229121.9932526153d, (-0.9632194354821538d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.04900500074339E7d + "'", double3 == 3.04900500074339E7d);
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.007085902530838871d, 18.356021444943778d, 7.298232900384636d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.5141614131615206d) + "'", double3 == (-2.5141614131615206d));
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(42.21606629824469d, 10.999836607142857d, (-1147.0772263835156d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0272137123579027d) + "'", double3 == (-0.0272137123579027d));
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1753.0335108122406d, (-196.27469186580916d), (-14.3322407794841d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-136.0086139125146d) + "'", double3 == (-136.0086139125146d));
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-53.178161845656376d), (-0.08101442761435378d), 2.3169580922613865E10d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.2916749161491477E-9d) + "'", double3 == (-2.2916749161491477E-9d));
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-97.05148336942d), (-0.35424982108957714d), 104700.74121570183d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.235582520769095E-4d) + "'", double3 == (-9.235582520769095E-4d));
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7183.620461572214d), 8.205448750155846d, (-8.617483931146957E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8345621.492055585d + "'", double3 == 8345621.492055585d);
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.13935478660469144d, (-2980918.4195705717d), (-250.65930951686082d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-11892.311379421735d) + "'", double3 == (-11892.311379421735d));
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(434793.49466778926d, 2.0101534650171442E-5d, 9.452903627643943d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 45995.76085555168d + "'", double3 == 45995.76085555168d);
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.1890738817876488E-8d, 0.0d, 2.1639100219545377d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.495024606954893E-9d + "'", double3 == 5.495024606954893E-9d);
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.973486285373436d, 0.0035197719547558812d, (-9.235582520769095E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8629.630557136725d) + "'", double3 == (-8629.630557136725d));
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.7806835538443396E-8d, (-1623.7107940945573d), 595.4193621384683d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.7270036841105627d + "'", double3 == 2.7270036841105627d);
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-262.3990917404834d), (-1.8354533699461755d), 12.953457588734812d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-20.115373566138874d) + "'", double3 == (-20.115373566138874d));
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100, (-987.5422876539585d), (-112.29052887000132d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.685075834962053d) + "'", double3 == (-9.685075834962053d));
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(93304.39105865342d, 961.3970359880889d, (-86.11583065769975d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1072.3114823071012d) + "'", double3 == (-1072.3114823071012d));
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5604.062084800248d, (-2.0d), 0.21713154176112798d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25818.73660238466d + "'", double3 == 25818.73660238466d);
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.6451240016813788d, 0.4851129400087209d, 0.2443810045243917d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.746731702532458d + "'", double3 == 4.746731702532458d);
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-274.5462255160796d), (-1.2436438886582758E11d), 0.17612766619814846d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.061036535359982E11d + "'", double3 == 7.061036535359982E11d);
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(588.5635443720768d, (-262.3990917404834d), 0.0452656794425087d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 18799.290027080136d + "'", double3 == 18799.290027080136d);
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.7966111308613394E-4d, 11096.134850306027d, 0.35360418392532583d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-31380.09976993993d) + "'", double3 == (-31380.09976993993d));
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2081.075077892601d, 0.8863052387844411d, (-1.3902592402152212E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.4962596273280581E7d) + "'", double3 == (-1.4962596273280581E7d));
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.5980422167835707E-4d), (-0.27451240016813794d), (-0.01185888422057935d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-23.117908130910667d) + "'", double3 == (-23.117908130910667d));
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.67919582268725d, (-11.60305703182941d), (-3647.7283598492904d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.003641239572747525d) + "'", double3 == (-0.003641239572747525d));
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.15010773598714786d), 7.21319582721798d, (-20.726256618548483d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.355264517791192d + "'", double3 == 0.355264517791192d);
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(612800.9223859196d, 24.449669813176985d, 796.468526501686d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 769.3668391488026d + "'", double3 == 769.3668391488026d);
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.5180301307639676d, 3.061156423001374d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.020962887107713414d, (-41232.77548435679d), (-7.455778848144949d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5530.313772316746d) + "'", double3 == (-5530.313772316746d));
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(39.617291509619136d, 505328.8327841604d, (-1363992.3449477204d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3704487179596434d + "'", double3 == 0.3704487179596434d);
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-10.278915752331587d), (-0.08348013881347674d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-123.13007499062992d) + "'", double3 == (-123.13007499062992d));
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-20617.70491827632d), 1.100136813934669E7d, (-9520.702958270625d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1157.6861385734317d + "'", double3 == 1157.6861385734317d);
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-3647.7283598492904d), 2.6743865862682817E19d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3639495421412378E-16d + "'", double3 == 1.3639495421412378E-16d);
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6645741.810621124d), 0.7394978813337217d, (-3.3843469702762654d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1963670.5717488863d + "'", double3 == 1963670.5717488863d);
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1526315789473684d, (-0.6600153033134007d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1351037224275184E-6d), 4.647322480503532E-4d, (-5592.441403851674d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.330303674740776E-8d + "'", double3 == 8.330303674740776E-8d);
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-12.207052935914845d), 1459369.861100138d, 5.273266038932729d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-276751.0793838959d) + "'", double3 == (-276751.0793838959d));
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.046785698335864295d), (-9.227865789907042d), 0.6142109459695451d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 14.947763715084315d + "'", double3 == 14.947763715084315d);
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0266220371807253d, 3.0697363995988333E8d, 1.2120562897729945d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.5326681815310264E8d) + "'", double3 == (-2.5326681815310264E8d));
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.616698045830711d, (-960.4172186271933d), (-694274.8718878754d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0013914286052816231d) + "'", double3 == (-0.0013914286052816231d));
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.00284193505237051d, 72.77859719385503d, 6.643077221003559E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-109551.27095121822d) + "'", double3 == (-109551.27095121822d));
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1d), 1.9554042867703132d, 68.33333333333334d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.04471323346493141d) + "'", double3 == (-0.04471323346493141d));
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7399.344826004147d), 11.55316059649232d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(258736.8504784611d, (-5.439520370575405d), 0.03677573154660464d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7035680.301041362d + "'", double3 == 7035680.301041362d);
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0307216494845362d), 60.78212003088318d, 98.32163016354006d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.6286799921599484d) + "'", double3 == (-0.6286799921599484d));
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1000909.86017476d, (-2897.3890658822615d), (-250.65930951686082d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4004.667734764985d) + "'", double3 == (-4004.667734764985d));
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2515867.5965451133d), (-21.53556252309361d), 141.6622145882947d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-17759.47148852825d) + "'", double3 == (-17759.47148852825d));
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(434793.49466778926d, 0.0d, (-580.4713660041064d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-749.0352153989168d) + "'", double3 == (-749.0352153989168d));
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(38.191766154880995d, (-0.640035035290495d), 23.026151447024002d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.6864216879451766d + "'", double3 == 1.6864216879451766d);
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(177.7963236370834d, 3.6101172237222836d, (-21767.230402447247d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.008002221834973441d) + "'", double3 == (-0.008002221834973441d));
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.833577161170763E-5d, 34.16666666666667d, (-1072.3114823071012d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03186257807981769d + "'", double3 == 0.03186257807981769d);
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.9898524414942786E8d, (-8.206390887176429E9d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.08576417320182057d), 0.0d, (-14.3322407794841d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.005984003096332835d + "'", double3 == 0.005984003096332835d);
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.0354567952486486d), (-12.057538907475166d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1147.0772263835156d), 5886.953471402866d, (-0.02296422630797628d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 306303.8398704169d + "'", double3 == 306303.8398704169d);
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(831.3978409419682d, (-75.0259680625998d), 1.4266324006451166E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6353590.515641501d + "'", double3 == 6353590.515641501d);
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.28891613658762E8d, 1.8955615004590107d, (-2.3472392633885765E-15d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.2532496793687304E23d) + "'", double3 == (-2.2532496793687304E23d));
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2021.4566648401276d), 3.0064075747512204E-4d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.018211502704118795d), 0.0d, (-400.2869205463187d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.54961223296115E-5d + "'", double3 == 4.54961223296115E-5d);
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.0660528550971392E8d), (-64182.79240419197d), (-5.80952380952381d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.5552157025110684E7d + "'", double3 == 3.5552157025110684E7d);
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(411.6401032648013d, (-2.093848565440232E-6d), 58.526619029791355d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.03338262456466d + "'", double3 == 7.03338262456466d);
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3325.4330485669584d, 100.2164565887138d, (-0.0046481642528179105d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-693868.8945905869d) + "'", double3 == (-693868.8945905869d));
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.4071387060023755d), 0.01146206392065246d, 6353590.515641501d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.2327544817857946E-7d) + "'", double3 == (-2.2327544817857946E-7d));
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5694566.743298978d), 0.35444509006391633d, (-127841.65666511058d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 44.54390881887077d + "'", double3 == 44.54390881887077d);
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-3.907862648115074d), (-10069.896224516728d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.8807377563641367E-4d) + "'", double3 == (-3.8807377563641367E-4d));
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7087637.321159789d), 1361893.7742382477d, 84.232524677725d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100311.97720507701d) + "'", double3 == (-100311.97720507701d));
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-75.33225042923146d), 185.41419335293355d, 0.01729988972795197d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-15072.144844996837d) + "'", double3 == (-15072.144844996837d));
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.8890332605012164E9d), (-6.35649205133331E7d), (-3675855.9833939224d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 496.6104080885199d + "'", double3 == 496.6104080885199d);
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(12.223507767800605d, 6378457.687275752d, (-3.595077285614252E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.017742165069138893d + "'", double3 == 0.017742165069138893d);
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7.820594347784853d), (-73.85842848243861d), (-546.8637110016421d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.12075738946674315d) + "'", double3 == (-0.12075738946674315d));
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-196.86320693956702d), (-27.21311475409836d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-60206.121100156764d), 1223.9517457454683d, (-0.9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 68255.63649544693d + "'", double3 == 68255.63649544693d);
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1149.904742169715d), 4.923237501279958E9d, (-198.24038657662203d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.4834690530033927E7d + "'", double3 == 2.4834690530033927E7d);
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.168353752547599d), (-5.270217722981408E7d), 684586.5526558252d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 76.98393703032065d + "'", double3 == 76.98393703032065d);
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(132.93978337338487d, 1.9062156082208216E-8d, (-3000.5621395231774d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.04430495926188295d) + "'", double3 == (-0.04430495926188295d));
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.019197041519533612d), (-139.65131017440473d), 1.8554668589611745d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 75.25443661713334d + "'", double3 == 75.25443661713334d);
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.9118185305298744d, 0.0d, (-0.17727103796640375d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.143640726595629d) + "'", double3 == (-5.143640726595629d));
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(46.34676267368015d, 60.78212003088318d, 953.6363634384901d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.015137171683716012d) + "'", double3 == (-0.015137171683716012d));
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3935.0009933969777d, (-0.2144483607698758d), (-1.6804657504835725E9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.341740937371289E-6d) + "'", double3 == (-2.341740937371289E-6d));
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.00829998128464948d), (-0.09137094436930399d), 0.010547356069728267d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.875998737074463d + "'", double3 == 7.875998737074463d);
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-694274.8718878754d), 5.273266038932729d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 131659.3676029271d + "'", double3 == 131659.3676029271d);
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0022981397119101587d, (-3243.5663140889947d), 2.320255134410269E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.397936185605344E-4d + "'", double3 == 1.397936185605344E-4d);
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.452903627643943d, (-1363992.3449477204d), 58.58234368006642d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 23283.496565117304d + "'", double3 == 23283.496565117304d);
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (double) (short) 100, (-0.01119411611366275d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8933.264492222574d + "'", double3 == 8933.264492222574d);
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.00910929143372252d, (-0.1d), 190.37625266056537d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.731244832739766E-4d + "'", double3 == 5.731244832739766E-4d);
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.80111366801026E-5d), 0.3704487179596434d, 10.439112130526627d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.03549025285521417d) + "'", double3 == (-0.03549025285521417d));
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(38.79874357459719d, (-1.8929671162328545d), 7.973486285373436d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.103377523264186d + "'", double3 == 5.103377523264186d);
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-380279.3753288982d), 4.857313777715477d, (-1.4476190476190476d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 262696.344917638d + "'", double3 == 262696.344917638d);
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2437571795920304d), 0.0d, 31917.477715721667d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.637106596050425E-6d) + "'", double3 == (-7.637106596050425E-6d));
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(92.26233406017359d, (-13.64938407658132d), (-2077.763169505585d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.050973912566732595d) + "'", double3 == (-0.050973912566732595d));
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.599377845637171d, (-0.007561380684840925d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-34.13353624341552d), 18.356021444943778d, 0.01349526848583852d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3889.4785786173925d) + "'", double3 == (-3889.4785786173925d));
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11096.134850306027d, 0.0029255559974682515d, 0.10715747082037681d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 103549.77436290905d + "'", double3 == 103549.77436290905d);
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(46.64578469753089d, 12774.153009464499d, (-140.6638300887735d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 90.48173376719934d + "'", double3 == 90.48173376719934d);
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(932.3236026237777d, (-202.14142258157375d), (-33668.468261484515d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.033695177826166135d) + "'", double3 == (-0.033695177826166135d));
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(28444.63036034656d, (-95785.12487578225d), (-601.7604818022787d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-206.44385763594752d) + "'", double3 == (-206.44385763594752d));
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8629.630557136725d), 81.72698993210076d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0015898810127189268d), (-250.65930951686082d), (-3768.218638004764d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.06651888961744773d) + "'", double3 == (-0.06651888961744773d));
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(141.3178849421564d, 131659.3676029271d, (-1604877.3901011017d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.08194897038813646d + "'", double3 == 0.08194897038813646d);
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-546.8637110016421d), (-0.01703309720492361d), 16.723566459486438d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-32.6991661275839d) + "'", double3 == (-32.6991661275839d));
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1, 1.100136813934669E7d, 1016.0725134666714d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-10827.344499076986d) + "'", double3 == (-10827.344499076986d));
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.413857741260789d, 75.83951627653596d, 879.8888888888889d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.07890275625931009d) + "'", double3 == (-0.07890275625931009d));
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1593458532098562d), (-1.456360771016233E7d), 0.07581370290688234d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.9209728574666938E8d + "'", double3 == 1.9209728574666938E8d);
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8629.630557136725d), 854847.725260599d, (-1501.754620369026d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 574.9789906459908d + "'", double3 == 574.9789906459908d);
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-21.046669339769824d), 4.264057921254216E11d, (-0.015973479995594054d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.6694608329811867E13d + "'", double3 == 2.6694608329811867E13d);
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.327453864569369d), 0.0d, (-0.04430495926188295d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 75.10341776641899d + "'", double3 == 75.10341776641899d);
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.6451240016813788d, 6137178.729746683d, 0.37864852108747754d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.6208110537436472E7d) + "'", double3 == (-1.6208110537436472E7d));
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.009954337617466431d), (-0.019837549573001118d), (-799666.800676867d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.2359162525153198E-8d) + "'", double3 == (-1.2359162525153198E-8d));
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.1331396435040129d, (-60.536079301173494d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0021993436813380145d + "'", double3 == 0.0021993436813380145d);
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.03338262456466d, 0.0d, 2.263231850117096d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.107672165448168d + "'", double3 == 3.107672165448168d);
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-17.783989825804095d), (-272.891770969031d), (-2.7395411118307926E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-931206.2521768193d) + "'", double3 == (-931206.2521768193d));
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.28125d, 2.4834690530033927E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1324884425673403E-8d) + "'", double3 == (-1.1324884425673403E-8d));
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.1751838892208806E21d), (-3980.65074896532d), 161.5789184939156d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.346205253442632E19d) + "'", double3 == (-1.346205253442632E19d));
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8.744947822013767E8d, 89.91771687002392d, 31917.477715721667d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 27398.61526880327d + "'", double3 == 27398.61526880327d);
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.9207895042865763E-4d, (-112.29052887000132d), 1361893.7742382477d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.2451967306892E-5d + "'", double3 == 8.2451967306892E-5d);
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.103835691184848E-4d), 5963.6309716088d, (-0.9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6626.257202213743d + "'", double3 == 6626.257202213743d);
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(12.728831487413462d, 0.0d, 1.3446103915751453d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.466557425978435d + "'", double3 == 9.466557425978435d);
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.260997845776212E18d), 0.007528883973507984d, 3.024374679044065E11d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4169449.818878871d) + "'", double3 == (-4169449.818878871d));
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(18.82264957487597d, 81.91723186732399d, (-3532.8464053416346d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.017859418455625338d + "'", double3 == 0.017859418455625338d);
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-94607.25286096858d), 3.04900500074339E7d, 557.5167459429824d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-54858.72394481004d) + "'", double3 == (-54858.72394481004d));
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(854847.725260599d, (-1.6208110537436472E7d), 1.0158583012452127E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.67965928336479d + "'", double3 == 1.67965928336479d);
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.753675041129709E8d, 104.39867431758901d, 9.875061324304266d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.788513313194004E7d + "'", double3 == 2.788513313194004E7d);
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3334601.1605693833d, (-0.5086896265246781d), (-61577.45104050167d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-54.15296692072759d) + "'", double3 == (-54.15296692072759d));
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-60.79587815134084d), 0.0d, (-0.02441966152248684d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2489.6282078012d + "'", double3 == 2489.6282078012d);
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.512823725253588E7d, (-2.5466888810150405d), 31917.477715721667d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 787.2877682576805d + "'", double3 == 787.2877682576805d);
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.1059507740593383E-6d, (-41.340724233317324d), (-0.16449752507649265d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-251.31518130770863d) + "'", double3 == (-251.31518130770863d));
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.8863052387844411d, 0.5313323016898746d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-30522.347387205173d), (-206664.29901807886d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 26.645147891641408d, 9.818018633727817d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.7139027624277867d) + "'", double3 == (-2.7139027624277867d));
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.9293490277180415E7d, 0.004060680773412489d, 0.017574460359640873d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.6668216078139844E9d + "'", double3 == 1.6668216078139844E9d);
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.29758395464714504d), (-219.39949498970262d), (-2257516.808775793d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.705438745055022E-5d) + "'", double3 == (-9.705438745055022E-5d));
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) '#', 25.01838673699937d, 4320864.548527976d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.3100963131096406E-6d + "'", double3 == 2.3100963131096406E-6d);
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-112.29052887000132d), 858.4778942593937d, (-12.627334254936217d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 76.8783342176839d + "'", double3 == 76.8783342176839d);
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-18.87433095138013d), (double) (-1.0f), 8341.733699559149d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0021427597182015973d) + "'", double3 == (-0.0021427597182015973d));
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3889.4785786173925d), (-4.730910153405653E-8d), (-4.649291939855877E9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.365743921623156E-7d + "'", double3 == 8.365743921623156E-7d);
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.9207895042865763E-4d, 0.0023457492850929374d, 8.81084214573422E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-23.308445443646573d) + "'", double3 == (-23.308445443646573d));
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(240.70698897028777d, (-26406.993606320168d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.8964397017624156E-8d, 0.005159774436090226d, (-5.15695681635064E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000.5426951285872d + "'", double3 == 1000.5426951285872d);
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-28.21311475409836d), (-0.3390372364910442d), 854847.725260599d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.2607067544234205E-5d) + "'", double3 == (-3.2607067544234205E-5d));
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.4309755204295454E-7d, (-0.01534717083845554d), (-1.1757916030312405d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.013052835125239286d) + "'", double3 == (-0.013052835125239286d));
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-2980918.4195705717d), (-0.102685542999733d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.9029582280909035E7d) + "'", double3 == (-2.9029582280909035E7d));
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-0.17727103796640375d), (-584006.8175472687d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.035427543652873E-7d) + "'", double3 == (-3.035427543652873E-7d));
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2900.5607116403717d, (-4.851253054049255E-6d), 56454.23168323412d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.051378977802173126d + "'", double3 == 0.051378977802173126d);
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 20.119943489505655d, (-8.206390887176429E9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.4517408159225914E-9d + "'", double3 == 2.4517408159225914E-9d);
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.024374679044065E11d, (-4.4045384154440165E-4d), (-0.03137934133093799d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.638107591704713E12d) + "'", double3 == (-9.638107591704713E12d));
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.37864852108747754d, 0.07570998391714802d, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.005825741099429414d + "'", double3 == 0.005825741099429414d);
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(831.3978409419682d, (-0.640035035290495d), 1154.7149998702048d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.72055691323901d + "'", double3 == 0.72055691323901d);
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5381431908648426d), 0.03790395662113255d, (-0.5857718390563034d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9833984993440535d + "'", double3 == 0.9833984993440535d);
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(114.7323696682487d, (-222.75294866864752d), (-85.57111079187985d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.943916529933855d) + "'", double3 == (-3.943916529933855d));
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-386.90167524923964d), 25.272195976724745d, (-0.09414354371444772d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4378.142727197024d + "'", double3 == 4378.142727197024d);
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1000909.86017476d, 0.0d, (-0.003929249906775104d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.5473306201494515E8d) + "'", double3 == (-2.5473306201494515E8d));
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0156879047856051d), (-0.005584544177643519d), 0.025473522933985d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-39.653068922805026d) + "'", double3 == (-39.653068922805026d));
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2232.42201789151d, (-75.33225042923146d), (-5.908392924406798E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.9058916660530664E7d) + "'", double3 == (-3.9058916660530664E7d));
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.31428793917108944d), 17.071702602005715d, 2.245810793865246E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.741520607465744E-9d) + "'", double3 == (-7.741520607465744E-9d));
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.33464438570438754d), 0.3248401363089306d, 0.19648313999557906d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.3564433163484497d) + "'", double3 == (-3.3564433163484497d));
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(23.142464116850725d, (-0.17859974514930188d), 0.21713154176112798d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 107.40523312663682d + "'", double3 == 107.40523312663682d);
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-232260.55752452716d), (-0.18278989428235987d), 0.02241010778895672d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0364090031244135E7d) + "'", double3 == (-1.0364090031244135E7d));
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9520.705174543298d), (-1.0511692756295508d), (-64182.79240419197d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14832096966609873d + "'", double3 == 0.14832096966609873d);
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0011294597975129053d, (-7.975300279012263E10d), 0.029266685342399384d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.7250439145079263E12d + "'", double3 == 2.7250439145079263E12d);
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.9764516704652357d, 0.0d, 0.33391548734539833d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.924247923413044d + "'", double3 == 2.924247923413044d);
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.818018633727817d, (-16.026906242540846d), 0.14332976584043497d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 180.3179173894772d + "'", double3 == 180.3179173894772d);
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.5326681815310264E8d), (-0.005584544177643519d), 0.7792320293230807d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.2502105742179406E8d) + "'", double3 == (-3.2502105742179406E8d));
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-219.39949498970262d), (-1.4071387060023755d), (-31.358447222800585d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.951631078378109d + "'", double3 == 6.951631078378109d);
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(879.8888888888889d, (-136.0086139125146d), (-5.587479427085652E-7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.8181677732481263E9d) + "'", double3 == (-1.8181677732481263E9d));
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-378.760498737663d), (double) (short) -1, (-438.92547124662514d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8606483867631493d + "'", double3 == 0.8606483867631493d);
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.0801930827514786E-6d, (-2515867.5965451133d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.03186257807981769d, (-9.990971428571429d), 0.30388839410365465d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.98195719587933d + "'", double3 == 32.98195719587933d);
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5963299421104871d), (-7087705.71500293d), (-2021.4566648401276d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3506.236488741913d) + "'", double3 == (-3506.236488741913d));
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0032537872546947776d, (-24704.68526079505d), 5.833577161170763E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.234912444292453E8d + "'", double3 == 4.234912444292453E8d);
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-60.536079301173494d), (-4.85125159414909E-4d), 1794.4566385400612d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.03373477679865521d) + "'", double3 == (-0.03373477679865521d));
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.0d, (-10069.896224516728d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.4817151066253044d), 2900.5607116403717d, (-0.2729439708142521d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10628.710420283502d + "'", double3 == 10628.710420283502d);
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-216.4416206660676d), (-36.47398433482066d), (-2.9104782871812895E19d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.1834385476739E-18d + "'", double3 == 6.1834385476739E-18d);
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-60206.121100156764d), 4929.2106393424765d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.5020705481508303d), (-7.525321032953368E7d), 117.68539165709558d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 639443.9086095858d + "'", double3 == 639443.9086095858d);
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(745.12238985951d, 559.8204717945758d, (-0.009748709122203098d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-19007.84152466927d) + "'", double3 == (-19007.84152466927d));
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.004060680773412489d, 2.616540227787099E11d, 1063.211405992356d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.4609783275837713E8d) + "'", double3 == (-2.4609783275837713E8d));
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.3060791968549404E13d), 111.88477646529707d, (-1.1d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.1873447244237535E13d + "'", double3 == 1.1873447244237535E13d);
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.9547113936637238E8d, 0.3922269364749126d, 0.30388839410365465d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.432333144893692E8d + "'", double3 == 6.432333144893692E8d);
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(17.807841915085817d, (-3.917591362311537E-5d), 2.5427290117301035E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 700345.219991915d + "'", double3 == 700345.219991915d);
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-411.7432728113756d), 4.264057921254216E11d, 0.0038798067161635195d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.099038750463345E14d) + "'", double3 == (-1.099038750463345E14d));
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.836147023196146E-5d), (-105785.4529149172d), 0.07581370290688234d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1395334.2043784088d + "'", double3 == 1395334.2043784088d);
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-196.5844788468634d), 5121.883242530989d, 1.988806577226357d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2674.200589579269d) + "'", double3 == (-2674.200589579269d));
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.02d, (-50822.6418952214d), (-2.87883103488873d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-17653.92316509668d) + "'", double3 == (-17653.92316509668d));
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.029502622277867E-6d), (-1.0243924841168716E-4d), (-2.8094848336851966E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.5739557866807203E-12d) + "'", double3 == (-3.5739557866807203E-12d));
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2056079965852794d), 5.8248705009503976E-9d, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.002056080024101499d) + "'", double3 == (-0.002056080024101499d));
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-75.0259680625998d), 38.92379864376867d, (-2.5760061625568988E11d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.4235052059527657E-10d + "'", double3 == 4.4235052059527657E-10d);
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(12.223136781466463d, (-8.958395223867822E-4d), 700345.219991915d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.745429578448464E-5d + "'", double3 == 1.745429578448464E-5d);
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3619432066345235E7d, (-232260.55752452716d), (-1.4000676141929564d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9893588.34062762d) + "'", double3 == (-9893588.34062762d));
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.227865789907042d), 9.302232499477762E10d, 162772.69699750235d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-571486.0460009018d) + "'", double3 == (-571486.0460009018d));
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.015902138556718E-4d), (-29.279003267973856d), (-5.84276518997853d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.011018024133122d) + "'", double3 == (-5.011018024133122d));
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.505351936903913E15d, (-67.87558463488088d), (-0.7371758664955071d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.3985810588378105E15d) + "'", double3 == (-3.3985810588378105E15d));
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 42.40967615841203d, 42.21606629824469d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0045861653428234d) + "'", double3 == (-1.0045861653428234d));
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 9.681947024916315d, 114.7323696682487d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.08438723137081444d) + "'", double3 == (-0.08438723137081444d));
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.6674179665974676E13d, (-31380.09976993993d), (-5.744848552657145d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.9024576617676934E12d) + "'", double3 == (-2.9024576617676934E12d));
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.413857741260789d, (-44.64002291424865d), 20.85909840205065d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.4475593178317983d + "'", double3 == 2.4475593178317983d);
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(68.14571631970391d, 1.1026958610090727E11d, (-5.425453206243638E10d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0324493059098323d + "'", double3 == 2.0324493059098323d);
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2308833.4116319716d, (-0.6174981309146284d), (-48.56521324652172d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-47540.90170283486d) + "'", double3 == (-47540.90170283486d));
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(68.14571631970391d, (-3523663.8319391436d), (-677427.3042814778d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.201638545397806d) + "'", double3 == (-5.201638545397806d));
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.02d, (-5530.313772316746d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.6164313316388285E-6d + "'", double3 == 3.6164313316388285E-6d);
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1469.8632083517716d, 0.00514629998467077d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8.841848452135304E10d, (-0.003641239572747525d), (-4.5563924799417606E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.9405370566867156E14d) + "'", double3 == (-1.9405370566867156E14d));
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.5473306201494515E8d), (-117.58846188300636d), 6.829367844867088d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.7299637420751765E7d) + "'", double3 == (-3.7299637420751765E7d));
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(18970.42714396637d, (-230617.41344533928d), (-4.057460335443251d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-61513.316201534675d) + "'", double3 == (-61513.316201534675d));
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2247.4992407486698d), 14.947763715084315d, 0.6947368421052632d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3256.5525064251005d) + "'", double3 == (-3256.5525064251005d));
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.33391548734539833d, (-30544.27372620324d), (-2021.4566648401276d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-15.110196608694695d) + "'", double3 == (-15.110196608694695d));
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-390059.53854209953d), (-950.4467915242641d), 6.010252156357536d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-64740.89299880417d) + "'", double3 == (-64740.89299880417d));
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-206664.29901807886d), (-56.98276689365725d), 0.02169555487390554d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9523025.221156403d) + "'", double3 == (-9523025.221156403d));
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1605.8057780908828d), (-3.327453864569369d), 21.27789925075722d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-75.3118672732359d) + "'", double3 == (-75.3118672732359d));
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5530.313772316746d), (-6.706429677552379E12d), 0.03790395662113255d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.769321799055415E14d + "'", double3 == 1.769321799055415E14d);
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.015973479995594054d), (-0.047644577002569036d), 50.492714018919415d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.272409321294941E-4d + "'", double3 == 6.272409321294941E-4d);
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(59551.38860600938d, 25818.73660238466d, 9.818018633727817d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3435.790179470939d + "'", double3 == 3435.790179470939d);
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-436.9911763606548d), 0.953501242653814d, (-75.3118672732359d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.81508191815799d + "'", double3 == 5.81508191815799d);
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.5592487208195512E-8d), 0.8863052387844411d, 599.7651782375282d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0014777537718702305d) + "'", double3 == (-0.0014777537718702305d));
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.003892003156145203d), 74675.12905555408d, 1.1517885680153465E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.483406331791466E10d) + "'", double3 == (-6.483406331791466E10d));
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.4704957417854d, (-39.653068922805026d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5678.678064360523d, (-0.31150535777329197d), (-0.020702218284624194d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-274317.92533731303d) + "'", double3 == (-274317.92533731303d));
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7087637.321159789d), (-0.492719128061608d), (-4004.667734764985d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1769.8439166156193d + "'", double3 == 1769.8439166156193d);
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.0649190948203606d, 1.3142124542124545d, 0.33391548734539833d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.2481935371610478d + "'", double3 == 2.2481935371610478d);
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-31.10754102712416d), 1.8964397017624156E-8d, (-139.5011600477429d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.22299127143775943d + "'", double3 == 0.22299127143775943d);
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.3704487179596434d, (-1.000286391437786d), 4378.142727197024d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.1308598070191323E-4d + "'", double3 == 3.1308598070191323E-4d);
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4425.090047559527d), 107.40523312663682d, 0.019549989978888866d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-231841.3096671966d) + "'", double3 == (-231841.3096671966d));
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3044.3181562776035d, (-222.75294866864752d), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 326.7071104946251d + "'", double3 == 326.7071104946251d);
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-1.673457888166022E-5d), (-1.0582328792703213d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.5813701510766837E-5d) + "'", double3 == (-1.5813701510766837E-5d));
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.004232624137775097d), (-1255538.8941703308d), (-1961.506159005122d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-640.0891907341843d) + "'", double3 == (-640.0891907341843d));
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0015898810127189268d), 36.083486963278496d, 961.3970359880889d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.03753400051541067d) + "'", double3 == (-0.03753400051541067d));
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-611.250491851009d), 0.0d, 0.17247080443293847d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3544.0809466896208d) + "'", double3 == (-3544.0809466896208d));
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.324645884083895E-4d, 0.004060680773412489d, (-232260.55752452716d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.56213186762068E-8d + "'", double3 == 1.56213186762068E-8d);
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.3497925857524113d), (-9893588.34062762d), 25.836243243316517d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 382934.3491490145d + "'", double3 == 382934.3491490145d);
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.491069855535275E-7d, 219.99473074203414d, (-2.5760061625568988E11d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.540147678628386E-10d + "'", double3 == 8.540147678628386E-10d);
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0016339285714285715d, 5.8248705009503976E-9d, (-184023.75077283388d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.878868840006684E-9d) + "'", double3 == (-8.878868840006684E-9d));
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-90.97678586785491d), (double) 100L, (-9105.932177423267d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.020972788084382174d + "'", double3 == 0.020972788084382174d);
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(498.5365853658536d, (-23.81572573286746d), 0.0014412669839387155d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 362425.7801779578d + "'", double3 == 362425.7801779578d);
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(213.07831205463037d, (-2.1219070086452894E-7d), (-1.1719640415995845E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.8181301192142022E-6d) + "'", double3 == (-1.8181301192142022E-6d));
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-258736.8504784611d), 58.526619029791355d, 68.33333333333334d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3787.2494209388906d) + "'", double3 == (-3787.2494209388906d));
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6645741.810621124d), 610.6717742902828d, 231.84827107328528d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-28666.819259111744d) + "'", double3 == (-28666.819259111744d));
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3080.7231536915333d), (-0.03485350665241561d), (-31559.786016838494d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.09761435956952313d + "'", double3 == 0.09761435956952313d);
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 434793.49466778926d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1686.843109477062d), 7859263.422388127d, (-6.813865147198482d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1153669.7741559548d + "'", double3 == 1153669.7741559548d);
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.315406999124883d), (-107.43934860046176d), 1.7613584666792286d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 60.81893244780697d + "'", double3 == 60.81893244780697d);
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.588504832975711d), 280183.49393287726d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-58.19597822470113d), (-2184632.52202271d), 0.0016375408896772724d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3340578789913592E9d + "'", double3 == 1.3340578789913592E9d);
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1321.0332618716707d), (-4.819545057819954E17d), 10628.710420283502d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.5344589016391586E13d + "'", double3 == 4.5344589016391586E13d);
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.8626146032068838d), (-11892.311379421735d), 9.771763781699457E-7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.2167147129656437E10d + "'", double3 == 1.2167147129656437E10d);
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(213.07831205463037d, 0.1852516396085581d, 7.875998737074463d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 27.030611294143107d + "'", double3 == 27.030611294143107d);
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.6668216078139844E9d, (-3647.7283598492904d), (-41.35294659150376d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.030729108635767E7d) + "'", double3 == (-4.030729108635767E7d));
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(14.444541589784027d, 0.9292419531570836d, (-0.0424390243902439d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-318.46395695500274d) + "'", double3 == (-318.46395695500274d));
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.10499533114778578d), 1.1948118355058969E-5d, 262696.344917638d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.997287411785775E-7d) + "'", double3 == (-3.997287411785775E-7d));
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.4609783275837713E8d), 0.37541244755758096d, (-232.5951625391871d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1058052.2417026947d + "'", double3 == 1058052.2417026947d);
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.5141614131615206d), (-4004.667734764985d), (-1147.0772263835156d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.489000985548062d) + "'", double3 == (-3.489000985548062d));
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2840.4091094178507d), 85450.51219703836d, 0.15888065386712802d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-555705.9286796111d) + "'", double3 == (-555705.9286796111d));
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.23007705294454095d, (-3.1899127808776044d), (-85450.51646580474d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.0023044625958974E-5d) + "'", double3 == (-4.0023044625958974E-5d));
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2115.7793041403506d, 1.0240697347356706d, (-7183.620461572214d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.2943857134042933d) + "'", double3 == (-0.2943857134042933d));
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(16.811315308380642d, (-9.638107591704713E12d), 2.9293490277180415E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 329018.75128309976d + "'", double3 == 329018.75128309976d);
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7589.721624917432d), 0.0011294597975129053d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.7091915018384818d), 6817484.355556762d, (-1501.754620369026d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4539.679766773752d + "'", double3 == 4539.679766773752d);
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-127.9691388195903d), (-1.4481903954008661E7d), (-4169449.818878871d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.473306218796001d) + "'", double3 == (-3.473306218796001d));
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(31.666666666666664d, (-0.17859974514930188d), (-0.03373477679865521d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-943.9892429667841d) + "'", double3 == (-943.9892429667841d));
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.2109533306969795d, (-20.115373566138874d), (-9.638107591704713E12d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.316463754363106E-12d) + "'", double3 == (-2.316463754363106E-12d));
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.4855227054802647E10d), (-2.2392224780199032E7d), 68.14571631970391d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.1766349568378705E8d) + "'", double3 == (-2.1766349568378705E8d));
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.7792320293230807d, 5.81508191815799d, 20.217292653100632d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.2490862636873679d) + "'", double3 == (-0.2490862636873679d));
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.020527867595720343d), (-4.871159833591822E7d), 1.9118381070872112d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.5478934714616135E7d + "'", double3 == 2.5478934714616135E7d);
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.003907855524390268d), (-0.640035035290495d), 5.495024606954893E-9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.1576420949252476E8d + "'", double3 == 1.1576420949252476E8d);
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.5020705481508303d), (-2959.7992059068197d), (-5.270217722981408E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.609440237103271E-5d) + "'", double3 == (-5.609440237103271E-5d));
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1646.1322506763238d), (-7.450266903371965E-6d), (-19.08257435763428d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 86.26363573253921d + "'", double3 == 86.26363573253921d);
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.583223394584583d), 95.64798656102286d, 3.575547437284293d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-28.591764407761374d) + "'", double3 == (-28.591764407761374d));
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(68255.63649544693d, 7.06120382455683E7d, (-3.424338359657732d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.060070448649351E7d + "'", double3 == 2.060070448649351E7d);
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.011018024133122d), (-0.0014167505396309205d), (-0.0737847753545197d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 67.89478248762639d + "'", double3 == 67.89478248762639d);
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.42214589785264567d), 31917.477715721667d, 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-319.1789986161952d) + "'", double3 == (-319.1789986161952d));
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.324645884083895E-4d, (-4.819545057819954E17d), 64.2179019833403d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.504986785569953E15d + "'", double3 == 7.504986785569953E15d);
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.841342119658053E7d, (-60.536079301173494d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.1834385476739E-18d, (-105.35026781283747d), (-0.03500183740763517d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3009.8496426320967d) + "'", double3 == (-3009.8496426320967d));
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4244.555418052495d, 0.0d, (-9520.705174543298d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.4458236380853064d) + "'", double3 == (-0.4458236380853064d));
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(125.52511591592129d, 3.5552157025110684E7d, (-86.42822280445478d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 411347.4782471439d + "'", double3 == 411347.4782471439d);
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(59.97350352930122d, 5.764457700256903d, 0.00514629998467077d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10533.596174050528d + "'", double3 == 10533.596174050528d);
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11.391352756079183d, (-3.4192793605482405E8d), (-348.29850002547926d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-981709.5032598865d) + "'", double3 == (-981709.5032598865d));
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.80111366801026E-5d), (-2.2532496793687304E23d), 6.733333333333334d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.3464104149040545E22d + "'", double3 == 3.3464104149040545E22d);
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(51.546592831758396d, 0.0d, 11.484264408496168d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.48845402702708d + "'", double3 == 4.48845402702708d);
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.8012712248606264E-4d, (-3532.8464053416346d), (-7399.344826004147d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.4774540136382039d) + "'", double3 == (-0.4774540136382039d));
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-48.56521324652172d), 60.78212003088318d, 3.04900500074339E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.586328433398584E-6d) + "'", double3 == (-3.586328433398584E-6d));
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2308833.4116319716d, 2176.404460537546d, 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 23066.570071714337d + "'", double3 == 23066.570071714337d);
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.01119411611366275d), 0.261351713964122d, (-16.026906242540846d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.017005517219184554d + "'", double3 == 0.017005517219184554d);
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-221.78895886879707d), (double) ' ', 0.004549979583280079d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-55778.0434447226d) + "'", double3 == (-55778.0434447226d));
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.973486285373436d, (-3980.65074896532d), (-0.008044917151602828d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-495794.32082231203d) + "'", double3 == (-495794.32082231203d));
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.19648313999557906d, (-2.9279365079365083d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06710635270368362d + "'", double3 == 0.06710635270368362d);
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-17497.927436058242d), (-0.06634316602523686d), 2.7567898564924915d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6347.187128421544d) + "'", double3 == (-6347.187128421544d));
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.13625250546110876d), (-0.014329788426196555d), 9685905.616190005d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.2587642484469206E-8d) + "'", double3 == (-1.2587642484469206E-8d));
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.1916777106423085E-11d), 114.7323696682487d, 25.01838673699937d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.585921981076597d) + "'", double3 == (-4.585921981076597d));
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.830727378007184E-10d), 5.81508191815799d, 0.0029255559974682515d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1987.6843662105186d) + "'", double3 == (-1987.6843662105186d));
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.0599135034971061d, (-4947912.4162737755d), (-18387.29941501966d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-269.09408306831494d) + "'", double3 == (-269.09408306831494d));
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.15888065386712802d, 2392.665682152357d, (-1223.7100442385943d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.9551255730577366d + "'", double3 == 1.9551255730577366d);
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1000909.86017476d, 5.273266038932729d, 574.9789906459908d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1740.767233571789d + "'", double3 == 1740.767233571789d);
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3619432066345235E7d, 0.04885884127587127d, (-140379.27954953242d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.01881973743009d) + "'", double3 == (-97.01881973743009d));
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-161.92118226600988d), 1461.1037619556068d, 0.002609834244060252d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-621888.1325185596d) + "'", double3 == (-621888.1325185596d));
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.1899127808776044d), 4929.2106393424765d, (-0.9701558956916101d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5084.131915321833d + "'", double3 == 5084.131915321833d);
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.0697363995988333E8d, 0.01729988972795197d, (-0.0013914286052816231d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.2061760034066025E11d) + "'", double3 == (-2.2061760034066025E11d));
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.07329053716153547d, 1.9118381070872112d, 0.5180301307639676d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.5491131900267425d) + "'", double3 == (-3.5491131900267425d));
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.03677573154660464d, (-0.05636670655498643d), (-838549.27644922d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1107568835548508E-7d) + "'", double3 == (-1.1107568835548508E-7d));
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-447.4682449652029d), 11096.134850306027d, 8808183.796906078d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0013105542937609889d) + "'", double3 == (-0.0013105542937609889d));
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(32.98195719587933d, (-4.4999183035714285d), (-6.705583744355958E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-55896.51390305726d) + "'", double3 == (-55896.51390305726d));
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2144483607698758d), 37.64234469229499d, (-0.003392245521890975d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11159.803383559913d + "'", double3 == 11159.803383559913d);
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.462338981444688d, 0.0d, 0.10715747082037681d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 41.642817316253236d + "'", double3 == 41.642817316253236d);
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.6947368421052632d, 99567.08401717755d, (-6.3162079168002525E10d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.5763633906905187E-6d + "'", double3 == 1.5763633906905187E-6d);
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-184.25216526275173d), 0.03790395662113255d, 92.26233406017359d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.9974572624531557d) + "'", double3 == (-1.9974572624531557d));
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(12831.76042603731d, 5.616698045830711d, (-717.351836035973d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-17.879850700414583d) + "'", double3 == (-17.879850700414583d));
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.03841099193478857d), 0.14332976584043497d, (-181.04827331075674d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.001003824860915841d + "'", double3 == 0.001003824860915841d);
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0037949761453878596d, 0.8996685492986446d, 411347.4782471439d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.177899757574306E-6d) + "'", double3 == (-2.177899757574306E-6d));
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.03430050119057761d), 0.0d, (-22.862368511464002d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0015003039240391093d + "'", double3 == 0.0015003039240391093d);
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-496.2252564778924d), 6.4704957417854d, (-7116507.983360336d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.063798050884929E-5d + "'", double3 == 7.063798050884929E-5d);
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.820528374206212d, 1.5102365017054655E15d, (-0.34545264431260303d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.371761300917517E15d + "'", double3 == 4.371761300917517E15d);
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.5592487208195512E-8d), (-595966.1814338439d), 810.3756614002864d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 735.4196452593729d + "'", double3 == 735.4196452593729d);
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2980918.4195705717d), (-50822.6418952214d), (-258736.8504784611d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11.32461716317935d + "'", double3 == 11.32461716317935d);
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.453426257781344d, (-7.450266903371965E-6d), 25.05056375532771d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1378585225377923d + "'", double3 == 0.1378585225377923d);
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0032785402170468036d, (-1.316311424295841E8d), (-0.07089547030267625d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.8566932678616235E9d) + "'", double3 == (-1.8566932678616235E9d));
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.0931547619047617d), (-1.6239623232758535E-4d), 23066.570071714337d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.340898259280106E-4d) + "'", double3 == (-1.340898259280106E-4d));
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-181.04827331075674d), (-0.05636670655498643d), 0.5207939610974548d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-347.5307321590336d) + "'", double3 == (-347.5307321590336d));
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-0.033695177826166135d), (-693868.8945905869d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.856130327912706E-8d) + "'", double3 == (-4.856130327912706E-8d));
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7589.721624917432d), 0.020972788084382174d, (-1.03446372644643d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7336.886160114724d + "'", double3 == 7336.886160114724d);
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(203710.45534935882d, (-5694566.743298978d), (-269.09408306831494d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-21919.014834491696d) + "'", double3 == (-21919.014834491696d));
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-640.0891907341843d), 46.64578469753089d, 0.8606483867631493d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-797.9274532942393d) + "'", double3 == (-797.9274532942393d));
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.773192338981669E7d, 0.21713154176112798d, 5963.6309716088d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2973.3434642589286d + "'", double3 == 2973.3434642589286d);
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.495024606954893E-9d, (-0.041836835908971234d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.007085902530838871d, 1112.3224604020604d, 2.138675582324624d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-520.0954196571054d) + "'", double3 == (-520.0954196571054d));
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.3667780947205946E-11d, (-41561.496272450415d), (-6.856033957438632d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6062.031858427015d) + "'", double3 == (-6062.031858427015d));
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 2.779126012999823E8d, 0.051378977802173126d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.4090722156840515E9d) + "'", double3 == (-5.4090722156840515E9d));
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-126.23618422351787d), (-3144.743169398907d), 0.017659035228367304d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 170932.7234551573d + "'", double3 == 170932.7234551573d);
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.387526904651709d), 0.019230769230769232d, (-1.3073147507737182E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3111.398181973727d + "'", double3 == 3111.398181973727d);
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(298.12196409159696d, 2.7270036841105627d, 0.002609834244060252d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 113185.33392677283d + "'", double3 == 113185.33392677283d);
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.01119411611366275d), (-216.4416206660676d), 1.1517885680153465E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.8790812182038447E8d + "'", double3 == 1.8790812182038447E8d);
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.2887659395329154d, 115.31028430062946d, (-0.05729572789109639d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1990.0527065092963d + "'", double3 == 1990.0527065092963d);
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(113185.33392677283d, (-5592.441403851674d), (-36816.32715833758d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.2262255498706254d) + "'", double3 == (-3.2262255498706254d));
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-918.453064571191d), 0.005141121230260358d, (-1623.7107940945573d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5656538153425212d + "'", double3 == 0.5656538153425212d);
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(75.86337066683967d, 1154.7149998702048d, (-231841.3096671966d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.00465340551583337d + "'", double3 == 0.00465340551583337d);
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(496.6104080885199d, 5.4578806942783125d, 1.5976202088254312d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 307.4275880344155d + "'", double3 == 307.4275880344155d);
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2184632.52202271d), (-13.659944808043116d), (-3.4621535909468832d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 630999.9844577718d + "'", double3 == 630999.9844577718d);
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-26.08692184267441d), 0.0075012565845753165d, 1.0867386451984958E8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.4011682307012064E-7d) + "'", double3 == (-2.4011682307012064E-7d));
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1740.767233571789d, 18970.42714396637d, (-0.028043194867287867d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 614397.1823443279d + "'", double3 == 614397.1823443279d);
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.33391548734539833d, 2.788513313194004E7d, (-1605.8057780908828d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 17365.196450579937d + "'", double3 == 17365.196450579937d);
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.607592099632522E17d, (-0.06149932778649347d), (-36717.982617732654d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.1016758376404E12d) + "'", double3 == (-7.1016758376404E12d));
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.07089547030267625d), (-17.21311475409836d), (-0.01534717083845554d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1116.9628242387369d) + "'", double3 == (-1116.9628242387369d));
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.135416666666667d, (-12060.887424865063d), (-0.019197041519533612d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-628379.2650683811d) + "'", double3 == (-628379.2650683811d));
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.009748709122203098d), (-855.4205352124766d), (-7.525321032953368E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1367100257351308E-5d) + "'", double3 == (-1.1367100257351308E-5d));
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.06444874751764998d, (-2980918.4195705717d), 1469.8632083517716d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2028.024422328365d + "'", double3 == 2028.024422328365d);
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.953501242653814d, (-3.9058916660530664E7d), (-46.936547120375366d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-832164.27305272d) + "'", double3 == (-832164.27305272d));
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2857142857142857d), (-3472.2450749222744d), (-1.673457888166022E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.0747216796961373E8d) + "'", double3 == (-2.0747216796961373E8d));
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-276751.0793838959d), (-0.23312849541459077d), (-1.4000676141929564d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 197669.62927353228d + "'", double3 == 197669.62927353228d);
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.7139027624277867d), (-1.6239623232758535E-4d), 0.10767296306181094d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-25.203544966414682d) + "'", double3 == (-25.203544966414682d));
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.775075467542426E11d), 5084.131915321833d, 0.17612766619814846d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.278914461903235E12d) + "'", double3 == (-3.278914461903235E12d));
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.103835691184848E-4d), 424388.5246618761d, 1260.9582566377621d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-336.5603285741239d) + "'", double3 == (-336.5603285741239d));
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-53.00142506533407d), 7336.886160114724d, (-5.439520370575405d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1358.5549978183717d + "'", double3 == 1358.5549978183717d);
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(108.19653698126714d, (-71.4347613908908d), (-8.60508745826035d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-20.87501135153752d) + "'", double3 == (-20.87501135153752d));
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(300.17685967298576d, (-596362.8549733063d), 0.17612766619814846d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3387673.5251900572d + "'", double3 == 3387673.5251900572d);
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1459987.3038599016d, (-852.6097101830538d), (-86920.64717975413d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-16.806592690791064d) + "'", double3 == (-16.806592690791064d));
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5592.441403851674d), 30529.057009980253d, 223589.88869996622d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.16155246833323095d) + "'", double3 == (-0.16155246833323095d));
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-14.116811280841457d), (-5900332.769841715d), 2853.87309695617d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2067.4775831215075d + "'", double3 == 2067.4775831215075d);
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0075012565845753165d, 125.52511591592129d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(24.808215899027566d, (-1255538.8941703308d), (-0.2437571795920304d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5150878.856112595d) + "'", double3 == (-5150878.856112595d));
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(48.51857524710401d, 2949898.722691108d, (-1.8354533699461755d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1607150.7194990006d + "'", double3 == 1607150.7194990006d);
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.04777980054847063d), 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.09137094436930399d), (-22.862368511464002d), (-70583.59990317124d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.226103173872211E-4d) + "'", double3 == (-3.226103173872211E-4d));
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-1.0156879047856051d), 9.64353371263511d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.10532320776302517d + "'", double3 == 0.10532320776302517d);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.010644913539679234d), 4.378113357628471E-17d, (-2.316463754363106E-12d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.595329203674942E9d + "'", double3 == 4.595329203674942E9d);
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.72344564806855E-5d), (-606.8342299716378d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.407706191138976E-4d, 1480.6547693272564d, (-0.1525255461339563d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9707.584506901194d + "'", double3 == 9707.584506901194d);
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.016815516480078976d, 1046.6286357600898d, (-0.005709848924953292d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 183299.3891781771d + "'", double3 == 183299.3891781771d);
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-165.75236969763668d), 2.4309755204295454E-7d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.14332976584043497d, 0.0d, (-1.0243924841168716E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1399.168463872512d) + "'", double3 == (-1399.168463872512d));
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.685075834962053d), 626.4891973271514d, 90.51540701057033d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.028353450234405d) + "'", double3 == (-7.028353450234405d));
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 838.1437053899591d, (-1518585.3593761062d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.5192399967184E-4d + "'", double3 == 5.5192399967184E-4d);
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.005584544177643519d), 0.009091270513841624d, (-1.3073147507737182E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 112.25922971342166d + "'", double3 == 112.25922971342166d);
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3768.218638004764d), (-61513.316201534675d), 11.237674593054386d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5138.52728919737d + "'", double3 == 5138.52728919737d);
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.08194897038813646d, (-0.1d), 1740.767233571789d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0452228585139721E-4d + "'", double3 == 1.0452228585139721E-4d);
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-26.301275331512393d), 12.223507767800605d, (-86.42822280445478d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4457430900375671d + "'", double3 == 0.4457430900375671d);
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(27398.61526880327d, (-2.051418511051468d), (-0.0564841814930677d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-485103.36811160494d) + "'", double3 == (-485103.36811160494d));
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3506.236488741913d), 395.75027058366766d, 4378.142727197024d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.8912424748253267d) + "'", double3 == (-0.8912424748253267d));
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1753.0335108122406d, 2067.4775831215075d, 4.7120252798826817E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-667322.549502739d) + "'", double3 == (-667322.549502739d));
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-137.481191005291d), (-36.47398433482066d), 130.44738734084285d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.7743137576726702d) + "'", double3 == (-0.7743137576726702d));
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9415.565925956449d), 0.9833984993440535d, (-0.005129344935279409d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1835819.0847507995d + "'", double3 == 1835819.0847507995d);
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.5192399967184E-4d, (-1.5831170849805628E-5d), (-9523025.221156403d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.961920265214859E-11d) + "'", double3 == (-5.961920265214859E-11d));
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.08139237713031135d), (-0.6191644340245491d), (-2.8626146032068838d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.18786044628284618d) + "'", double3 == (-0.18786044628284618d));
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2578895571157029d), (double) ' ', (-48.72822680118256d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6619959656798522d + "'", double3 == 0.6619959656798522d);
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1604877.3901011017d), (-231527.20964874543d), (-20.319684608805325d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 67587.17996327706d + "'", double3 == 67587.17996327706d);
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(700.3584178094426d, 0.10767296306181094d, (-269.09408306831494d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.602252479362796d) + "'", double3 == (-2.602252479362796d));
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.5491131900267425d), 231.84827107328528d, 100.2164565887138d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.34888951651302d) + "'", double3 == (-2.34888951651302d));
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(157742.8413187583d, (-28666.819259111744d), (-0.00868851227836562d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.145472718523167E7d) + "'", double3 == (-2.145472718523167E7d));
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.3809805620442555E25d), 1.773192338981669E7d, 3.107672165448168d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.0532991327043767E25d) + "'", double3 == (-2.0532991327043767E25d));
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.041836835908971234d), (-0.006025256739270937d), (-73.85842848243861d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.8486787365392226E-4d + "'", double3 == 4.8486787365392226E-4d);
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.07317714068437882d), 8.744947822013767E8d, 1.6881153698032372d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.1803022347725135E8d) + "'", double3 == (-5.1803022347725135E8d));
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-153.29942073470883d), 3.1308598070191323E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 489640.0036533863d + "'", double3 == 489640.0036533863d);
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.0d, 0.028276881724881808d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.325443884910899d), (-9.638107591704713E12d), (-26.08692184267441d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.694612821637639E11d) + "'", double3 == (-3.694612821637639E11d));
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2973.3434642589286d, (-379.43816777049864d), 2.2481935371610478d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1491.322511434323d + "'", double3 == 1491.322511434323d);
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(95.64798656102286d, 124619.75980701079d, 879.8888888888889d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-141.52254153100745d) + "'", double3 == (-141.52254153100745d));
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(39.617291509619136d, (-7.637106596050425E-6d), (-4.856130327912706E-8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.158203440094719E8d) + "'", double3 == (-8.158203440094719E8d));
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.387526904651709d), 7.298232900384636d, (-68.33333333333334d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.11247453373223919d + "'", double3 == 0.11247453373223919d);
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.000286391437786d), 1058052.2417026947d, 0.025628608078652092d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.128406969048056E7d) + "'", double3 == (-4.128406969048056E7d));
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.34545264431260303d), (-0.0022646656629954167d), 9919727.524192939d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.459651263732963E-8d) + "'", double3 == (-3.459651263732963E-8d));
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 0, (-3.278914461903235E12d), 5.228571428571429d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.271147877957007E11d + "'", double3 == 6.271147877957007E11d);
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(92249.58419921181d, (-2.7156710676514543E-5d), (-1223.7100442385943d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-75.38516551424338d) + "'", double3 == (-75.38516551424338d));
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(131659.3676029271d, 362425.7801779578d, (-1147.0772263835156d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 201.17774746743677d + "'", double3 == 201.17774746743677d);
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.5554988778197253E7d, (-1.3183639896594069E10d), (-5.033532530587729E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.6222528224787473E13d) + "'", double3 == (-2.6222528224787473E13d));
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.3902592402152212E-4d), (-4.5563924799417606E-4d), 2.119255375089899d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4939838194782124E-4d + "'", double3 == 1.4939838194782124E-4d);
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.009954337617466431d), (-3.4192793605482405E8d), 153.7856441908908d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2223406.0782711417d + "'", double3 == 2223406.0782711417d);
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.7613584666792286d, 0.0022981397119101587d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7590603269673184d) + "'", double3 == (-1.7590603269673184d));
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.8451203032622264d), 952.0705174543298d, (-3506.236488741913d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.27177734326172376d + "'", double3 == 0.27177734326172376d);
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.8964397017624156E-8d, (-6.483406331791466E10d), (-184.25216526275173d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.5187680549348456E8d) + "'", double3 == (-3.5187680549348456E8d));
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3653987762386734E9d, (-20.319684608805325d), (-694274.8718878754d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1966.6544935517534d) + "'", double3 == (-1966.6544935517534d));
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(34.16666666666667d, (-0.5649782107488386d), (-53.37539162746745d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.6507051998760848d) + "'", double3 == (-0.6507051998760848d));
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8586.388369914019d), (-1.9915501626449266E8d), (-3.1899127808776044d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.243005484975481E7d) + "'", double3 == (-6.243005484975481E7d));
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1459369.861100138d, (double) (byte) 100, (-1.1593458532098562d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1258701.0658293972d) + "'", double3 == (-1258701.0658293972d));
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.5285441275553774E-4d), 16979.992812919598d, 7.3821612192148605d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2300.1385043687706d) + "'", double3 == (-2300.1385043687706d));
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.7272039881981354E9d, (-0.5387626085229231d), (-0.013052835125239286d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.3232404854307349E11d) + "'", double3 == (-1.3232404854307349E11d));
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.13873377200587783d), (-3.739830652011312E7d), (-2257516.808775793d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-16.56612532673d) + "'", double3 == (-16.56612532673d));
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-373.8995556680519d), (-2.7037398106351773d), (-17.783989825804095d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.872471222336255d + "'", double3 == 20.872471222336255d);
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.029274577084296767d), (-1.0100543270955753E7d), (-90.97678586785491d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-111023.30276156776d) + "'", double3 == (-111023.30276156776d));
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-20.319684608805325d), (-832164.27305272d), (-8663.342809865328d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-96.05344860883405d) + "'", double3 == (-96.05344860883405d));
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.748316900146477d, 0.007528883973507984d, (-3.739830652011312E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.9808063121108627E-8d) + "'", double3 == (-1.9808063121108627E-8d));
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(25818.73660238466d, (-18387.29941501966d), (-0.09414354371444772d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-469559.93234637764d) + "'", double3 == (-469559.93234637764d));
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.022619392780359786d, 0.03796943136102197d, (-1014.5423943655138d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.5130011979698459E-5d + "'", double3 == 1.5130011979698459E-5d);
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.298232900384636d, (-17759.47148852825d), (-0.2270553277265517d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-78248.63613341674d) + "'", double3 == (-78248.63613341674d));
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-273.47492579646894d), (-0.0020064545047003323d), (-16774.28987144538d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.016303099650584497d + "'", double3 == 0.016303099650584497d);
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.999836607142857d, 0.0d, (-0.07890275625931009d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-126.73621405922599d) + "'", double3 == (-126.73621405922599d));
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2257516.808775793d), (-0.22988703914749656d), (-1.3186540337544608d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1711985.4951348926d + "'", double3 == 1711985.4951348926d);
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-28.21311475409836d), 9.990971428571429d, 574.9789906459908d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.06644431675624768d) + "'", double3 == (-0.06644431675624768d));
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7336.886160114724d, (-60.536079301173494d), (-17.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-429.75500628987595d) + "'", double3 == (-429.75500628987595d));
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(75.83951627653596d, (-5.2491203062324345d), 284.04288761832095d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.2854802570931832d + "'", double3 == 0.2854802570931832d);
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.512823725253588E7d, 0.0d, (-1.3073147507737182E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.9221260402411923E11d) + "'", double3 == (-1.9221260402411923E11d));
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.06710635270368362d, (-5.467459891820589d), 0.027558778165378155d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 200.82770764769603d + "'", double3 == 200.82770764769603d);
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0032537872546947776d, 0.019549989978888866d, 7080.487307028615d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.3015651349331953E-6d) + "'", double3 == (-2.3015651349331953E-6d));
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(535.1740376761567d, (-4.220792659563041d), 1147713.356304015d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.699734714883293E-4d + "'", double3 == 4.699734714883293E-4d);
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.491069855535275E-7d, 95.64798656102286d, 7.875998737074463d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-12.14423586200882d) + "'", double3 == (-12.14423586200882d));
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(17.746401681584608d, (-6.583223394584583d), 0.017859418455625338d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1362.2854034480542d + "'", double3 == 1362.2854034480542d);
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0980248023915325E8d), 5297.471413713044d, (-12.207052935914845d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8995437.169564264d + "'", double3 == 8995437.169564264d);
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.6101172237222836d, 2.9459335129148602E7d, 180.3179173894772d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-163374.39975751704d) + "'", double3 == (-163374.39975751704d));
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.15225896938846545d, 3387673.5251900572d, (-2077.763169505585d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1630.4424982839612d + "'", double3 == 1630.4424982839612d);
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(23.378593212437185d, 20826.009523456178d, (-21.53556252309361d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 965.9664523708674d + "'", double3 == 965.9664523708674d);
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3086.91553409881d, 3.3839331854628965d, 2.4517408159225914E-9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.257690690992968E12d + "'", double3 == 1.257690690992968E12d);
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1531.9635775952681d), (-1255538.8941703308d), 4.54961223296115E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.7562940892141823E10d + "'", double3 == 2.7562940892141823E10d);
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0582328792703213d), 2423.9953657685182d, (-3.4651978376550696d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 699.8312108750605d + "'", double3 == 699.8312108750605d);
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(854847.725260599d, 8.81084214573422E-5d, (-3.354159244129613d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-254861.99758363565d) + "'", double3 == (-254861.99758363565d));
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.988806577226357d, 1459369.861100138d, (-2.958730825725353E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.932411761167178E9d + "'", double3 == 4.932411761167178E9d);
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 46.33494834999643d, (-0.315406999124883d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 146.90526360719872d + "'", double3 == 146.90526360719872d);
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.20370619995323E11d, (double) (short) 10, 0.355264517791192d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.203001114646823E11d + "'", double3 == 6.203001114646823E11d);
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-50.407545660980695d), 14.444541589784027d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.4897296911541784d + "'", double3 == 3.4897296911541784d);
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.495024606954893E-9d, (-2.6949686296169904d), 8933.264492222574d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.0167791824123113E-4d + "'", double3 == 3.0167791824123113E-4d);
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.03533714157721124d, (-16.026906242540846d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.00220486356146606d + "'", double3 == 0.00220486356146606d);
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 639443.9086095858d, (-23.538673630532d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 27165.672911160276d + "'", double3 == 27165.672911160276d);
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0015003039240391093d, (-2.316463754363106E-12d), (-6.049018668595742d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.4802435048590506E-4d) + "'", double3 == (-2.4802435048590506E-4d));
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.08632058739905799d, (-24704.68526079505d), (-17497.927436058242d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.411868443943421d) + "'", double3 == (-1.411868443943421d));
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.173415136233868E20d), (-99212.66715592718d), 0.005445821671331467d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.1547072362121156E22d) + "'", double3 == (-2.1547072362121156E22d));
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-46.936547120375366d), 10.439112130526627d, (-52.01396825396825d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.103081752400706d + "'", double3 == 1.103081752400706d);
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.081497898115024E-5d), (-1.3060791968549404E13d), (-1.8181301192142022E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.183639845422225E18d) + "'", double3 == (-7.183639845422225E18d));
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.583978433521822E-5d), 7080.487307028615d, (-8588.49800713237d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8244150882946432d + "'", double3 == 0.8244150882946432d);
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4378.142727197024d, (-1.1421086072347923E-5d), (-231841.3096671966d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.01888422190550443d) + "'", double3 == (-0.01888422190550443d));
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(265922.8856994398d, 59.97350352930122d, 0.007085902530838871d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.751997872378807E7d + "'", double3 == 3.751997872378807E7d);
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-348.29850002547926d), 4244.555418052495d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.08205771057768096d + "'", double3 == 0.08205771057768096d);
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.09284987420992283d), (-7.028353450234405d), (-3012.0898484574304d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0023025553436184297d) + "'", double3 == (-0.0023025553436184297d));
    }
}

