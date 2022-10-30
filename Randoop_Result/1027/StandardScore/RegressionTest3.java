package StandardScore;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1147713.356304015d, (-0.01534717083845554d), (-4.057460335443251d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-282864.9639838822d) + "'", double3 == (-282864.9639838822d));
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2900.5607116403717d, (-2.717338430158957E-5d), 42.40967615841203d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 68.39384314040382d + "'", double3 == 68.39384314040382d);
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(381.17139593922394d, (-2299.0769252473447d), (-129.31656548090515d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-20.726256618548483d) + "'", double3 == (-20.726256618548483d));
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-41.340724233317324d), (-622.7364595859364d), 6.643077221003559E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 875190.3914565492d + "'", double3 == 875190.3914565492d);
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-22.862368511464002d), 0.0d, 258736.8504784611d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.836147023196146E-5d) + "'", double3 == (-8.836147023196146E-5d));
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.100136813934669E7d, 0.07329053716153547d, (-20.726256618548483d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-530793.7785644676d) + "'", double3 == (-530793.7785644676d));
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.0101534650171442E-5d, 0.0d, (-0.43160436896995724d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.6573983248002416E-5d) + "'", double3 == (-4.6573983248002416E-5d));
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-20.726256618548483d), (-866.3339659824051d), (-171.92101887315275d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.91858246831218d) + "'", double3 == (-4.91858246831218d));
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-754.8638200168194d), (-0.004353056259791097d), (-0.2270553277265517d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3324.5617908145073d + "'", double3 == 3324.5617908145073d);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-599.5246103650596d), (-0.02357952454682086d), (-0.9569215772565901d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 626.4891973271514d + "'", double3 == 626.4891973271514d);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(287035.54962783895d, (-21777.583427379985d), (-81.95202102676626d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3768.218638004764d) + "'", double3 == (-3768.218638004764d));
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8.81084214573422E-5d, (-595966.1814338439d), 932.3236026237777d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 639.2267447104884d + "'", double3 == 639.2267447104884d);
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 'a', 0.01737925304935617d, 3.753743136477039d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.836243243316517d + "'", double3 == 25.836243243316517d);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.020527867595720343d), (-3.7213114754098355d), (-143.84968058754487d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.025726741920444312d) + "'", double3 == (-0.025726741920444312d));
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1128610764774275d, 4.341507509246353d, 278.65489571357875d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.015175209543475695d) + "'", double3 == (-0.015175209543475695d));
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 1.0921455421803116E-5d, 24.851043877147877d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.3947672684470583E-7d) + "'", double3 == (-4.3947672684470583E-7d));
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.833577161170763E-5d, 953.6363634384901d, (-0.046785698335864295d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20383.073012115197d + "'", double3 == 20383.073012115197d);
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-509665.8055992972d), 4244.555418052495d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-513910.3610173497d) + "'", double3 == (-513910.3610173497d));
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1405837852482137d, (-0.004353056259791097d), 38.191766154880995d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0037949761453878596d + "'", double3 == 0.0037949761453878596d);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2299.0769252473447d), 11.293553260128213d, 161.2009255255225d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-14.3322407794841d) + "'", double3 == (-14.3322407794841d));
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.9187189877335759d, 0.0d, (-1119.0111575101134d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.21009675880084E-4d) + "'", double3 == (-8.21009675880084E-4d));
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-201590.80145719493d), (-143.84968058754487d), 0.020697114400256043d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9733093.603334159d) + "'", double3 == (-9733093.603334159d));
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0642199076653532d), (-41.340724233317324d), 25.836243243316517d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.5976202088254312d + "'", double3 == 1.5976202088254312d);
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.112407246300548E13d), 0.049517001548323815d, 44247.520303499696d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.05941647888906E9d) + "'", double3 == (-2.05941647888906E9d));
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.403501046614858d, 0.28485144954940284d, (-5.2978206743815415d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.3436939516448383d) + "'", double3 == (-1.3436939516448383d));
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.9899495607422277E-4d), (-12060.887424865063d), 1469.8632083517716d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.205448750155846d + "'", double3 == 8.205448750155846d);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(68.14571631970391d, 1.6681931311196593E-7d, 92.15411821524455d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7394755380732579d + "'", double3 == 0.7394755380732579d);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1553.821497993468d), (-262.3990917404834d), 5.133109580275273E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2515867.5965451133d) + "'", double3 == (-2515867.5965451133d));
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1526315789473684d, 3163.887346055446d, 0.18860617878447877d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-16774.28987144538d) + "'", double3 == (-16774.28987144538d));
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(23.026151447024002d, (-44.64002291424865d), 11.391352756079183d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.940135101615696d + "'", double3 == 5.940135101615696d);
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(28.56079092674287d, 3238.731632229868d, 68.39384314040382d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-46.936547120375366d) + "'", double3 == (-46.936547120375366d));
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(576.4304228548518d, (-5.15695681635064E-6d), (-6.736273757317035d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-85.57111079187985d) + "'", double3 == (-85.57111079187985d));
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-70.04449342542814d), 0.0d, (-5.378796807381013d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 13.022334907559646d + "'", double3 == 13.022334907559646d);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1719640415995845E8d), (-0.09722222222222221d), (-8.60508745826035d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3619432066345235E7d + "'", double3 == 1.3619432066345235E7d);
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-13.64938407658132d), (-8.94206552414413E-4d), (-31559.786016838494d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.324645884083895E-4d + "'", double3 == 4.324645884083895E-4d);
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.008305859028016d), 18.16546891426259d, 0.2691000550805069d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-86.11583065769975d) + "'", double3 == (-86.11583065769975d));
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.260997845776212E18d), 381.17139593922394d, 2.616425058066798d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.819545057819954E17d) + "'", double3 == (-4.819545057819954E17d));
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.017659035228367304d, (-1.1221141284554832d), 0.08632058739905799d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 13.203955140095452d + "'", double3 == 13.203955140095452d);
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-36911.45604322116d), (-0.04799920498346337d), 117.68539165709558d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-313.6447737843823d) + "'", double3 == (-313.6447737843823d));
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5997.88850639995d, (-4.97271665616187d), 3.061156423001374d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1960.9782688499408d + "'", double3 == 1960.9782688499408d);
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9520.702958270625d), 11.484264408496168d, (-0.013924005935698557d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 684586.5526558252d + "'", double3 == 684586.5526558252d);
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1593458532098562d), (-73.85842848243861d), (-250.65930951686082d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.29003144854006946d) + "'", double3 == (-0.29003144854006946d));
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(12.166944436037914d, (-0.5381431908648426d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.05636670655498643d), 58.58234368006642d, 17.326447584017874d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.3843469702762654d) + "'", double3 == (-3.3843469702762654d));
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.5180301307639676d, 0.0d, 1.9062156082208216E-8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.7175841417407885E7d + "'", double3 == 2.7175841417407885E7d);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.357325234240991d), 6.7875477993298965d, (-75.0259680625998d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1752043108941045d + "'", double3 == 0.1752043108941045d);
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-20491.383131969695d), 1.3619432066345235E7d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1363992.3449477204d) + "'", double3 == (-1363992.3449477204d));
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-24704.68526079505d), (-3.3843469702762654d), (-0.6247594455480912d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39537.298859330935d + "'", double3 == 39537.298859330935d);
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(162772.69699750235d, 10.58956553019663d, (-0.02296422630797628d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7087637.321159789d) + "'", double3 == (-7087637.321159789d));
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(28.56079092674287d, 474.2632874824059d, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 100, 0.005875464115575659d, 1.6451240016813788d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 60.78212003088318d + "'", double3 == 60.78212003088318d);
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11.55316059649232d, (-0.0026713611904894117d), (-0.025726741920444312d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-449.17588062325603d) + "'", double3 == (-449.17588062325603d));
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.01703309720492361d), (-26406.993606320168d), 138.70940416242848d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 190.37625266056537d + "'", double3 == 190.37625266056537d);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 'a', (-606.8342299716378d), 0.3922269364749126d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1794.4566385400612d + "'", double3 == 1794.4566385400612d);
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.0173792530493562d, 1413.3683407971002d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(284.04288761832095d, (-41.340724233317324d), (-0.019837549573001118d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-16402.409514050312d) + "'", double3 == (-16402.409514050312d));
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.003907855524390268d), (-0.18278989428235987d), (-53.37539162746745d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0033513953397564453d) + "'", double3 == (-0.0033513953397564453d));
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) -1, (-19.08257435763428d), (-20491.383131969695d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.82447721619274E-4d) + "'", double3 == (-8.82447721619274E-4d));
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 8.81084214573422E-5d, (-6.234767913021508E-7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 141.3178849421564d + "'", double3 == 141.3178849421564d);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10.0f, (-0.23312849541459077d), (-24.240738918625162d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.42214589785264567d) + "'", double3 == (-0.42214589785264567d));
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.449978071646475d), 1.1434230600882967E-11d, 92249.58419921181d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0243924841168716E-4d) + "'", double3 == (-1.0243924841168716E-4d));
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.2482378344762843E9d), 76.42112965228029d, (-3.8426221743433523E9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3248401363089306d + "'", double3 == 0.3248401363089306d);
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.019230769230769232d, 1.2991569777479117d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.014802498512616825d) + "'", double3 == (-0.014802498512616825d));
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(64.2179019833403d, 2115.7793041403506d, 2.753675041129709E8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.450266903371965E-6d) + "'", double3 == (-7.450266903371965E-6d));
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.009146285732509897d), 0.007986855746552222d, (-1605.8057780908828d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0669497963465697E-5d + "'", double3 == 1.0669497963465697E-5d);
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.29397590361445786d), 3.5950772074083084E8d, (-0.10499533114778578d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.424035308091776E9d + "'", double3 == 3.424035308091776E9d);
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-166.57266975190436d), 11.293553260128213d, 58.596196556130764d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.0354567952486486d) + "'", double3 == (-3.0354567952486486d));
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.67919582268725d, (-0.05636670655498643d), 6.757614740032716d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.2568306415813569d + "'", double3 == 0.2568306415813569d);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.79862889834898d, 6.829367844867088d, (-34.13353624341552d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0301972505622514d + "'", double3 == 0.0301972505622514d);
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.228571428571429d, (-0.04777980054847063d), (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5276351229119899d + "'", double3 == 0.5276351229119899d);
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.753675041129709E8d, 2046.6526633199571d, 93304.39105865342d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2951.2593602074544d + "'", double3 == 2951.2593602074544d);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.505351936903913E15d, 22913.90558322626d, (-3.80111366801026E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.59109975575252E19d) + "'", double3 == (-6.59109975575252E19d));
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(95.64798656102286d, (-23.81572573286746d), (-378.760498737663d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.315406999124883d) + "'", double3 == (-0.315406999124883d));
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-30522.347387205173d), 240.70698897028777d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.9701558956916101d), (double) (short) 1, (-2.9279365079365083d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.672882041789935d + "'", double3 == 0.672882041789935d);
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(287143.6248012102d, (-60.536079301173494d), (-4.027936507936508d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-71303.050659963d) + "'", double3 == (-71303.050659963d));
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(74675.12905555408d, (-4.325443884910899d), 92.15411821524455d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 810.3756614002864d + "'", double3 == 810.3756614002864d);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-70583.59990317124d), 1.1059507740593383E-6d, 1147713.356304015d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.06149932778649347d) + "'", double3 == (-0.06149932778649347d));
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5963299421104871d), (-23.24610440052088d), (-5.806748001360767E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-390059.53854209953d) + "'", double3 == (-390059.53854209953d));
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.8365163560519195d), (-0.6936369643410254d), (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.31428793917108944d) + "'", double3 == (-0.31428793917108944d));
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(18.16546891426259d, (-0.35424982108957714d), (-0.037321193336271166d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-496.2252564778924d) + "'", double3 == (-496.2252564778924d));
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(476653.04349364195d, (-2257516.808775793d), 213.07831205463037d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12831.76042603731d + "'", double3 == 12831.76042603731d);
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2933575938864831d), 0.0d, 0.953501242653814d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.30766356745377826d) + "'", double3 == (-0.30766356745377826d));
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5886.953471402866d, (-0.33464438570438754d), (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5887.28811578857d + "'", double3 == 5887.28811578857d);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.5950772074083084E8d, (-7.820594347784853d), (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.595077285614252E8d) + "'", double3 == (-3.595077285614252E8d));
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.19468186134852805d), 15.793329548119049d, 2951.2593602074544d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.005417352207345044d) + "'", double3 == (-0.005417352207345044d));
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.049517001548323815d, 1612.7780985572388d, 1.67919582268725d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-960.4172186271933d) + "'", double3 == (-960.4172186271933d));
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.005445821671331467d, 0.09616853157123405d, (-12.803268109470071d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.007085902530838871d + "'", double3 == 0.007085902530838871d);
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.35195345621372265d), 11.293553260128213d, 25.01838673699937d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.46547792384708586d) + "'", double3 == (-0.46547792384708586d));
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-201590.80145719493d), 1.4599001644111297E-10d, (-3.460863231625546E13d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.8248705009503976E-9d + "'", double3 == 5.8248705009503976E-9d);
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.28125d, (-99.70956268961719d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.002820692342975111d + "'", double3 == 0.002820692342975111d);
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0038449516805433214d), 6.7875477993298965d, 348943.046169062d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.9462754239039993E-5d) + "'", double3 == (-1.9462754239039993E-5d));
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.006904238401965d, (-0.387526904651709d), (-3.0354567952486486d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.424338359657732d) + "'", double3 == (-3.424338359657732d));
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5694566.743298978d), (-91.61239241706083d), 66.64061689065804d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-85450.51646580474d) + "'", double3 == (-85450.51646580474d));
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7080.487307028615d, 1154.7149998702048d, (-0.004719704291657331d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1255538.8941703308d) + "'", double3 == (-1255538.8941703308d));
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8.13569881667462E-4d, 124619.75980701079d, (-19259.69260572524d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.4704957417854d + "'", double3 == 6.4704957417854d);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.24262767218969E-4d, 2.1564723573444404E-10d, 1.988806577226357d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.647322480503532E-4d + "'", double3 == 4.647322480503532E-4d);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.28891613658762E8d, (-20037.97917199869d), (-0.009748709122203098d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.425453206243638E10d) + "'", double3 == (-5.425453206243638E10d));
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(130.44738734084285d, 0.00284193505237051d, (-16402.409514050312d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.007952767262276412d) + "'", double3 == (-0.007952767262276412d));
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.413857741260789d, 5.081212852733868d, 223589.88869996622d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.960219830491476E-6d + "'", double3 == 5.960219830491476E-6d);
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.442666210788253d, 169.02211401103276d, (-4.4999183035714285d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 37.018327125636084d + "'", double3 == 37.018327125636084d);
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9072.484054390221d, (-694274.8718878754d), (-5.176774211958831E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0013586595187355624d) + "'", double3 == (-0.0013586595187355624d));
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.17859974514930188d), (-8.30230443750921d), (-87.01635555152085d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.09335836511275178d) + "'", double3 == (-0.09335836511275178d));
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.474228282204198E10d, (double) 10.0f, 2309.7573905377603d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6382610.949719558d + "'", double3 == 6382610.949719558d);
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.008305859028016d), 3.575547437284293d, (-0.028595986065227025d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 300.17685967298576d + "'", double3 == 300.17685967298576d);
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.004719704291657331d), 0.38985626873791157d, (-23.81572573286746d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01656787525416557d + "'", double3 == 0.01656787525416557d);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7087637.321159789d), 68.39384314040382d, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7087705.71500293d) + "'", double3 == (-7087705.71500293d));
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(928.9670256818828d, (-0.008789022205749395d), 153.7856441908908d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.0407186873110925d + "'", double3 == 6.0407186873110925d);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.02047435439772061d), 0.28125d, 397.37406115106495d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.59295545169008E-4d) + "'", double3 == (-7.59295545169008E-4d));
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.006904238401965d, 44247.520303499696d, 38.47058958622179d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1149.904742169715d) + "'", double3 == (-1149.904742169715d));
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.829789551647064d), (-6.959402790924032E-7d), 2.4309755204295454E-7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.8094848336851966E7d) + "'", double3 == (-2.8094848336851966E7d));
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 1, 254164.22954661612d, (-15.4449034606291d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 16456.122901286402d + "'", double3 == 16456.122901286402d);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(190.37625266056537d, 791.2764751368901d, 1154.7149998702048d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5203883404509932d) + "'", double3 == (-0.5203883404509932d));
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(65.45913638641358d, (-41232.77548435679d), (-0.011234997999734608d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3675855.9833939224d) + "'", double3 == (-3675855.9833939224d));
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.0d, 605.1695228040093d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.011951369809972E7d), (-18.264700793263554d), 2181.9304462292166d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4637.863434596325d) + "'", double3 == (-4637.863434596325d));
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.005159774436090226d, (-26.86131850564634d), (-0.6678280055136961d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-40.22963705964476d) + "'", double3 == (-40.22963705964476d));
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(465146.84984962095d, (-2.41957306327781d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-324.7976788448471d), (-2.072911887764989E-4d), (-0.01534717083845554d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 21163.34502120811d + "'", double3 == 21163.34502120811d);
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8588.49800713237d), 89.91771687002392d, 2347.155566344006d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.6974182062930465d) + "'", double3 == (-3.6974182062930465d));
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(854847.725260599d, 1.474228282204198E10d, (-0.15847193644261548d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.302232499477762E10d + "'", double3 == 9.302232499477762E10d);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.061156423001374d, (-190.41098095896922d), 105.48891863734055d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.8340517646892067d + "'", double3 == 1.8340517646892067d);
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-3.1899127808776044d), 3.4704140920127693d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9191735326972235d + "'", double3 == 0.9191735326972235d);
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.8903451663085776E-8d, (-6.385094722889697E-5d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-99.70956268961719d), 0.0d, (-3745.3768850495107d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0266220371807253d + "'", double3 == 0.0266220371807253d);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-13.659944808043116d), 0.017574460359640873d, 3.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.907862648115074d) + "'", double3 == (-3.907862648115074d));
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(50.492714018919415d, (-0.014802498512616825d), 1.8955615004590107d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 26.645147891641408d + "'", double3 == 26.645147891641408d);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.20980700448575385d), 1.4838076379066476d, (-2.263231850117096d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.748316900146477d + "'", double3 == 0.748316900146477d);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-52.17277789640387d), 2.2109533306969795d, 0.04456892170494916d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1220.2164456014157d) + "'", double3 == (-1220.2164456014157d));
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-64182.79240419197d), 278.7142577248092d, 0.7394755380732579d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-87171.92570003681d) + "'", double3 == (-87171.92570003681d));
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(599.7651782375282d, 0.0029255559974682515d, (-0.0038449516805433214d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-155986.9414527414d) + "'", double3 == (-155986.9414527414d));
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.3902592402152212E-4d), (-0.35424982108957714d), (-12.627334254936217d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.028043194867287867d) + "'", double3 == (-0.028043194867287867d));
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(38.47058958622179d, 284193.32437900436d, (-2260427.644899097d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.12570844920900023d + "'", double3 == 0.12570844920900023d);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-987.5422876539585d), 1753.0335108122406d, (-2.8094848336851966E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.754727149999918E-5d + "'", double3 == 9.754727149999918E-5d);
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3189912780877604d, (-13.659944808043116d), (-5882.984797258602d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0025461456390488846d) + "'", double3 == (-0.0025461456390488846d));
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-26.86131850564634d), 112.25635738831615d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.09722222222222221d), (-2.6949686296169904d), (-0.0022646656629954167d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1147.0772263835156d) + "'", double3 == (-1147.0772263835156d));
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2247.4992407486698d), 5678.678064360523d, 7.218577656757598E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0980248023915325E8d) + "'", double3 == (-1.0980248023915325E8d));
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.8955615004590107d, 20383.073012115197d, 23.026151447024002d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-885.1317380373126d) + "'", double3 == (-885.1317380373126d));
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-631.7732991932455d), (-1.0d), 7.298232900384636d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-86.42822280445478d) + "'", double3 == (-86.42822280445478d));
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(745.12238985951d, (-987.5422876539585d), (-9383772.589843672d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.8464478555125916E-4d) + "'", double3 == (-1.8464478555125916E-4d));
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 1.8955615004590107d, (-7.543551429449017E-8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.512823725253588E7d + "'", double3 == 2.512823725253588E7d);
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.1517885680153465E-6d, 1.988806577226357d, 0.0015511267324521702d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1282.1682354050427d) + "'", double3 == (-1282.1682354050427d));
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.6527390014518221d), (-127.9691388195903d), 3325.4330485669584d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03828566023092945d + "'", double3 == 0.03828566023092945d);
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-36717.982617732654d), (-2.6893307157254575E11d), (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.6893303485456314E10d + "'", double3 == 2.6893303485456314E10d);
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.9118185305298744d, (-2.255685442720362E7d), (-190.41098095896922d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-118464.04669215388d) + "'", double3 == (-118464.04669215388d));
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(278.7142577248092d, (-3.5980422167835707E-4d), (-9520.705174543298d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.029274577084296767d) + "'", double3 == (-0.029274577084296767d));
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5857718390563034d), (-5.80952380952381d), 0.005141121230260358d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1016.0725134666714d + "'", double3 == 1016.0725134666714d);
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(639.2267447104884d, 0.0d, 0.13935478660469144d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4587.045485016505d + "'", double3 == 4587.045485016505d);
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(34.16666666666667d, (-9227.722631526587d), (-6.234767913021508E-7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.4855227054802647E10d) + "'", double3 == (-1.4855227054802647E10d));
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 1.8340517646892067d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.6573983248002416E-5d), 0.672882041789935d, 203710.45534935882d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.303358262191922E-6d) + "'", double3 == (-3.303358262191922E-6d));
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.5618252086791627E-4d), 0.017574460359640873d, (-1686.843109477062d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0570421623879688E-5d + "'", double3 == 1.0570421623879688E-5d);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.681947024916315d, 1015.5245476514809d, (-40.54473746602599d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 24.808215899027566d + "'", double3 == 24.808215899027566d);
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(59.552578146489715d, 2309.7573905377603d, 3086.91553409881d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.7289492658723467d) + "'", double3 == (-0.7289492658723467d));
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-960.4172186271933d), Double.NaN, (-0.18913938314149753d));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0038798067161635195d, (-1014.5423943655138d), (-0.03430050119057761d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-29578.176381018216d) + "'", double3 == (-29578.176381018216d));
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1282.1682354050427d), (-1321.0332618716707d), 52.55596729571826d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7394978813337217d + "'", double3 == 0.7394978813337217d);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1255538.8941703308d), (-9.990971428571429d), 14.444541589784027d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-86920.64717975413d) + "'", double3 == (-86920.64717975413d));
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.302580907015185E-4d), (-0.13774983309039368d), (-378.760498737663d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.6307792248140675E-4d) + "'", double3 == (-3.6307792248140675E-4d));
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.007986855746552222d, (double) (-1L), 0.19780471976807312d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.095868576485035d + "'", double3 == 5.095868576485035d);
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-36816.32715833758d), (-165.75236969763668d), 1.9145084333160613E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.9143595374588459E9d) + "'", double3 == (-1.9143595374588459E9d));
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.465365853658536d), 0.0d, (-0.16449752507649265d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 27.145489584612932d + "'", double3 == 27.145489584612932d);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1794.4566385400612d, 3.061156423001374d, 0.15225896938846545d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11765.451252639104d + "'", double3 == 11765.451252639104d);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.02296422630797628d), 104.39867431758901d, (-0.03430050119057761d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3044.3181562776035d + "'", double3 == 3044.3181562776035d);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0156879047856051d), 1469.8632083517716d, (-87.01635555152085d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 16.90347621356856d + "'", double3 == 16.90347621356856d);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-41.340724233317324d), 0.4425816845525891d, 265922.8856994398d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.5712564869311635E-4d) + "'", double3 == (-1.5712564869311635E-4d));
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2260427.644899097d), (double) ' ', 5.8248705009503976E-9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.8807036903743625E14d) + "'", double3 == (-3.8807036903743625E14d));
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(190.37625266056537d, (-18.264700793263554d), 0.38985626873791157d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 535.1740376761567d + "'", double3 == 535.1740376761567d);
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-181.04827331075674d), (-1.4000676141929564d), 97.87674731384321d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.8354533699461755d) + "'", double3 == (-1.8354533699461755d));
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-127.9691388195903d), 0.0d, 838389.069754146d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.5263693604344902E-4d) + "'", double3 == (-1.5263693604344902E-4d));
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.371218100028564d), (-0.03500183740763517d), (-0.004353056259791097d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1225.8551105601869d + "'", double3 == 1225.8551105601869d);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.21713154176112798d, 0.0019673532426922945d, 300.17685967298576d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.167913900919501E-4d + "'", double3 == 7.167913900919501E-4d);
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.17859974514930188d), 0.4822630255857173d, (-0.01703309720492361d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 38.79874357459719d + "'", double3 == 38.79874357459719d);
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.00829998128464948d), 6.0407186873110925d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.049018668595742d) + "'", double3 == (-6.049018668595742d));
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.046785698335864295d), (-0.02296422630797628d), (-1.9462754239039993E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1223.9517457454683d + "'", double3 == 1223.9517457454683d);
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0072407223910658375d, (-50.17055488661449d), (-3.073516221517825E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-163258.6002237716d) + "'", double3 == (-163258.6002237716d));
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.6307792248140675E-4d), 7.403501046614858d, 16.811315308380642d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.44040956871747117d) + "'", double3 == (-0.44040956871747117d));
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.02169555487390554d, 0.0d, (-514.2849452337225d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.218586422755532E-5d) + "'", double3 == (-4.218586422755532E-5d));
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(31.666666666666664d, 56454.23168323412d, 9.302232499477762E10d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.065486432395135E-7d) + "'", double3 == (-6.065486432395135E-7d));
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.0931547619047617d), 95.64798656102286d, 831.3978409419682d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.11876521258589579d) + "'", double3 == (-0.11876521258589579d));
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.9191735326972235d, 0.0d, 17.326447584017874d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.053050316762281974d + "'", double3 == 0.053050316762281974d);
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 26.645147891641408d, (-324.7976788448471d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.08203614011776714d + "'", double3 == 0.08203614011776714d);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7.450266903371965E-6d), 2176.404460537546d, (-18.87433095138013d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 115.31028430062946d + "'", double3 == 115.31028430062946d);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2897.3890658822615d), 0.00284193505237051d, 4320864.548527976d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.705583744355958E-4d) + "'", double3 == (-6.705583744355958E-4d));
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.361082720450376E-5d, (-0.5282846310233278d), 278.7142577248092d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0018956268910081783d + "'", double3 == 0.0018956268910081783d);
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7.822062407465601E-8d), (-490674.94776992063d), (-0.004268766379812227d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1494537393527402E8d) + "'", double3 == (-1.1494537393527402E8d));
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-26.15665278012303d), (-9520.702958270625d), (-36816.32715833758d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.2578895571157029d) + "'", double3 == (-0.2578895571157029d));
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2721311475409836d), 2.263231850117096d, (-1.163067249003105E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.1798937248307912E-8d + "'", double3 == 2.1798937248307912E-8d);
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9520.705174543298d), 2.599377845637171d, (-1.9143595374588459E9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.974668742231324E-6d + "'", double3 == 4.974668742231324E-6d);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.010644913539679234d), (-68.33333333333334d), (-2515867.5965451133d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.7156710676514543E-5d) + "'", double3 == (-2.7156710676514543E-5d));
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0011294597975129053d, 4244.555418052495d, 30594.960601322553d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.13873377200587783d) + "'", double3 == (-0.13873377200587783d));
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-30522.347387205173d), 4.341507509246353d, 2.6893303485456314E10d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1351037224275184E-6d) + "'", double3 == (-1.1351037224275184E-6d));
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(49.700605717290564d, (-7.820594347784853d), (-0.9461365114570157d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-60.79587815134084d) + "'", double3 == (-60.79587815134084d));
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-127.9691388195903d), (-0.16449752507649265d), (-5026278.486811852d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.5427290117301035E-5d + "'", double3 == 2.5427290117301035E-5d);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-24.58841355160647d), (-0.01534717083845554d), 0.002609834244060252d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9415.565925956449d) + "'", double3 == (-9415.565925956449d));
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.010252156357536d, 0.04160688665710186d, 1469.8632083517716d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.004060680773412489d + "'", double3 == 0.004060680773412489d);
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1068.1066237432544d), (-9105.932177423267d), (-230617.41344533928d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.03485350665241561d) + "'", double3 == (-0.03485350665241561d));
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(18.16546891426259d, 16456.122901286402d, (-8.260892661984556E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.9898524414942786E8d + "'", double3 == 1.9898524414942786E8d);
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 4244.555418052495d, 605.1695228040093d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.013828783686353d) + "'", double3 == (-7.013828783686353d));
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2081.075077892601d, 1050.8426218622233d, 0.01729988972795197d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 59551.38860600938d + "'", double3 == 59551.38860600938d);
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1852516396085581d, (-6.651159273789213E8d), 381.17139593922394d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1744926.1268026067d + "'", double3 == 1744926.1268026067d);
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.0649190948203606d, (-1.4310986388598355d), (-5.806748001360767E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-60206.121100156764d) + "'", double3 == (-60206.121100156764d));
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 10, (-9.990971428571429d), 953.6363634384901d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.020962887107713414d + "'", double3 == 0.020962887107713414d);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(626.4891973271514d, 104700.74121570183d, 5.3028416532417685E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.001962612855972256d) + "'", double3 == (-0.001962612855972256d));
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-74.91382257376331d), (-0.009954337617466431d), (-0.01534717083845554d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4880.630379669624d + "'", double3 == 4880.630379669624d);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7087705.71500293d), (-2.2392224780199032E7d), 11.237674593054386d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1361893.7742382477d + "'", double3 == 1361893.7742382477d);
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1063.211405992356d, 0.0036780564517846265d, 4.475228687636128d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 237.57617814554723d + "'", double3 == 237.57617814554723d);
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(864017.8193252782d, (-3.327453864569369d), (-0.16913059628880311d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5108603.444546262d) + "'", double3 == (-5108603.444546262d));
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.07630497445598548d, (-0.0036682088025059554d), (-496.2252564778924d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.6116306498811667E-4d) + "'", double3 == (-1.6116306498811667E-4d));
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(36.87079326801912d, (-2.3472392633885765E-15d), (-1.03446372644643d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-35.64242256678923d) + "'", double3 == (-35.64242256678923d));
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-606.8342299716378d), 153.7856441908908d, 1.1948118355058969E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.3660222602370985E7d) + "'", double3 == (-6.3660222602370985E7d));
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(49.700605717290564d, (double) 100, 0.0029255559974682515d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-17193.10596899805d) + "'", double3 == (-17193.10596899805d));
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.974668742231324E-6d, (-0.6527390014518221d), 22.628457922462168d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.028846153739562484d + "'", double3 == 0.028846153739562484d);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.499925715596078E-5d, 2.512823725253588E7d, 9.754727149999918E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.5760061625568988E11d) + "'", double3 == (-2.5760061625568988E11d));
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.027936507936508d), 2.1798937248307912E-8d, 2046.6526633199571d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0019680606298880087d) + "'", double3 == (-0.0019680606298880087d));
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-112.29052887000132d), 1960.9782688499408d, (-0.13625250546110876d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15216.37191700468d + "'", double3 == 15216.37191700468d);
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.8929671162328545d), 2.1798937248307912E-8d, 0.06630722343360997d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-28.548430171067608d) + "'", double3 == (-28.548430171067608d));
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.11244252910375685d), (-9.112407246300548E13d), (-6911.905450826736d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.3183639896594069E10d) + "'", double3 == (-1.3183639896594069E10d));
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.940135101615696d, 7859263.422388127d, (-336173.24236909073d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 23.378593212437185d + "'", double3 == 23.378593212437185d);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(162772.69699750235d, (-3523663.8319391436d), 0.15888065386712802d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.320255134410269E7d + "'", double3 == 2.320255134410269E7d);
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3689427.387945577d), (-5694566.743298978d), 0.06444874751764998d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.1112153960855044E7d + "'", double3 == 3.1112153960855044E7d);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-10069.896224516728d), (-885.1317380373126d), (-3.8807036903743625E14d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.3667780947205946E-11d + "'", double3 == 2.3667780947205946E-11d);
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.0570421623879688E-5d, 25.058534698933222d, 1.988806577226357d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-12.599779393056357d) + "'", double3 == (-12.599779393056357d));
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.00284193505237051d, (-1.9462754239039993E-5d), 928.9670256818828d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.0801930827514786E-6d + "'", double3 == 3.0801930827514786E-6d);
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-435023.874160688d), 0.03796943136102197d, (-0.06381003452916503d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6817484.355556762d + "'", double3 == 6817484.355556762d);
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 25.01838673699937d, 12774.153009464499d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0019585162882003212d) + "'", double3 == (-0.0019585162882003212d));
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 1, (-0.001962612855972256d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0012952751777688372d, (-2.5760061625568988E11d), (-0.03841099193478857d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.706429677552379E12d) + "'", double3 == (-6.706429677552379E12d));
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.5313323016898746d, (-0.5381431908648426d), 1.3001076147786403E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 822605.3600469134d + "'", double3 == 822605.3600469134d);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(17730.621978773015d, 42.40967615841203d, (-48.56521324652172d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-364.21568279392756d) + "'", double3 == (-364.21568279392756d));
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.8242244722222174d, 37.018327125636084d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4880.630379669624d, 17.807841915085817d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0037783178274178523d, (-0.6247594455480912d), (-53.00142506533407d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.01185888422057935d) + "'", double3 == (-0.01185888422057935d));
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4028.868504761304d), (-0.025726741920444312d), (-2171.3364259575205d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.8554668589611745d + "'", double3 == 1.8554668589611745d);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.6600153033134007d), 58.596196556130764d, 3.6101172237222836d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-16.413930126719503d) + "'", double3 == (-16.413930126719503d));
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10.0f, (-64182.79240419197d), 0.08203614011776714d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 782494.0606912988d + "'", double3 == 782494.0606912988d);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.176875577765605E-5d, 5.095868576485035d, (-0.29003144854006946d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 17.56998019828611d + "'", double3 == 17.56998019828611d);
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.5285441275553774E-4d), (-29.818043236500717d), (-196.27469186580916d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.15191765223849601d) + "'", double3 == (-0.15191765223849601d));
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.7156710676514543E-5d), (-0.8451203032622264d), 0.953501242653814d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8863052387844411d + "'", double3 == 0.8863052387844411d);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1209.3780841486393d), 397037.78437912045d, 0.30388839410365465d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1310504.6793179906d) + "'", double3 == (-1310504.6793179906d));
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.002820692342975111d, (-0.35424982108957714d), 757.7856488949959d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.7120252798826817E-4d + "'", double3 == 4.7120252798826817E-4d);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.2568306415813569d, 5.133109580275273E-4d, (-1.3183639896594069E10d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.944207613631405E-11d) + "'", double3 == (-1.944207613631405E-11d));
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-915.6322250395841d), (-2.263231850117096d), 0.019108774049942618d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-47798.408772969386d) + "'", double3 == (-47798.408772969386d));
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4560.2361265867285d, (-0.08295933308814714d), (-60.536079301173494d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-75.33225042923146d) + "'", double3 == (-75.33225042923146d));
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-31559.786016838494d), (-67.87558463488088d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-464.9652181503288d) + "'", double3 == (-464.9652181503288d));
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(59538.801089360364d, 298.12196409159696d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-7.455778848144949d), (-0.35424982108957714d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-21.046669339769824d) + "'", double3 == (-21.046669339769824d));
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.044085075812054494d), (-0.005584544177643519d), 18970.42714396637d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.029502622277867E-6d) + "'", double3 == (-2.029502622277867E-6d));
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.908374108624884E-7d, 287035.54962783895d, 3155.041661331841d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-90.97678586785491d) + "'", double3 == (-90.97678586785491d));
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(114.7323696682487d, (-29.818043236500717d), 277.5577746718535d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5207939610974548d + "'", double3 == 0.5207939610974548d);
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.425453206243638E10d), (-1.1351037224275184E-6d), 424388.5246618761d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-127841.65666511058d) + "'", double3 == (-127841.65666511058d));
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.705583744355958E-4d), (-0.17859974514930188d), 1.9118381070872112d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.09306707828203666d + "'", double3 == 0.09306707828203666d);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(84.232524677725d, 31.666666666666664d, (-4637.863434596325d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.01133406766981133d) + "'", double3 == (-0.01133406766981133d));
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-112.29052887000132d), 8.744947822013767E8d, (-378.760498737663d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2308833.4116319716d + "'", double3 == 2308833.4116319716d);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-185.62140203192257d), (-196.27469186580916d), (-6.83232231756275E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.5592487208195512E-8d) + "'", double3 == (-1.5592487208195512E-8d));
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-514.2849452337225d), (-1119.0111575101134d), 81.91723186732399d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.3821612192148605d + "'", double3 == 7.3821612192148605d);
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(30022.548093205085d, (-4.6573983248002416E-5d), (-4.057460335443251d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7399.344826004147d) + "'", double3 == (-7399.344826004147d));
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0980248023915325E8d), 5887.28811578857d, (-3.6307792248140675E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.024374679044065E11d + "'", double3 == 3.024374679044065E11d);
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-509665.8055992972d), (-2.5806345537752432E8d), (-0.1363415853798087d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.8890332605012164E9d) + "'", double3 == (-1.8890332605012164E9d));
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.020527867595720343d), 2.442666210788253d, 1.407706191138976E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-17497.927436058242d) + "'", double3 == (-17497.927436058242d));
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2980918.4195705717d), (double) (-1L), (-48.56521324652172d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 61379.68352860197d + "'", double3 == 61379.68352860197d);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.583978433521822E-5d), 240.70698897028777d, 59.97350352930122d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.013556164723144d) + "'", double3 == (-4.013556164723144d));
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.940135101615696d, (-2.9279365079365083d), (-41.35294659150376d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.2144483607698758d) + "'", double3 == (-0.2144483607698758d));
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(97806.0396456324d, (-1.0156879047856051d), (-2893.7352136721006d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-33.79958707743052d) + "'", double3 == (-33.79958707743052d));
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2392.665682152357d, (-5.425453206243638E10d), 277.5577746718535d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.9547113936637238E8d + "'", double3 == 1.9547113936637238E8d);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.5980422167835707E-4d), (-3675855.9833939224d), 1.5368910290116979E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.23917479597742775d + "'", double3 == 0.23917479597742775d);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0642199076653532d), 86.04579198038081d, 476653.04349364195d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.806555377406182E-4d) + "'", double3 == (-1.806555377406182E-4d));
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.990971428571429d), 4560.2361265867285d, 1.34955153245034d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3386.478387911039d) + "'", double3 == (-3386.478387911039d));
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.9462754239039993E-5d), 626.4891973271514d, (-28.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 22.20560268691705d + "'", double3 == 22.20560268691705d);
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2933575938864831d), 0.0d, (-2.255685442720362E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3005252786163886E-8d + "'", double3 == 1.3005252786163886E-8d);
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.2259984882668483E8d), 13533.46743861875d, (-0.013924005935698557d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.3169580922613865E10d + "'", double3 == 2.3169580922613865E10d);
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 44247.520303499696d, 1.3142124542124545d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-33668.468261484515d) + "'", double3 == (-33668.468261484515d));
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.058149167826910875d, (-1.4000676141929564d), 0.020962887107713414d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 69.56182965290635d + "'", double3 == 69.56182965290635d);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.79862889834898d, (double) (byte) 1, 0.9118185305298744d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.262701664508188d + "'", double3 == 5.262701664508188d);
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.6581793926533862E-5d, (-987.5422876539585d), 0.8878201595235209d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1112.3224604020604d + "'", double3 == 1112.3224604020604d);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.2568306415813569d, 219.99473074203414d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.5920422856791114E-5d), (-1.9462754239039993E-5d), 1.1264499783965762d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.3487655133530017E-5d) + "'", double3 == (-2.3487655133530017E-5d));
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(881.893464764406d, 46.64578469753089d, 68.33333333333334d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.223136781466463d + "'", double3 == 12.223136781466463d);
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-34.938789968754726d), 2.320255134410269E7d, 6.7875477993298965d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3418404.844999153d) + "'", double3 == (-3418404.844999153d));
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2959.7992059068197d), 69.56182965290635d, (-4.325443884910899d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 700.3584178094426d + "'", double3 == 700.3584178094426d);
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.15847193644261548d), (-90.97678586785491d), 4.788884869211093E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.8964397017624156E-8d + "'", double3 == 1.8964397017624156E-8d);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-17497.927436058242d), (-14341.355474922026d), 0.21715487767004005d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-14536.0398762607d) + "'", double3 == (-14536.0398762607d));
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.13774983309039368d), (-0.020702218284624194d), 0.015278681790882827d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.660845117908977d) + "'", double3 == (-7.660845117908977d));
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.04380633171140876d, (-653.4214262971092d), 76.89122819150627d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.498566715585447d + "'", double3 == 8.498566715585447d);
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.00514629998467077d, (-0.03137934133093799d), 162772.69699750235d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.243966094397835E-7d + "'", double3 == 2.243966094397835E-7d);
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3144.743169398907d), (-1.2521480669283976E-6d), 21163.34502120811d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.1485938619341774d) + "'", double3 == (-0.1485938619341774d));
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(100.0d, (-4.85125159414909E-4d), (-0.5086896265246781d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-196.5844788468634d) + "'", double3 == (-196.5844788468634d));
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8808183.796906078d, 0.0023457492850929374d, (-53.00142506533407d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-166187.67860869045d) + "'", double3 == (-166187.67860869045d));
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-13.608217334234764d), (-694274.8718878754d), 24375.32745104039d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 28.482130755577135d + "'", double3 == 28.482130755577135d);
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 100, (-1.1987915654186478E-4d), 1225.8551105601869d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.08157580697563747d + "'", double3 == 0.08157580697563747d);
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2021.4566648401276d), (-0.026347318130971787d), 0.019108774049942618d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-105785.4529149172d) + "'", double3 == (-105785.4529149172d));
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.492719128061608d), 0.4822630255857173d, (-5.587479427085652E-7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1744940.9279630438d + "'", double3 == 1744940.9279630438d);
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3155.041661331841d, 854847.725260599d, 0.38985626873791157d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2184632.52202271d) + "'", double3 == (-2184632.52202271d));
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1552536081078527E9d), 36.87079326801912d, (-0.015973479995594054d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.232322858245656E10d + "'", double3 == 7.232322858245656E10d);
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.1916777106423085E-11d), (-7183.620461572214d), (-0.0038614812638467486d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1860327.6749855233d) + "'", double3 == (-1860327.6749855233d));
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0026713611904894117d), (-1.27096727177068d), 2.0649190948203606d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6142109459695451d + "'", double3 == 0.6142109459695451d);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1147713.356304015d, (-2.013914145094137E8d), (-1282.1682354050427d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-157966.1094955567d) + "'", double3 == (-157966.1094955567d));
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(46.64578469753089d, 1.3142124542124545d, (-5.2491203062324345d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.636032248964638d) + "'", double3 == (-8.636032248964638d));
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1070724.930288176d, (-0.18913938314149753d), 0.058149167826910875d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.841342119658053E7d + "'", double3 == 1.841342119658053E7d);
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.007952767262276412d), (-0.05672342154368765d), (-2.5760061625568988E11d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.8932662114830634E-13d) + "'", double3 == (-1.8932662114830634E-13d));
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(12.223136781466463d, 4.647322480503532E-4d, (-44615.7642841512d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.7395411118307926E-4d) + "'", double3 == (-2.7395411118307926E-4d));
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(838.1437053899591d, 104700.74121570183d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(24.851043877147877d, (-411.7432728113756d), (-0.6174981309146284d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-707.0374707723358d) + "'", double3 == (-707.0374707723358d));
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-82.75578795139855d), (-4.461032755834129d), (-2184632.52202271d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.583886736386803E-5d + "'", double3 == 3.583886736386803E-5d);
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.757614740032716d, (-184.25216526275173d), 1.9547113936637238E8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.771763781699457E-7d + "'", double3 == 9.771763781699457E-7d);
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-41.340724233317324d), 0.1291662100956973d, (-3745.3768850495107d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.011072287707266294d + "'", double3 == 0.011072287707266294d);
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-60.536079301173494d), (-3012.0898484574304d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.1751838892208806E21d), 59538.801089360364d, 0.28485144954940284d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.636204388855077E21d) + "'", double3 == (-7.636204388855077E21d));
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.9554042867703132d, 4.052888814265645E-4d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.019549989978888866d + "'", double3 == 0.019549989978888866d);
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.28891613658762E8d, (-1068.1066237432544d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.583223394584583d), 6.413857741260789d, (-0.003392245521890975d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3831.409328119703d + "'", double3 == 3831.409328119703d);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(27.145489584612932d, (-178.94799321650655d), 5604.062084800248d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03677573154660464d + "'", double3 == 0.03677573154660464d);
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-0.15847193644261548d), (-0.006025256739270937d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-26.301275331512393d) + "'", double3 == (-26.301275331512393d));
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.836147023196146E-5d), (-0.26157790631375005d), 0.7394978813337217d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.35360418392532583d + "'", double3 == 0.35360418392532583d);
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2260427.644899097d), 10.006904238401965d, 38.47058958622179d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-58757.55157682608d) + "'", double3 == (-58757.55157682608d));
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(34.16666666666667d, 3831.409328119703d, (-81.95202102676626d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 46.33494834999643d + "'", double3 == 46.33494834999643d);
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-40.22963705964476d), 5.361082720450376E-5d, 0.009091270513841624d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4425.090047559527d) + "'", double3 == (-4425.090047559527d));
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7589.721624917432d), (-373.8995556680519d), (-708.1749990537666d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.189320547733054d + "'", double3 == 10.189320547733054d);
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0019585162882003212d), 7.218577656757598E-5d, (-0.06634316602523686d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.030609061738106087d + "'", double3 == 0.030609061738106087d);
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8.744947822013767E8d, (-0.8775025723008872d), (-0.5203883404509932d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.6804657504835725E9d) + "'", double3 == (-1.6804657504835725E9d));
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0156879047856051d), (-2.72344564806855E-5d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-10756.69911268453d), 1.3619432066345235E7d, 1225.8551105601869d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-11118.923148453692d) + "'", double3 == (-11118.923148453692d));
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-207.00456697639197d), (-0.13774983309039368d), (-127.9691388195903d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.616536760749328d + "'", double3 == 1.616536760749328d);
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-60.536079301173494d), (-12.412970854096056d), (-4.851253054049255E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9919727.524192939d + "'", double3 == 9919727.524192939d);
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1361893.7742382477d, (-24925.365853658535d), (-1310504.6793179906d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0582328792703213d) + "'", double3 == (-1.0582328792703213d));
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) 100, (-103016.32495324952d), (-631.7732991932455d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-163.21728867764085d) + "'", double3 == (-163.21728867764085d));
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-1149.904742169715d), 1.3005252786163886E-8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.841848452135304E10d + "'", double3 == 8.841848452135304E10d);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.3248401363089306d, (-2.1751838892208806E21d), 8341.733699559149d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.607592099632522E17d + "'", double3 == 2.607592099632522E17d);
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-274.5462255160796d), 6.413857741260789d, 24375.32745104039d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.01152641267370332d) + "'", double3 == (-0.01152641267370332d));
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1d, (-51.64639858342376d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(114.7323696682487d, (-0.1d), (-0.0028718373568427723d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-39985.680036731814d) + "'", double3 == (-39985.680036731814d));
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5727365229100048d), 0.0d, 2.3496190917066646d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.2437571795920304d) + "'", double3 == (-0.2437571795920304d));
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) -1, 284.04288761832095d, (-1.4481903954008661E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.9682694245422037E-5d + "'", double3 == 1.9682694245422037E-5d);
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(125529.76571116375d, 125529.76571116375d, 0.0038798067161635195d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1070724.930288176d, 2.3496190917066646d, 28444.63036034656d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 37.64234469229499d + "'", double3 == 37.64234469229499d);
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(24.851043877147877d, 2.512823725253588E7d, 0.33391548734539833d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.525321032953368E7d) + "'", double3 == (-7.525321032953368E7d));
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11.237674593054386d, 1.9554042867703132d, 2.08331663747946E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.4555254536412685E-9d + "'", double3 == 4.4555254536412685E-9d);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.779126012999823E8d, 1.8340517646892067d, 231.86379083762387d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1198602.8454980063d + "'", double3 == 1198602.8454980063d);
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.2120562897729945d, (-1.2521480669283976E-6d), (-139.5011600477429d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.00868851227836562d) + "'", double3 == (-0.00868851227836562d));
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.015278681790882827d, 1.6451240016813788d, (-9.449978071646475d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.17247080443293847d + "'", double3 == 0.17247080443293847d);
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) -1, (-400.2869205463187d), (-0.1921715267680537d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2077.763169505585d) + "'", double3 == (-2077.763169505585d));
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.2887659395329154d, 397037.78437912045d, (-7.525321032953368E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0052760074138307024d + "'", double3 == 0.0052760074138307024d);
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.08632058739905799d, 0.7394755380732579d, (-1531.9635775952681d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.2635148787248644E-4d + "'", double3 == 4.2635148787248644E-4d);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0032537872546947776d, 2081.075077892601d, 0.9292419531570836d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2239.537094763038d) + "'", double3 == (-2239.537094763038d));
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0307216494845362d), 0.0d, (-22.862368511464002d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04508376500744863d + "'", double3 == 0.04508376500744863d);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.41466339807368535d), 0.0d, (-14.116811280841457d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.029373729649304247d + "'", double3 == 0.029373729649304247d);
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(49.700605717290564d, 2.135416666666667d, 14.267015677794571d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.3339270191351353d + "'", double3 == 3.3339270191351353d);
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(13.022334907559646d, (-17.21311475409836d), 14.267015677794571d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.119255375089899d + "'", double3 == 2.119255375089899d);
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.19780471976807312d, (-26.301275331512393d), 9072.484054390221d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.002920818586444076d + "'", double3 == 0.002920818586444076d);
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1987915654186478E-4d), 0.3248401363089306d, 58.58234368006642d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.005547064099042615d) + "'", double3 == (-0.005547064099042615d));
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-2.9279365079365083d), (-8.636032248964638d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.3390372364910442d) + "'", double3 == (-0.3390372364910442d));
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.541959527025432E-4d, (-5.439520370575405d), 0.2691000550805069d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.217292653100632d + "'", double3 == 20.217292653100632d);
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11.391352756079183d, (-2247.4992407486698d), 2.20370619995323E11d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0250416292120474E-8d + "'", double3 == 1.0250416292120474E-8d);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(16.90347621356856d, (-2.05941647888906E9d), 1.4325933296457168E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4375443841427309E13d + "'", double3 == 1.4375443841427309E13d);
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11.391352756079183d, 1.34955153245034d, (-2.029502622277867E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4947912.4162737755d) + "'", double3 == (-4947912.4162737755d));
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5886.953471402866d, (-5108603.444546262d), (-0.10499533114778578d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.871159833591822E7d) + "'", double3 == (-4.871159833591822E7d));
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(424388.5246618761d, 1413.3683407971002d, (-8588.49800713237d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-49.24902537903796d) + "'", double3 == (-49.24902537903796d));
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0985766771596108d), (-13.64938407658132d), (-1068.1066237432544d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.011750519208874977d) + "'", double3 == (-0.011750519208874977d));
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) '4', 0.0022981397119101587d, 117.68539165709558d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.44183650262893953d + "'", double3 == 0.44183650262893953d);
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-10728.843605011743d), (-918.453064571191d), (-129.31656548090515d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 75.86337066683967d + "'", double3 == 75.86337066683967d);
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-345.6051642422499d), (-0.8932635507964994d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-386.90167524923964d) + "'", double3 == (-386.90167524923964d));
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.595077285614252E8d), (-707.0374707723358d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1494537393527402E8d), 0.261351713964122d, 9.24262767218969E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.2436438886582758E11d) + "'", double3 == (-1.2436438886582758E11d));
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3001076147786403E-6d, 2.7347788886478163E-4d, 1282.7036252817327d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.1219070086452894E-7d) + "'", double3 == (-2.1219070086452894E-7d));
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(961.3970359880889d, 60.78212003088318d, 185.41419335293355d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.857313777715477d + "'", double3 == 4.857313777715477d);
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(17.807841915085817d, 6137178.729746683d, (-61509.23409629216d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 99.7762533068953d + "'", double3 == 99.7762533068953d);
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0266220371807253d, 6.199820329875534d, 1.0570421623879688E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-584006.8175472687d) + "'", double3 == (-584006.8175472687d));
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0037783178274178523d, 2.5427290117301035E-5d, (-7.455778848144949d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.033532530587729E-4d) + "'", double3 == (-5.033532530587729E-4d));
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(15.14151383587133d, 559.8204717945758d, 38010.25819494771d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.014329788426196555d) + "'", double3 == (-0.014329788426196555d));
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-85450.51646580474d), (-5.744848552657145d), 177.7963236370834d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-480.5767063646454d) + "'", double3 == (-480.5767063646454d));
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(161.2009255255225d, (-33668.468261484515d), (-69.80731599711538d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-484.6149533726231d) + "'", double3 == (-484.6149533726231d));
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.33464438570438754d), (-1.606528010859787E10d), (-3.4554251090460095d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.649291939855877E9d) + "'", double3 == (-4.649291939855877E9d));
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4836.99819182414d, 7.403501046614858d, (-3.907862648115074d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1235.8660284815899d) + "'", double3 == (-1235.8660284815899d));
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-68.33333333333334d), (-0.08295933308814714d), (-0.15847193644261548d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 430.67798332204677d + "'", double3 == 430.67798332204677d);
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(231.86379083762387d, 0.0d, (-1.4000676141929564d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-165.6089952279037d) + "'", double3 == (-165.6089952279037d));
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(84.232524677725d, 97.87674731384321d, (-0.23312849541459077d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 58.526619029791355d + "'", double3 == 58.526619029791355d);
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1209.3780841486393d), (-12.412970854096056d), 2392.665682152357d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5002642543097772d) + "'", double3 == (-0.5002642543097772d));
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(953.6363634384901d, (-0.003929249906775104d), (-163.21728867764085d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.84276518997853d) + "'", double3 == (-5.84276518997853d));
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-891.2598055815954d), (-1.9462754239039993E-5d), 6817484.355556762d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.3073147507737182E-4d) + "'", double3 == (-1.3073147507737182E-4d));
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.3496190917066646d, (-40.54473746602599d), (-0.8802773951276158d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-48.72822680118256d) + "'", double3 == (-48.72822680118256d));
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(115.31028430062946d, (-67.87558463488088d), 932.3236026237777d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.19648313999557906d + "'", double3 == 0.19648313999557906d);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-464.9652181503288d), (-216.4416206660676d), (-3.4554251090460095d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 71.9227272018275d + "'", double3 == 71.9227272018275d);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.04160688665710186d, 2853.87309695617d, 7.298232900384636d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-391.03047669513376d) + "'", double3 == (-391.03047669513376d));
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.1219070086452894E-7d), 0.02369851381595228d, 6.231925143496529E-8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-380279.3753288982d) + "'", double3 == (-380279.3753288982d));
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-435023.874160688d), 175.0d, (-12060.887424865063d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 36.083486963278496d + "'", double3 == 36.083486963278496d);
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.081212852733868d, (-206664.29901807886d), 0.0029268292682926825d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.06120382455683E7d + "'", double3 == 7.06120382455683E7d);
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.07089547030267625d), (-0.1446576867922154d), 0.19648313999557906d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.37541244755758096d + "'", double3 == 0.37541244755758096d);
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.17612766619814846d, 0.7394755380732579d, 6378457.687275752d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.83203902095204E-8d) + "'", double3 == (-8.83203902095204E-8d));
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-36717.982617732654d), (-4.607721573961723E-4d), (-339.3637465801493d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 108.19653698126714d + "'", double3 == 108.19653698126714d);
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2959.7992059068197d), 1.5102365017054655E15d, 2.3667780947205946E-11d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.3809805620442555E25d) + "'", double3 == (-6.3809805620442555E25d));
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.007986855746552222d, (-153.6245291694921d), (-0.5782843123540006d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-265.6695205855619d) + "'", double3 == (-265.6695205855619d));
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.643077221003559E-4d, (-0.8932635507964994d), 0.7662607002774456d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.1666106041911437d + "'", double3 == 1.1666106041911437d);
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 1063.211405992356d, 3155.041661331841d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.33698807182899176d) + "'", double3 == (-0.33698807182899176d));
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(58.596196556130764d, 0.0037783178274178523d, (-56.98276689365725d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0282480376505772d) + "'", double3 == (-1.0282480376505772d));
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1050.8426218622233d, (-1.944207613631405E-11d), 0.8242244722222174d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1274.9471257860532d + "'", double3 == 1274.9471257860532d);
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.239865383096493E-4d), 44247.520303499696d, (-40.54473746602599d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1091.325861082784d + "'", double3 == 1091.325861082784d);
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(28.784818820180682d, 11.484264408496168d, (-653.4214262971092d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.026476870386276552d) + "'", double3 == (-0.026476870386276552d));
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-24704.68526079505d), 526.749700119952d, (-273.47492579646894d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 92.26233406017359d + "'", double3 == 92.26233406017359d);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.8626146032068838d), 0.0d, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.02098788798311647d), 89.91771687002392d, 4320864.548527976d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.081497898115024E-5d) + "'", double3 == (-2.081497898115024E-5d));
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-17497.927436058242d), 1063.211405992356d, (-5900332.769841715d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0031457783087967305d + "'", double3 == 0.0031457783087967305d);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.029266685342399384d, (-9733093.603334159d), 6.669381006171804d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1459369.861100138d + "'", double3 == 1459369.861100138d);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.4578806942783125d, (-2.013914145094137E8d), 4.923237501279958E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04090629792183214d + "'", double3 == 0.04090629792183214d);
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(91.485652292601d, 0.02d, 0.004391895249523627d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20826.009523456178d + "'", double3 == 20826.009523456178d);
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-12.412970854096056d), (-6.385094722889697E-5d), (-163.95336996416071d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.07570998391714802d + "'", double3 == 0.07570998391714802d);
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-153.6245291694921d), 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 0, 23.026151447024002d, 3831.409328119703d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.006009838541141801d) + "'", double3 == (-0.006009838541141801d));
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-20037.97917199869d), (double) (byte) -1, (-2077.763169505585d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.64353371263511d + "'", double3 == 9.64353371263511d);
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.779126012999823E8d, 4320864.548527976d, (-7.013828783686353d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.9007472977927335E7d) + "'", double3 == (-3.9007472977927335E7d));
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.3073147507737182E-4d), 377.81908382541343d, (-1.6116306498811667E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2344328.7988147093d + "'", double3 == 2344328.7988147093d);
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-206664.29901807886d), (double) '4', 5.262701664508188d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-39279.50170768363d) + "'", double3 == (-39279.50170768363d));
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.609427320082126d), (-8586.388369914019d), (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 858.4778942593937d + "'", double3 == 858.4778942593937d);
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.029373729649304247d, (-1.1d), 0.04508376500744863d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.05056375532771d + "'", double3 == 25.05056375532771d);
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0020064545047003323d), (-11560.515027955293d), (-14.3322407794841d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-806.6089036160414d) + "'", double3 == (-806.6089036160414d));
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.004400885011325602d), (-1.1552536081078527E9d), (-12060.887424865063d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-95785.12487578225d) + "'", double3 == (-95785.12487578225d));
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-0.5086896265246781d), (-4.607721573961723E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1103.993846762113d) + "'", double3 == (-1103.993846762113d));
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.33593526285222397d, (-0.006009838541141801d), (-0.08101442761435378d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.220792659563041d) + "'", double3 == (-4.220792659563041d));
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1646.1322506763238d), (-0.08348013881347674d), (-129.31656548090515d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.728831487413462d + "'", double3 == 12.728831487413462d);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.02d, (-304.4349314474631d), (-0.6936369643410254d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-438.92547124662514d) + "'", double3 == (-438.92547124662514d));
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.82447721619274E-4d), (-8.836147023196146E-5d), 13.439970251589838d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.908392924406798E-5d) + "'", double3 == (-5.908392924406798E-5d));
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(953.6363634384901d, 33.8476787380501d, (-265.6695205855619d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.4621535909468832d) + "'", double3 == (-3.4621535909468832d));
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.9461365114570157d), (-5882.984797258602d), 0.07581370290688234d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 77585.4289556562d + "'", double3 == 77585.4289556562d);
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(161.5789184939156d, (-400.2869205463187d), (-81.95202102676626d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.856033957438632d) + "'", double3 == (-6.856033957438632d));
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(219.99473074203414d, 0.04090629792183214d, (-4.649291939855877E9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.730910153405653E-8d) + "'", double3 == (-4.730910153405653E-8d));
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.28891613658762E8d, (-13.208362369337976d), 1046.6286357600898d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 505328.8327841604d + "'", double3 == 505328.8327841604d);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-250.65930951686082d), 0.02d, 1.6507423041392261E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1518585.3593761062d) + "'", double3 == (-1518585.3593761062d));
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-23.24610440052088d), 64.2179019833403d, (-0.0019680606298880087d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 44441.723519888845d + "'", double3 == 44441.723519888845d);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.005995007607412941d, (double) 10.0f, (-1.8325779953796312E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.453522315333847E-7d + "'", double3 == 5.453522315333847E-7d);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0529389932556983E7d), (-40.22963705964476d), (-0.03430050119057761d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.0697363995988333E8d + "'", double3 == 3.0697363995988333E8d);
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.851253054049255E-6d), (-3714441.8990268465d), (-0.1921715267680537d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.9328783829173792E7d) + "'", double3 == (-1.9328783829173792E7d));
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.9191735326972235d, 0.0d, 36.083486963278496d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.025473522933985d + "'", double3 == 0.025473522933985d);
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2347.155566344006d, (-3980.65074896532d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-105.12487240829857d), 3.2734402890550405E-4d, 0.28125d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-373.7784880082755d) + "'", double3 == (-373.7784880082755d));
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.01133406766981133d), (-44615.7642841512d), (-2.5806345537752432E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7288675331737527E-4d) + "'", double3 == (-1.7288675331737527E-4d));
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.017574460359640873d, (-91.61239241706083d), (-4425.090047559527d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.020706915767274642d) + "'", double3 == (-0.020706915767274642d));
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.135416666666667d, 8.13569881667462E-4d, (-0.015175209543475695d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-140.6638300887735d) + "'", double3 == (-140.6638300887735d));
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.012861186212075172d), (-20.48548860584678d), (-1860327.6749855233d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1004850218010125E-5d) + "'", double3 == (-1.1004850218010125E-5d));
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.11876521258589579d), (-0.00829998128464948d), (-0.02441966152248684d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.523618445715327d + "'", double3 == 4.523618445715327d);
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.643238983591384E7d), 6.669381006171804d, (-221.78895886879707d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 434793.49466778926d + "'", double3 == 434793.49466778926d);
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2308833.4116319716d, (-400.2869205463187d), 2309.7573905377603d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 999.7732697003642d + "'", double3 == 999.7732697003642d);
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-165.6089952279037d), (-4.3947672684470583E-7d), 1612.7780985572388d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.102685542999733d) + "'", double3 == (-0.102685542999733d));
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1405837852482137d, 11.391352756079183d, (-9.643238983591384E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.1667002124467624E-7d + "'", double3 == 1.1667002124467624E-7d);
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.8362499952866399d, (-4.3947672684470583E-7d), 10.439112130526627d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.08010742909044508d + "'", double3 == 0.08010742909044508d);
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100, 3831.409328119703d, 18.82264957487597d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-198.24038657662203d) + "'", double3 == (-198.24038657662203d));
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-112.29052887000132d), (-20491.383131969695d), 1.8752524071118676E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0867386451984958E8d + "'", double3 == 1.0867386451984958E8d);
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.231925143496529E-8d, (-3093.012717638825d), 9611.837475567056d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.32179203253940475d + "'", double3 == 0.32179203253940475d);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8663.342809865328d), (-0.041836835908971234d), 93304.39105865342d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.09284987420992283d) + "'", double3 == (-0.09284987420992283d));
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1310504.6793179906d), (-6.385094722889697E-5d), (-33668.468261484515d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 38.92379864376867d + "'", double3 == 38.92379864376867d);
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.806555377406182E-4d), (-12.627334254936217d), 0.19780471976807312d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 63.836462619313984d + "'", double3 == 63.836462619313984d);
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-258736.8504784611d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.260997845776212E18d), 10.028571428571428d, 397037.78437912045d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.1760147154461245E12d) + "'", double3 == (-3.1760147154461245E12d));
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.15191765223849601d), (-4.013556164723144d), (-338114.8244591401d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1421086072347923E-5d) + "'", double3 == (-1.1421086072347923E-5d));
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6137178.729746683d, 2.9459335129148602E7d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-69.80731599711538d), 1744926.1268026067d, 2046.6526633199571d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-852.6097101830538d) + "'", double3 == (-852.6097101830538d));
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.953501242653814d, (-196.5844788468634d), 9.818018633727817d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.119943489505655d + "'", double3 == 20.119943489505655d);
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.813865147198482d), (-3093.012717638825d), 0.0010462050201086822d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2949898.722691108d + "'", double3 == 2949898.722691108d);
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0087742059352795E7d), 1198602.8454980063d, (-2.824232663746436d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3996251.8137153406d + "'", double3 == 3996251.8137153406d);
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.8365163560519195d), 0.07430549635937711d, 1.0921455421803116E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-358086.1434094125d) + "'", double3 == (-358086.1434094125d));
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.07581370290688234d, (-1646.1322506763238d), 0.005875464115575659d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 280183.49393287726d + "'", double3 == 280183.49393287726d);
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.011951369809972E7d), (-0.020702218284624194d), (-0.34545264431260303d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.9293490277180415E7d + "'", double3 == 2.9293490277180415E7d);
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.01534717083845554d), (-8.206390887176429E9d), (-0.9714562908496731d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.447514277748364E9d) + "'", double3 == (-8.447514277748364E9d));
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.02d), (-8.636032248964638d), 71.07327366592149d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.10715747082037681d + "'", double3 == 0.10715747082037681d);
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-99212.66715592718d), (-3980.65074896532d), (-2.1751838892208806E21d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.378113357628471E-17d + "'", double3 == 4.378113357628471E-17d);
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(684586.5526558252d, 0.0d, 21.7414034926249d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 31487.68904859569d + "'", double3 == 31487.68904859569d);
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(791.2764751368901d, 131.4647556520893d, (-190.41098095896922d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.4651978376550696d) + "'", double3 == (-3.4651978376550696d));
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.730910153405653E-8d), (-95785.12487578225d), (-4.859744364937509d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-19709.910168693954d) + "'", double3 == (-19709.910168693954d));
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-117.58846188300636d), (-1.1552536081078527E9d), (-8.77644506608603d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.316311424295841E8d) + "'", double3 == (-1.316311424295841E8d));
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.2259984882668483E8d), (-46.936547120375366d), 1753.0335108122406d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-184023.75077283388d) + "'", double3 == (-184023.75077283388d));
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) 1, (-0.015973479995594054d), (-31856.923773494596d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.1891763536845264E-5d) + "'", double3 == (-3.1891763536845264E-5d));
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2176.404460537546d, 3.1112153960855044E7d, (-2.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.5554988778197253E7d + "'", double3 == 1.5554988778197253E7d);
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.8863052387844411d, 0.03580972901448908d, (-50822.6418952214d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.673457888166022E-5d) + "'", double3 == (-1.673457888166022E-5d));
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.449978071646475d), 0.0d, 1.0240697347356706d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.227865789907042d) + "'", double3 == (-9.227865789907042d));
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.2443810045243917d, 3335.96438123599d, (-2.0255006195489647E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.6468619994667089E7d + "'", double3 == 1.6468619994667089E7d);
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(71.07327366592149d, (-3714441.8990268465d), 1.988806577226357d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1867709.517272852d + "'", double3 == 1867709.517272852d);
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.010252156357536d, (-449.17588062325603d), 9316.35136841457d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04885884127587127d + "'", double3 == 0.04885884127587127d);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(280183.49393287726d, (-0.004719704291657331d), 5.262701664508188d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 53239.4797413935d + "'", double3 == 53239.4797413935d);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.7567898564924915d, (-0.044085075812054494d), 9316.35136841457d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.0064075747512204E-4d + "'", double3 == 3.0064075747512204E-4d);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.05281683558030303d, (-2.561724108503911E-4d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.053050316762281974d, (-8586.388369914019d), 20.85909840205065d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 411.6401032648013d + "'", double3 == 411.6401032648013d);
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7122.93809493948d), (-1.1757916030312405d), (-0.7289492658723467d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9769.901194445554d + "'", double3 == 9769.901194445554d);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.8248705009503976E-9d, 0.0015511267324521702d, (-1.4071387060023755d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.001102322678613782d + "'", double3 == 0.001102322678613782d);
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-584006.8175472687d), 0.08157580697563747d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6020.689681681192d) + "'", double3 == (-6020.689681681192d));
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-272.891770969031d), 0.026761829517740653d, (-71.4347613908908d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.820528374206212d + "'", double3 == 3.820528374206212d);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10L, (-1.1987915654186478E-4d), 0.4321112837709945d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 23.142464116850725d + "'", double3 == 23.142464116850725d);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-707.0374707723358d), (-1.3167812052373329d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.779126012999823E8d, (-56446.19464108165d), (-0.004400885011325602d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.3162079168002525E10d) + "'", double3 == (-6.3162079168002525E10d));
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-23.24610440052088d), 2.0649190948203606d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11.2576344801263d + "'", double3 == 11.2576344801263d);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5900332.769841715d), (-41232.77548435679d), (-0.003392245521890975d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7272039881981354E9d + "'", double3 == 1.7272039881981354E9d);
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(56.158660220318865d, (-5.908392924406798E-5d), (-2515867.5965451133d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.232181032951314E-5d) + "'", double3 == (-2.232181032951314E-5d));
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11.55316059649232d, 25.272195976724745d, 168.5543027975198d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.08139237713031135d) + "'", double3 == (-0.08139237713031135d));
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.245810793865246E9d, 0.0d, 231.86379083762387d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9685905.616190005d + "'", double3 == 9685905.616190005d);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-185.62140203192257d), 52.55596729571826d, 0.1852516396085581d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1285.6964172134524d) + "'", double3 == (-1285.6964172134524d));
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-265.6695205855619d), (-4.027936507936508d), (-0.02357952454682086d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11096.134850306027d + "'", double3 == 11096.134850306027d);
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.7288675331737527E-4d), (-373.8995556680519d), 0.06269659953161594d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5963.6309716088d + "'", double3 == 5963.6309716088d);
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(17.326447584017874d, (-11560.515027955293d), 0.03677573154660464d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 314822.8733632968d + "'", double3 == 314822.8733632968d);
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.07630497445598548d, (-18.842339607366924d), 1361893.7742382477d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3891424529350489E-5d + "'", double3 == 1.3891424529350489E-5d);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-64182.79240419197d), (-243.73163541018437d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.3660222602370985E7d), 72.77859719385503d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-530808.9972055472d), 104.39867431758901d, (-184023.75077283388d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.885026490603624d + "'", double3 == 2.885026490603624d);
    }
}

