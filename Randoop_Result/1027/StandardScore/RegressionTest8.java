package StandardScore;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.008392366143013344d), (-6.3809805620442555E25d), (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.380980562044255E24d + "'", double3 == 6.380980562044255E24d);
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.2362001208209972d, 86.26363573253921d, (-12.14423586200882d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.083808037757274d + "'", double3 == 7.083808037757274d);
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.973486285373436d, 0.0019673532426922945d, (-2.151817791815755d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.7045510834837865d) + "'", double3 == (-3.7045510834837865d));
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1405837852482137d, (-0.39726641766298276d), 0.7394978813337217d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7273181120426694d + "'", double3 == 0.7273181120426694d);
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-60.5907241276051d), 0.28931843722377265d, (-5.976888636998796E-13d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.018590880010086E14d + "'", double3 == 1.018590880010086E14d);
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.2073947191586198E8d), (-0.0033358668367661198d), (-1772547.842024869d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 68.1163402476062d + "'", double3 == 68.1163402476062d);
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-18.337150359055514d), 304.06652910601184d, (-0.07458508556817531d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4322.629343508237d + "'", double3 == 4322.629343508237d);
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-684.4354801089842d), 6.280208457673489E7d, (-0.018211502704118795d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.4485220705049915E9d + "'", double3 == 3.4485220705049915E9d);
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.02169555487390554d, (-0.35424982108957714d), 20224.062304201256d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.8589013933436386E-5d + "'", double3 == 1.8589013933436386E-5d);
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7.246364535479351E-7d), (-60750.37725429435d), 11534.101903472078d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.267022761025044d + "'", double3 == 5.267022761025044d);
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.717338430158957E-5d), 14.02957760523305d, 32008.939444793083d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.3830270611791724E-4d) + "'", double3 == (-4.3830270611791724E-4d));
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.5379425299724522d, (-2.561724108503911E-4d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.824232663746436d), (-1.0045861653428234d), (-2.5107209676102247E14d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.247505883282616E-15d + "'", double3 == 7.247505883282616E-15d);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6133.816011844671d), 782494.0606912988d, (-0.0027170302320845066d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.902536259591443E8d + "'", double3 == 2.902536259591443E8d);
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.5192399967184E-4d, (-4.343640831723027E7d), 76.42112965228029d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 568382.180627529d + "'", double3 == 568382.180627529d);
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(12.953457588734812d, 6.380980562044255E24d, 1769.8439166156193d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.605391697052175E21d) + "'", double3 == (-3.605391697052175E21d));
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7336.886160114724d, (-103683.26554895013d), (-345.6051642422499d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-321.23406475270707d) + "'", double3 == (-321.23406475270707d));
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-318.46395695500274d), (double) 1, (-9.882287126485213E-7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.2326925221471983E8d + "'", double3 == 3.2326925221471983E8d);
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.004916369744471227d, 89.91771687002392d, (-4.325443884910899d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.78695340701006d + "'", double3 == 20.78695340701006d);
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.03636852237917668d, (-925882.9279944613d), (-105.12487240829857d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8807.458626602758d) + "'", double3 == (-8807.458626602758d));
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(12.723391095032145d, 2.1849952753837074E-4d, 1.3891424529350489E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 915901.2143515202d + "'", double3 == 915901.2143515202d);
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.89345994471712E-7d, (-5.908392924406798E-5d), 0.4204641865413196d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4120887613981123E-4d + "'", double3 == 1.4120887613981123E-4d);
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-20617.70491827632d), (-1.5483636335833153E14d), 3325.4330485669584d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.656126317275822E10d + "'", double3 == 4.656126317275822E10d);
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1593458532098562d), 2.599377845637171d, 3.8046316105070166d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.9879336775909635d) + "'", double3 == (-0.9879336775909635d));
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-87171.92570003681d), 7.338746087166691E11d, 1880.6400192383467d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.902260338934038E8d) + "'", double3 == (-3.902260338934038E8d));
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8.921611432383611E-10d, 2.2189770986883857d, (-41561.496272450415d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.339021201859623E-5d + "'", double3 == 5.339021201859623E-5d);
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.8426221743433523E9d), (-3.4931424765866463d), (-211.7143604417859d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.815003083792607E7d + "'", double3 == 1.815003083792607E7d);
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-82.75578795139855d), (-0.8451203032622264d), 1.018590880010086E14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.041566958397003E-13d) + "'", double3 == (-8.041566958397003E-13d));
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(145.54263652984656d, (-3.4554251090460095d), 0.0038798067161635195d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 38403.475363387886d + "'", double3 == 38403.475363387886d);
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7589.721624917432d), 17.807841915085817d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.3071310427636022d, 0.32179203253940475d, (-0.007194800704147542d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.037720067402425d + "'", double3 == 2.037720067402425d);
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0014047886765032086d), 1063.211405992356d, (-0.2437571795920304d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4361.770236103414d + "'", double3 == 4361.770236103414d);
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.2286187991376465E12d), 1.5763633906905187E-6d, 630999.9844577718d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1947097.9863706622d) + "'", double3 == (-1947097.9863706622d));
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.26157790631375005d), (-0.8256739378496681d), (-0.12075738946674315d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.671316877807062d) + "'", double3 == (-4.671316877807062d));
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.013914145094137E8d), (-2.07127479839785d), 0.1535392949910232d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.3116603957958345E9d) + "'", double3 == (-1.3116603957958345E9d));
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.8644585131437445E11d, (-1.5622855469442368E11d), (-17497.927436058242d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.529867652191609E7d) + "'", double3 == (-2.529867652191609E7d));
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(362425.7801779578d, 197669.62927353228d, 45.89324278590108d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3589.9871288903655d + "'", double3 == 3589.9871288903655d);
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.21009675880084E-4d), 0.18860617878447877d, 6.010252156357536d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0315173446192247d) + "'", double3 == (-0.0315173446192247d));
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.472826932117897E-4d, 11787.146137549189d, (-2247.4992407486698d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.244560388078286d + "'", double3 == 5.244560388078286d);
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.06444874751764998d, 434793.49466778926d, 0.007582100055661897d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.734472336517926E7d) + "'", double3 == (-5.734472336517926E7d));
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(757.7856488949959d, (-1258701.0658293972d), (-194922.44354491544d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.4613331773058675d) + "'", double3 == (-6.4613331773058675d));
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-606.8342299716378d), (-4.4045384154440165E-4d), (-11725.329107834981d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.051754094399986086d + "'", double3 == 0.051754094399986086d);
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0037949761453878596d, 0.0075012565845753165d, (-0.2078226836897365d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01783385900607776d + "'", double3 == 0.01783385900607776d);
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-50822.6418952214d), 2.7250439145079263E12d, 2.0865002460388214E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.3060357747400266E16d) + "'", double3 == (-1.3060357747400266E16d));
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3403485864208592E-4d, 5084.131915321833d, 71.57578496506632d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-71.03144986490004d) + "'", double3 == (-71.03144986490004d));
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1223.7100442385943d), (-640.0891907341843d), (-0.00868200610855715d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 67221.88929689674d + "'", double3 == 67221.88929689674d);
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-114581.1720164991d), 32176.917179642904d, 58.58234368006642d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2505.1590629017255d) + "'", double3 == (-2505.1590629017255d));
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.962656290085329d, (-1518585.3593761062d), (-3544.0809466896208d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-428.4863536908909d) + "'", double3 == (-428.4863536908909d));
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.402402592049422E7d), 4.052888814265645E-4d, 436.7844485575532d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-55002.01758610453d) + "'", double3 == (-55002.01758610453d));
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.3962432147967874d), (-3.473306218796001d), 240.70698897028777d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.008629009954736297d + "'", double3 == 0.008629009954736297d);
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 68.1163402476062d, 0.00465340551583337d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-14637.954937698432d) + "'", double3 == (-14637.954937698432d));
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.011018024133122d), (-48.845019892110265d), (-6368.6964286007305d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.006882727471688886d) + "'", double3 == (-0.006882727471688886d));
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.9764516704652357d, 0.906825088732021d, (-4.97271665616187d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.014001719089893854d) + "'", double3 == (-0.014001719089893854d));
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.6881153698032372d, 1.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.647322480503532E-4d, (-0.8932635507964994d), (-1.2317804270966966E9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.255581135925865E-10d) + "'", double3 == (-7.255581135925865E-10d));
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3639495421412378E-16d, (-0.9569215772565901d), (-21.53556252309361d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.04443448255556072d) + "'", double3 == (-0.04443448255556072d));
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-388.59075302975526d), 1.847317734307343E16d, 0.028401822439869794d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.504222530854788E17d) + "'", double3 == (-6.504222530854788E17d));
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.7964286734506206E-5d, (-1743870.4424646092d), 4.699734714883293E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.710572081824151E9d + "'", double3 == 3.710572081824151E9d);
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.6766908551054896E-9d, 0.00514629998467077d, (-1.1863471470806576E13d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.3379362614423923E-16d + "'", double3 == 4.3379362614423923E-16d);
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.3073147507737182E-4d), 6.4704957417854d, (-269.09408306831494d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0240459634023903d + "'", double3 == 0.0240459634023903d);
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(233951.2658488795d, (-0.9630245949935884d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4539.679766773752d, 0.0d, 1015.5245476514809d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.470280681321088d + "'", double3 == 4.470280681321088d);
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7336.886160114724d, 3.1308598070191323E-4d, (-53.178161845656376d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-137.96802281965344d) + "'", double3 == (-137.96802281965344d));
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-36323.46076404261d), (-183362.25353488396d), 9.714652158947119E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.513577535922578E10d + "'", double3 == 1.513577535922578E10d);
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.958730825725353E-4d), (-15702.943301169422d), 0.049517001548323815d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 317122.25123267574d + "'", double3 == 317122.25123267574d);
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3803250.056869858d), 75.25443661713334d, 1.4325933296457168E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.6548534274182648E10d) + "'", double3 == (-2.6548534274182648E10d));
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-63.307702419435785d), (-96554.45052135878d), (-0.006009838541141801d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.6055529971127499E7d) + "'", double3 == (-1.6055529971127499E7d));
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.5285441275553774E-4d), (-9.705438745055022E-5d), 1.0919555184106426E15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.258374716791209E-19d) + "'", double3 == (-3.258374716791209E-19d));
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.264057921254216E11d, 0.0d, (-103016.32495324952d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4139206.0172883417d) + "'", double3 == (-4139206.0172883417d));
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.097453561498216E-17d), (-0.02441966152248684d), (-5.541622719503886E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.4065904083547896E-10d) + "'", double3 == (-4.4065904083547896E-10d));
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.753743136477039d, 2.99710411982308E-7d, 8.744947822013767E8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.292470250442527E-9d + "'", double3 == 4.292470250442527E-9d);
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.00910929143372252d, 38.191766154880995d, (-8.94206552414413E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 42700.041461731336d + "'", double3 == 42700.041461731336d);
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.0875100690650042E-8d, (-17497.927436058242d), (-7.782709130653938E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.248308030316798E8d) + "'", double3 == (-2.248308030316798E8d));
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.1783738876319942d), (-139.36240834642797d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.6527390014518221d), 27.349295119546163d, 1.6668216078139844E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.67996586975629E-8d) + "'", double3 == (-1.67996586975629E-8d));
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0014196858248230533d, (-30522.347387205173d), 8.529733685940675E-7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.578347218178704E10d + "'", double3 == 3.578347218178704E10d);
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(99567.08401717755d, 3436084.234616545d, 18913.653098061826d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-176.40786437715073d) + "'", double3 == (-176.40786437715073d));
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.325443884910899d), (-1.0045861653428234d), 4880.630379669624d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.804157375656192E-4d) + "'", double3 == (-6.804157375656192E-4d));
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.0024536239201452753d, 430.67798332204677d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.6971194608537405E-6d) + "'", double3 == (-5.6971194608537405E-6d));
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.902536259591443E8d, (-2.561724108503911E-4d), 1.1665402551591403E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.4881578211786945E13d + "'", double3 == 2.4881578211786945E13d);
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.588504832975711d), (-0.5649782107488386d), (-591.4319859482376d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.008493836555310238d + "'", double3 == 0.008493836555310238d);
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.851781547575932E-12d), 0.0d, 113185.33392677283d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.704114928838492E-17d) + "'", double3 == (-8.704114928838492E-17d));
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7402.277670862052d), 2.2189770986883857d, 0.005825741099429414d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1270996.5172818878d) + "'", double3 == (-1270996.5172818878d));
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-388.59075302975526d), (-0.09137094436930399d), (-34.69774009176916d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11.196676816930333d + "'", double3 == 11.196676816930333d);
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.5805161427106683d, (-1.5622855469442368E11d), 90.51540701057033d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7259885344907074E9d + "'", double3 == 1.7259885344907074E9d);
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-25.203544966414682d), (-0.0023766933453507385d), 0.09306707828203666d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-270.78499441766115d) + "'", double3 == (-270.78499441766115d));
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.0d), 0.01737925304935617d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-127.9691388195903d), (-2.34888951651302d), 13622.023319114709d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.009221849527067267d) + "'", double3 == (-0.009221849527067267d));
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.2452017202790691E8d, (-2.5466888810150405d), (-6645741.810621124d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-18.736836025677306d) + "'", double3 == (-18.736836025677306d));
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(568382.180627529d, 0.0d, 4.371761300917517E15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3001217164080771E-10d + "'", double3 == 1.3001217164080771E-10d);
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(796.468526501686d, 2.2109533306969795d, (-1.0421258573956778d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-762.1512963471386d) + "'", double3 == (-762.1512963471386d));
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-4.166724240974974E8d), 6.280766606862781E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.6341013793159185d + "'", double3 == 6.6341013793159185d);
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(278.65489571357875d, 12.104314359760158d, 357578.98927461426d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.454313294372912E-4d + "'", double3 == 7.454313294372912E-4d);
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(23066.570071714337d, (-0.08101442761435378d), (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-23066.651086141952d) + "'", double3 == (-23066.651086141952d));
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.736099613429825E-4d), (-0.04755899938446978d), (-5.743955639945776E9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.162561196863526E-12d) + "'", double3 == (-8.162561196863526E-12d));
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.027558778165378155d, (-3.630524070364386E9d), (-0.02098788798311647d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7298186808088977E11d) + "'", double3 == (-1.7298186808088977E11d));
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.8340517646892067d, 2.7175841417407885E7d, (-2257516.808775793d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.037934547248419d + "'", double3 == 12.037934547248419d);
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.48845402702708d, (-1116.9628242387369d), (-1.8464478555125916E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6073560.511972532d) + "'", double3 == (-6073560.511972532d));
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.083499824907562d, (-5.888730169000196E15d), (-0.01152641267370332d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.108901039466433E17d) + "'", double3 == (-5.108901039466433E17d));
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1, (-114581.1720164991d), 1396351.6467253643d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.08205824964306804d + "'", double3 == 0.08205824964306804d);
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2440.153302131423d, 2.2189770986883857d, (-1.1103608117413087E9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.1956235299852453E-6d) + "'", double3 == (-2.1956235299852453E-6d));
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.003442246480318322d, (-9.825405664374313E-5d), 362425.7801779578d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.768898159572461E-9d + "'", double3 == 9.768898159572461E-9d);
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 5886.953471402866d, (-20.601096504141683d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 285.7592298652327d + "'", double3 == 285.7592298652327d);
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(20.119943489505655d, 348943.046169062d, (-0.03549025285521417d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9831514.237135375d + "'", double3 == 9831514.237135375d);
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.5980422167835707E-4d), (-5.417344911978487E8d), (-4.343640831723027E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-12.471898855932679d) + "'", double3 == (-12.471898855932679d));
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.04090629792183214d, 1.5045208717248888E14d, (-4.920043064367701E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3057942.485546601d + "'", double3 == 3057942.485546601d);
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.459651263732963E-8d), (-0.09105623077313085d), (-0.005834529813510712d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-15.606432581039213d) + "'", double3 == (-15.606432581039213d));
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.01146206392065246d, (-1.5881746692241423E-5d), (-891.2598055815954d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.2878338723975912E-5d) + "'", double3 == (-1.2878338723975912E-5d));
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2073.7978488756476d, 0.0015511267324521702d, 68255.63649544693d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.030382784546844715d + "'", double3 == 0.030382784546844715d);
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-62379.381928932686d), (-0.13998227701084454d), 28.482130755577135d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2190.118516131069d) + "'", double3 == (-2190.118516131069d));
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.327453864569369d), 2.2381090455060665E-6d, 0.42734743841663353d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.786301738480015d) + "'", double3 == (-7.786301738480015d));
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.5656538153425212d, (-4.888049273720708E-6d), (-0.0038632266354697077d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-146.42130963746052d) + "'", double3 == (-146.42130963746052d));
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0034389860437794126d, 1063.211405992356d, 0.02169555487390554d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-49005.797417289934d) + "'", double3 == (-49005.797417289934d));
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.927041344738404d), 4.341507509246353d, 9.541959527025432E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9713.464857751387d) + "'", double3 == (-9713.464857751387d));
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.343640831723027E7d), (-0.1525255461339563d), 0.027966587474714467d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.5531536768287172E9d) + "'", double3 == (-1.5531536768287172E9d));
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.748874415939053E12d), (-1.1719640415995845E8d), (-0.0019680606298880087d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.396683200604094E15d + "'", double3 == 1.396683200604094E15d);
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(181765.15533114015d, (-4.5285441275553774E-4d), 3062.7952119263973d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 59.34616688579393d + "'", double3 == 59.34616688579393d);
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 0.0f, (-0.07909666553124592d), (-7087637.321159789d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1159807132781293E-8d) + "'", double3 == (-1.1159807132781293E-8d));
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.7652849861370218d, 5.267022761025044d, (-0.07317714068437882d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 61.518361236667054d + "'", double3 == 61.518361236667054d);
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7.575720850724105E-4d), 138.70940416242848d, (-3.500603119037805E12d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.9624646673068206E-11d + "'", double3 == 3.9624646673068206E-11d);
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-127841.65666511058d), (-7.102246774698782E7d), (-3256.5525064251005d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-21769.83971560394d) + "'", double3 == (-21769.83971560394d));
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.346549939556586E18d, 0.051378977802173126d, (-0.010088089884912716d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.291131435147297E20d) + "'", double3 == (-6.291131435147297E20d));
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.793397438476368E-11d, (-9.643238983591384E7d), 0.025628608078652092d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.7626854154533386E9d + "'", double3 == 3.7626854154533386E9d);
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.950776074419095E-4d), (-141.52254153100745d), (-9227.722631526587d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.015336638529845723d) + "'", double3 == (-0.015336638529845723d));
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.990971428571429d), 0.28827702477580974d, 7.035546495922913E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-146104.4775882591d) + "'", double3 == (-146104.4775882591d));
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.777355694964384E-5d, 581567.3571926672d, (-0.6729041727145324d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 864264.7507576286d + "'", double3 == 864264.7507576286d);
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-0.021716030337277342d), (-0.046904311177548515d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.4629858064661668d) + "'", double3 == (-0.4629858064661668d));
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-747571.4033981002d), (-86490.36092868313d), 0.061653800278934884d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0722470301563667E7d) + "'", double3 == (-1.0722470301563667E7d));
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.861287326778879E-7d, 4244.555418052495d, (-2.232181032951314E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.9015283055937263E8d + "'", double3 == 1.9015283055937263E8d);
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.017005517219184554d, 0.003442246480318322d, (-3102.843568972189d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.371238973983802E-6d) + "'", double3 == (-4.371238973983802E-6d));
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.8709298884800625E8d, 0.10587300801897107d, 5166596.250086365d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 94.27734724461796d + "'", double3 == 94.27734724461796d);
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.22988703914749656d), 1.2939290417615068E9d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.2939290419913938E9d) + "'", double3 == (-1.2939290419913938E9d));
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.7037398106351773d), 0.0d, 614397.1823443279d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.400638362823602E-6d) + "'", double3 == (-4.400638362823602E-6d));
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(89.91771687002392d, (-30544.27372620324d), (-6253390.42296602d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.004898813183096168d) + "'", double3 == (-0.004898813183096168d));
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(14.267015677794571d, (-1018.4201436752305d), 9.714652158947119E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0630202115903123E8d + "'", double3 == 1.0630202115903123E8d);
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.08438723137081444d), (-1.7298186808088977E11d), 6.5682320769386116E10d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.633613825676978d + "'", double3 == 2.633613825676978d);
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.04582412771193874d), (-0.047808065325613415d), (-4.888049273720708E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-405.875125756359d) + "'", double3 == (-405.875125756359d));
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.465365853658536d), 1.8298417250026228E9d, (-0.0026273642337297665d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.964552938556117E11d + "'", double3 == 6.964552938556117E11d);
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 5887.28811578857d, 6.010252156357536d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-979.540951465922d) + "'", double3 == (-979.540951465922d));
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.03137934133093799d), 0.4425816845525891d, 658621.8333815158d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.196254388502463E-7d) + "'", double3 == (-7.196254388502463E-7d));
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.0405728710776684E-4d, (-12.198874789159383d), 4.462338981444688d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.733785778528422d + "'", double3 == 2.733785778528422d);
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(29150.14193001331d, 7.03338262456466d, (-0.2437571795920304d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-119557.94941574543d) + "'", double3 == (-119557.94941574543d));
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1459987.3038599016d, (-0.4676258615886284d), (-0.08513640106250044d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7148807716383915E7d) + "'", double3 == (-1.7148807716383915E7d));
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.021602935401105815d), (-1.3981277570580793E10d), 125529.76571116375d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 111378.1858139467d + "'", double3 == 111378.1858139467d);
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.2359162525153198E-8d), (-2.9279365079365083d), (-103839.33241119739d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.8196796219595257E-5d) + "'", double3 == (-2.8196796219595257E-5d));
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.255617856184481E-4d), (-0.5002642543097772d), 229121.9932526153d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.1811031120577702E-6d + "'", double3 == 2.1811031120577702E-6d);
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.123996754976744E12d), (-26406.993606320168d), 0.1405837852482137d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.995208882626328E12d) + "'", double3 == (-7.995208882626328E12d));
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.13625250546110876d), 126.75305523081563d, (-7122.93809493948d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.017814180896282922d + "'", double3 == 0.017814180896282922d);
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.072911887764989E-4d), (-6.357325234240991d), 18799.290027080136d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.3815734178763493E-4d + "'", double3 == 3.3815734178763493E-4d);
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.128406969048056E7d), 3.0801930827514786E-6d, (-0.026347318130971787d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.5669173418433585E9d + "'", double3 == 1.5669173418433585E9d);
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.341869480221412E-6d), (-1.1541862760195645E-4d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5887.28811578857d, (-1531.9635775952681d), (-7183.620461572214d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.03280118055681d) + "'", double3 == (-1.03280118055681d));
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5166596.250086365d, 2.719070303737211E7d, (-6.959402790924032E-7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.164654705143385E13d + "'", double3 == 3.164654705143385E13d);
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(75.25443661713334d, (-4.3947672684470583E-7d), (-6.383742637692088E14d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.17884509648429E-13d) + "'", double3 == (-1.17884509648429E-13d));
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.583223394584582d), 0.0018768143330709101d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.834446838468178E12d), 0.0d, (-1.8181301192142022E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.659021368920301E18d + "'", double3 == 2.659021368920301E18d);
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-24.240738918625162d), (-252.75954075292424d), (-3689427.387945577d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.193882622027903E-5d) + "'", double3 == (-6.193882622027903E-5d));
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.093848565440232E-6d), (-9.643238983591384E7d), (-6020.689681681192d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-16016.834438307134d) + "'", double3 == (-16016.834438307134d));
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.4651978376550696d), 2223406.0782711417d, 5.960219830491476E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.730415331485581E11d) + "'", double3 == (-3.730415331485581E11d));
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6817484.355556762d, (-6.706429677552379E12d), (-3.07070562638155E17d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.1840050174198713E-5d) + "'", double3 == (-2.1840050174198713E-5d));
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.093904382563665E10d, 2.138675582324624d, (-806.6089036160414d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.835693318632824E7d) + "'", double3 == (-3.835693318632824E7d));
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.03580972901448908d, (-178.94799321650655d), (-5.435269469819528d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-32.93006978575139d) + "'", double3 == (-32.93006978575139d));
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.812158732714832E-5d), (-1285.6964172134524d), (-1.5712564869311635E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8182600.102437581d) + "'", double3 == (-8182600.102437581d));
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.9569215772565901d), (-3.4192793605482405E8d), 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.419279350979025E8d + "'", double3 == 3.419279350979025E8d);
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.3248401363089306d, 4.9187444995090514E8d, 0.72055691323901d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.826309491848694E8d) + "'", double3 == (-6.826309491848694E8d));
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(22913.90558322626d, 4884.154123260727d, 13.439970251589838d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1341.5023338933925d + "'", double3 == 1341.5023338933925d);
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.07630497445598548d, 0.5805161427106683d, (-0.006009838541141801d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 83.89762300650567d + "'", double3 == 83.89762300650567d);
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.8117122392737371d, (-52.01396825396825d), (-390059.53854209953d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.354297876951943E-4d) + "'", double3 == (-1.354297876951943E-4d));
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.961920265214859E-11d), 0.0d, 1157.6861385734317d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.1498589009293005E-14d) + "'", double3 == (-5.1498589009293005E-14d));
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1289.7913696807416d, 1050.8426218622233d, (-4.350120325896268E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-549292.2722069464d) + "'", double3 == (-549292.2722069464d));
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.061036535359982E11d, (-181648.79668820262d), (-5.857965138100431E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-12053.739114838158d) + "'", double3 == (-12053.739114838158d));
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(41.07238003347289d, 2489.6282078012d, 67587.17996327706d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.03622811055437037d) + "'", double3 == (-0.03622811055437037d));
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.597663786945825E-4d), (-0.014802498512616825d), 805588.8368964394d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7804035355278933E-8d + "'", double3 == 1.7804035355278933E-8d);
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.555596366295533d, (-3675855.9833939224d), (-1.9304282209743076d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1904166.9092130475d) + "'", double3 == (-1904166.9092130475d));
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-59221.74249123638d), (-1.2482378344762843E9d), (-17759.47148852825d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-70282.41879495431d) + "'", double3 == (-70282.41879495431d));
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-273.47492579646894d), (-43.33949979051061d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.286728462276383E7d), (-9.578953279316647d), 3.679109686196488E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.4369583826804965E11d) + "'", double3 == (-1.4369583826804965E11d));
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1358.5549978183717d, (-1.4855227054802647E10d), (-4.3830270611791724E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.389262307990661E13d) + "'", double3 == (-3.389262307990661E13d));
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.406445789007355E-7d, (-0.0027170302320845066d), (-1.0511692756295508d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.002585093514111664d) + "'", double3 == (-0.002585093514111664d));
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.34545264431260303d), (-18.736836025677306d), 1.3670433117538021E10d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3453402114794811E-9d + "'", double3 == 1.3453402114794811E-9d);
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.04582412771193874d), 2232.42201789151d, (-0.08438723137081444d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 26455.043088323517d + "'", double3 == 26455.043088323517d);
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.0d, (-33668.468261484515d), (-4.859744364937509d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6930.090501152849d) + "'", double3 == (-6930.090501152849d));
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.974668742231324E-6d, 3.5950772074083084E8d, 2073.7978488756476d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-173357.16735155284d) + "'", double3 == (-173357.16735155284d));
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-85.57111079187985d), 0.4204641865413196d, (-13.659944808043116d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.295162695517513d + "'", double3 == 6.295162695517513d);
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(95.64798656102286d, (-1.8978651107191384E7d), (-4637.148358735402d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4092.7624667056466d) + "'", double3 == (-4092.7624667056466d));
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(179.4136678795534d, (-1.1757916030312405d), (-85450.51646580474d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0021133805499566785d) + "'", double3 == (-0.0021133805499566785d));
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.3589968101107747E-5d), 6.346549939556586E18d, (-3244450.3499800814d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.956124845490562E12d + "'", double3 == 1.956124845490562E12d);
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(13060.092481229245d, 1.6681931311196593E-7d, 187034.54304353212d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06982716811847264d + "'", double3 == 0.06982716811847264d);
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.035427543652873E-7d), (-0.30766356745377826d), (-0.4378395312620673d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.7026849837523536d) + "'", double3 == (-0.7026849837523536d));
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(240.70698897028777d, 1.3435467492251414d, (-1.2555776668766197E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.9064009223459996E7d) + "'", double3 == (-1.9064009223459996E7d));
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.9712841264185227E-6d, 0.0d, 56.158660220318865d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.510205048847104E-8d + "'", double3 == 3.510205048847104E-8d);
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1361893.7742382477d, (-2.263231850117096d), 6560.035608958553d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 207.60497635260663d + "'", double3 == 207.60497635260663d);
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-48.72822680118256d), (-5.857965138100431E7d), 2.585488226796714E-13d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.2657075768376096E20d + "'", double3 == 2.2657075768376096E20d);
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.834446838468178E12d), 6945.805721580966d, 4880.630379669624d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.90537383357687E8d) + "'", double3 == (-9.90537383357687E8d));
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-35066.450850928806d), 8.59829917495093E-4d, (-201.59637404159233d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 173.9438612299842d + "'", double3 == 173.9438612299842d);
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(21.254180846933384d, (-2.2916749161491477E-9d), (-1.806555377406182E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-117650.31459894359d) + "'", double3 == (-117650.31459894359d));
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3696572.6629174864d), 0.017005517219184554d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(25.058534698933222d, 6.271147877957007E11d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.00915797612072067d), (-0.03373477679865521d), (-10756.69911268453d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.2847901963673088E-6d) + "'", double3 == (-2.2847901963673088E-6d));
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.961703135888502d, (-0.11574222752799536d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.417344911978487E8d), 1225.8551105601869d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.017659035228367304d, 219.99473074203414d, 0.0014412669839387155d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-152627.5659945038d) + "'", double3 == (-152627.5659945038d));
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.426649544426499E13d), 1.8554668589611745d, (-0.0013586595187355624d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.99412028517417E16d + "'", double3 == 3.99412028517417E16d);
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1461.1037619556068d, (-0.5002642543097772d), 865150.4979523788d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0016894217013909282d + "'", double3 == 0.0016894217013909282d);
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.455825181605462E14d), 2.7966111308613394E-4d, 38.79874357459719d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.4061860459774191E13d) + "'", double3 == (-1.4061860459774191E13d));
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0032537872546947776d, (-1.9915501626449266E8d), 1.1905204613571002E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.16728399278473996d + "'", double3 == 0.16728399278473996d);
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.017742165069138893d, 0.0d, (-18.87433095138013d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.400155753781327E-4d) + "'", double3 == (-9.400155753781327E-4d));
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.037720067402425d, (-24.58841355160647d), 2.2381090455060665E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.1896709712367196E7d + "'", double3 == 1.1896709712367196E7d);
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(35283.65136662302d, 1.791627849440949d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-46.936547120375366d), (-123.13007499062992d), 287357.93978421745d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.65151984063742E-4d + "'", double3 == 2.65151984063742E-4d);
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(30529.057009980253d, 258736.8504784611d, (-0.04471323346493141d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5103808.778389159d + "'", double3 == 5103808.778389159d);
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-67.07729882868468d), 0.0d, (-9.990971428571429d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.713791477459545d + "'", double3 == 6.713791477459545d);
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(21.254180846933384d, 0.0d, 0.5656538153425212d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 37.574538119332416d + "'", double3 == 37.574538119332416d);
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(16979.992812919598d, 8083534.713821519d, (-0.0015898810127189268d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.073684543985856E9d + "'", double3 == 5.073684543985856E9d);
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.302232499477762E10d, 14164.959301529876d, 4244.555418052495d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.1915678243753314E7d + "'", double3 == 2.1915678243753314E7d);
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-60750.37725429435d), 2.9297093922752473E-4d, (-4.445875784605726E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3664434296077126E8d + "'", double3 == 1.3664434296077126E8d);
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-97.05148336942d), (-2686.258233854758d), 6.280766606862781E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.122437454778529E-5d + "'", double3 == 4.122437454778529E-5d);
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-105785.4529149172d), (-495794.32082231203d), 5.8903451663085776E-8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.621154735348211E12d + "'", double3 == 6.621154735348211E12d);
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.22299127143775943d, 32.62315933965993d, (-0.9461365114570157d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 34.244707477071245d + "'", double3 == 34.244707477071245d);
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.018211502704118795d), 0.10123943936875583d, (-1119.0111575101134d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0674687313990884E-4d + "'", double3 == 1.0674687313990884E-4d);
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.35072236683810853d), (-52.17277789640387d), (-4169449.818878871d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.24289913011833E-5d) + "'", double3 == (-1.24289913011833E-5d));
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0301972505622514d, (-373.7784880082755d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.30388839410365465d, 2.4420147012832565E9d, (-25.203544966414682d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.689171520250453E7d + "'", double3 == 9.689171520250453E7d);
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(27165.672911160276d, (-7116507.983360336d), 3.9624646673068206E-11d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.8028359256328352E17d + "'", double3 == 1.8028359256328352E17d);
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-293434.669937841d), (-15203.024370552523d), 3334601.1605693833d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0834377582714511d) + "'", double3 == (-0.0834377582714511d));
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.028401822439869794d, 0.0d, 94.27734724461796d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.0125818417627546E-4d + "'", double3 == 3.0125818417627546E-4d);
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(161.2009255255225d, 0.0d, 0.020962887107713414d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7689.82462659963d + "'", double3 == 7689.82462659963d);
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1223.9517457454683d, 0.0d, 8436.514547030092d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1450778919330301d + "'", double3 == 0.1450778919330301d);
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.1890738817876488E-8d, (-0.044514678674805463d), 12.723391095032145d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.003498649867245303d + "'", double3 == 0.003498649867245303d);
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3646282.480765816d, (-0.02296422630797628d), 3.3357441478551286d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1093094.1769243868d + "'", double3 == 1093094.1769243868d);
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-319.1789986161952d), 145.54263652984656d, 5.2556443075979546E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.842334221024152E-6d) + "'", double3 == (-8.842334221024152E-6d));
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-202.14142258157375d), 9.455277418787318d, 699.8312108750605d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.30235390578791577d) + "'", double3 == (-0.30235390578791577d));
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-123.13007499062992d), (-2686.258233854758d), (-155986.9414527414d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.016431684184542248d) + "'", double3 == (-0.016431684184542248d));
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.9915501626449266E8d), 0.672882041789935d, (-26406.993606320168d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7541.752760893976d + "'", double3 == 7541.752760893976d);
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.793397438476368E-11d, (-1.5712564869311635E-4d), (-1.0045861653428234d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.5640841178961515E-4d) + "'", double3 == (-1.5640841178961515E-4d));
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.7313310896523874E7d, (-295355.71310012514d), 0.0014345006435060425d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.9246186284131634E10d + "'", double3 == 1.9246186284131634E10d);
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.2556443075979546E7d, (-53192.36065181185d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.18738560259926E8d), (-26406.993606320168d), 3.047688952429257d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.176327921915661E7d) + "'", double3 == (-7.176327921915661E7d));
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-28.591764407761374d), (-19007.84152466927d), (-0.29758395464714504d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-63777.79938695224d) + "'", double3 == (-63777.79938695224d));
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.28855900038211735d), 150931.04401946944d, 314822.8733632968d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.4794166667944082d) + "'", double3 == (-0.4794166667944082d));
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1802.8513070178358d), (-36816.32715833758d), (-0.9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-38903.862057021935d) + "'", double3 == (-38903.862057021935d));
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1244.6388661197923d), 2.2052588110254116E9d, (-0.2437571795920304d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.046954265532444E9d + "'", double3 == 9.046954265532444E9d);
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.616698045830711d, 5.70852419736485E8d, (-0.17061005163973067d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.3459483109777703E9d + "'", double3 == 3.3459483109777703E9d);
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(80758.15563157137d, (-0.8775025723008872d), (-0.09284987420992283d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-869780.7489922586d) + "'", double3 == (-869780.7489922586d));
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3446103915751453d, (-0.5086896265246781d), 3.2734402890550405E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5661.62768967087d + "'", double3 == 5661.62768967087d);
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1245911.75374839d), 700.3584178094426d, 1.0009280076924765E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.12454563191214112d) + "'", double3 == (-0.12454563191214112d));
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1258701.0658293972d), (-138.83345206457793d), 223589.88869996622d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.628887065041608d) + "'", double3 == (-5.628887065041608d));
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4804.102665491978d), 42.21606629824469d, 0.08205771057768096d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-59059.8823397881d) + "'", double3 == (-59059.8823397881d));
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4222.24871449058d, 1.0867386451984958E8d, (-6.804157375656192E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.5971065375402933E11d + "'", double3 == 1.5971065375402933E11d);
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.13873377200587783d), 6.805061416816063E8d, 3.2301198734976446d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.1067519735218775E8d) + "'", double3 == (-2.1067519735218775E8d));
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-34.13353624341552d), (-3.5828436975916955E-5d), 0.0016339285714285715d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-20890.44834140763d) + "'", double3 == (-20890.44834140763d));
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.0747216796961373E8d), 44247.520303499696d, 5.960219830491476E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.4816906320853863E13d) + "'", double3 == (-3.4816906320853863E13d));
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.017574460359640873d, (-9.90537383357687E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.774234941044589E-11d + "'", double3 == 1.774234941044589E-11d);
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.93075499988197E9d), 0.0d, 1745.6691307397193d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2824564.468177647d) + "'", double3 == (-2824564.468177647d));
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 3.0697363995988333E8d, (-0.0024540944772564028d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.2508631709365558E11d + "'", double3 == 1.2508631709365558E11d);
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(84.45213259648938d, 0.36280576123039016d, (-1072.3114823071012d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.07841875072934872d) + "'", double3 == (-0.07841875072934872d));
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.18278989428235987d), (-1.798677345107274E7d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.383742637692088E14d), (-3745.3768850495107d), 183299.3891781771d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.4826862578626947E9d) + "'", double3 == (-3.4826862578626947E9d));
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8460227.708496958d, (-49.24902537903796d), (-1.3060791968549404E13d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.477614051195991E-7d) + "'", double3 == (-6.477614051195991E-7d));
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(99567.08401717755d, (-3.07070562638155E17d), 3.1308598070191323E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.80786689809066E20d + "'", double3 == 9.80786689809066E20d);
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-690632.7512921048d), 0.906825088732021d, (-232260.55752452716d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.9735296663285644d + "'", double3 == 2.9735296663285644d);
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-53.00142506533407d), (-0.005129344935279409d), (-5.908392924406798E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 896966.3392134607d + "'", double3 == 896966.3392134607d);
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(18.16546891426259d, 1630.4424982839612d, (-0.014802498512616825d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 108919.24954395257d + "'", double3 == 108919.24954395257d);
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.8563147640965357d, (-3.803250056869926E7d), 91.485652292601d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 415720.940627648d + "'", double3 == 415720.940627648d);
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.08194897038813646d, (-0.0058084313904541085d), (-7116507.983360336d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.233152579661022E-8d) + "'", double3 == (-1.233152579661022E-8d));
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.499925715596078E-5d, (-115.1597666356924d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1757916030312405d), (-0.004232624137775097d), (-155986.9414527414d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.510622158383733E-6d + "'", double3 == 7.510622158383733E-6d);
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3714441.8990268465d), (-11.987912652823866d), 100.2164565887138d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-37064.07148636411d) + "'", double3 == (-37064.07148636411d));
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.929691332544355E-7d), 27.21311475409836d, (-58757.55157682608d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.631424270884752E-4d + "'", double3 == 4.631424270884752E-4d);
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(289.1012870172078d, (-123677.63919007055d), (-0.03373477679865521d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3674746.1296981075d) + "'", double3 == (-3674746.1296981075d));
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.9744701149674156E-11d, 8.517957529894811E-4d, (-5.015040670271043E-10d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1698482.184390229d + "'", double3 == 1698482.184390229d);
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1743870.4424646092d), (-2.129261879527032E7d), (-0.891158444238034d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.193633295987051E7d) + "'", double3 == (-2.193633295987051E7d));
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(99.7762533068953d, (-126.23618422351787d), (-1363992.3449477204d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.65699197922607E-4d) + "'", double3 == (-1.65699197922607E-4d));
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-30544.27372620324d), 1.2078903345166389E-5d, 29150.14193001331d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0478259012122826d) + "'", double3 == (-1.0478259012122826d));
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(12.166944436037914d, (-1245911.75374839d), Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(92.15411821524455d, (-0.46547792384708586d), 0.0020499634375222677d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 45181.096620454024d + "'", double3 == 45181.096620454024d);
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-66.58694181730846d), 1.3670433117538021E10d, (-207.00456697639197d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.60392830158381E7d + "'", double3 == 6.60392830158381E7d);
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-23.308445443646573d), (-0.5926029487703854d), 2.7313310896523874E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.316766349174901E-7d) + "'", double3 == (-8.316766349174901E-7d));
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.452903627643943d, 0.017574460359640873d, 16.811315308380642d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5612487181523909d + "'", double3 == 0.5612487181523909d);
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.028276881724881808d, (-21777.583427379985d), (-6.504222530854788E17d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.348226725170131E-14d) + "'", double3 == (-3.348226725170131E-14d));
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-117.58846188300636d), 1.8589013933436386E-5d, (-4.220792659563041d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 27.85933590118442d + "'", double3 == 27.85933590118442d);
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.738097525550829E9d), (-580.0218579234972d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(293422.11915345944d, (-2.151817791815755d), 27.133308983542022d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10814.172025580465d + "'", double3 == 10814.172025580465d);
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.123996754976744E12d), (-100311.97720507701d), 1.734616222942187E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.479800199022053E17d) + "'", double3 == (-6.479800199022053E17d));
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-18.264700793263554d), 6.346549939556586E18d, 612800.9223859196d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0356625957491234E13d) + "'", double3 == (-1.0356625957491234E13d));
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.6971194608537405E-6d), (-0.33698807182899176d), 9.754727149999918E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3454.554592124432d + "'", double3 == 3454.554592124432d);
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.489550986750312E7d, 0.14322896722453374d, (-18.178161845656373d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3569970.950598659d) + "'", double3 == (-3569970.950598659d));
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 1.616536760749328d, 1.1663945304393908E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-13859.262184128767d) + "'", double3 == (-13859.262184128767d));
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(56454.23168323412d, 5.810505379137091E-9d, (-36717.982617732654d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.537509080250073d) + "'", double3 == (-1.537509080250073d));
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.3116603957958345E9d), (-4.057460335443251d), 75.86337066683967d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7289772128615804E7d) + "'", double3 == (-1.7289772128615804E7d));
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1987.6843662105186d), 0.028846153739562484d, 28444.63036034656d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.06988008587853699d) + "'", double3 == (-0.06988008587853699d));
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0014196858248230533d, (-1.3981277570580793E10d), 0.047453064425264424d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.946338184881999E11d + "'", double3 == 2.946338184881999E11d);
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 68.39384314040382d, (-1.1221141284554832d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 60.95087959951407d + "'", double3 == 60.95087959951407d);
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-0.003929249906775104d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8.205448750155846d, 0.0d, 25.10537682987575d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.32684029424291483d + "'", double3 == 0.32684029424291483d);
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.685075834962053d), (-3.5491131900267425d), 4.4235052059527657E-10d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.387126805384578E10d) + "'", double3 == (-1.387126805384578E10d));
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-70282.41879495431d), 0.0d, 8.2451967306892E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.524043887680475E8d) + "'", double3 == (-8.524043887680475E8d));
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0010462050201086822d, (-2.4279878645578637E-5d), 3238.731632229868d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.3052596519620603E-7d + "'", double3 == 3.3052596519620603E-7d);
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-295355.71310012514d), (-0.003641239572747525d), (-7.995208882626328E12d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.694158761764143E-8d + "'", double3 == 3.694158761764143E-8d);
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.007179270658916316d, (-1103.993846762113d), (-1.0615619103072438d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1039.977994042048d) + "'", double3 == (-1039.977994042048d));
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.410820836360394E9d), (-14.116811280841457d), 1274.9471257860532d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2675264.5292177764d) + "'", double3 == (-2675264.5292177764d));
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.350120325896268E-4d), (-0.7026849837523536d), 2.3282189264516592E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.0162540289543717E-8d + "'", double3 == 3.0162540289543717E-8d);
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-571486.0460009018d), (-1.4476190476190476d), 2.4218329287185884E16d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.359719333258184E-11d) + "'", double3 == (-2.359719333258184E-11d));
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2073.7978488756476d, 0.04160688665710186d, (-584550.5651334116d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.003547607967012569d) + "'", double3 == (-0.003547607967012569d));
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 68.14571631970391d, (-0.039789568689739d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1712.6528023229725d + "'", double3 == 1712.6528023229725d);
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-163258.6002237716d), (-0.01119411611366275d), (-17193.10596899805d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.495584411800701d + "'", double3 == 9.495584411800701d);
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(42.23727158215395d, 5.073684543985856E9d, (-112.57965019863204d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.50675099167277E7d + "'", double3 == 4.50675099167277E7d);
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.029266685342399384d, (-5561596.095237301d), 1.8340517646892067d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3032409.5707551846d + "'", double3 == 3032409.5707551846d);
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11.32461716317935d, 0.05312852326342625d, (-0.0014777537718702305d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7627.447044612067d) + "'", double3 == (-7627.447044612067d));
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 1.0255671671688266E13d, (-0.0019585162882003212d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.236449517155761E15d + "'", double3 == 5.236449517155761E15d);
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(142914.48465082634d, (-2.7781914190251897d), (-1.8765772420390457E12d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.615847599588001E-8d) + "'", double3 == (-7.615847599588001E-8d));
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8025.111130190674d), (-2077.763169505585d), 208006.7886686511d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.028592085858116126d) + "'", double3 == (-0.028592085858116126d));
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-32.93006978575139d), 21163.34502120811d, 0.906825088732021d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-23374.160413483714d) + "'", double3 == (-23374.160413483714d));
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-869780.7489922586d), 0.00912119181118901d, (-9.129567400301896d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 95270.75270671515d + "'", double3 == 95270.75270671515d);
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.9118185305298744d, (-0.3390372364910442d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(104700.74121570183d, (-7402.277670862052d), (-206.44385763594752d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-543.0193960250996d) + "'", double3 == (-543.0193960250996d));
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.001133714063698083d, 11322.768343257221d, (-206664.29901807886d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.054788210945677894d + "'", double3 == 0.054788210945677894d);
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.6668216078139844E9d, (-0.003641239572747525d), 10.631120677666594d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.5678700847778103E8d + "'", double3 == 1.5678700847778103E8d);
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(104.39867431758901d, (-0.09105623077313085d), (-0.019197041519533612d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5443.012166329924d) + "'", double3 == (-5443.012166329924d));
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1153669.7741559548d, 2.7250439145079263E12d, (-3.739830652011312E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 72865.40526567966d + "'", double3 == 72865.40526567966d);
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.859744364937509d), (-1.3962432147967874d), (-14637.954937698432d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.3661099961585873E-4d + "'", double3 == 2.3661099961585873E-4d);
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.1722260911858425E7d), 6378457.687275752d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(14.804857532721323d, 7.157377406676948E8d, 1.34955153245034d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.303522752949596E8d) + "'", double3 == (-5.303522752949596E8d));
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0031457783087967305d, 54.71206935067825d, (-1.064750704779036E-11d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.138190876682538E12d + "'", double3 == 5.138190876682538E12d);
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.025371718504164222d), 0.33391548734539833d, (-5.587479427085652E-7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 643021.9753613689d + "'", double3 == 643021.9753613689d);
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.8298417250026228E9d, 6.760621070116967E-7d, (-8586.388369914019d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-213109.59231872545d) + "'", double3 == (-213109.59231872545d));
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.03137934133093799d), 2.65151984063742E-4d, 34.16666666666667d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.261802921463921E-4d) + "'", double3 == (-9.261802921463921E-4d));
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.15225896938846545d, 8818.446476532066d, (-420312.68925715523d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.020980318803003065d + "'", double3 == 0.020980318803003065d);
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-2.6295366852763265E7d), 6.724968673526429E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.910109939437761E10d + "'", double3 == 3.910109939437761E10d);
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-12067.584186230994d), (-0.009954337617466431d), (-5443.012166329924d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.2170764758790193d + "'", double3 == 2.2170764758790193d);
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.649291939855877E9d), 45181.096620454024d, (-16.56612532673d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.8065326256168276E8d + "'", double3 == 2.8065326256168276E8d);
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.1498589009293005E-14d), (-0.004353056259791097d), 0.04402532322633782d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.09887619080864385d + "'", double3 == 0.09887619080864385d);
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-36323.46076404261d), (-1.3635015074426838E-13d), 12774.153009464499d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.843512265520085d) + "'", double3 == (-2.843512265520085d));
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-231527.20964874543d), (-0.09681687808110309d), 6.280766606862781E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0036862874761002186d) + "'", double3 == (-0.0036862874761002186d));
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1752.7497570030052d, (-2247.4992407486698d), 1.9547113936637238E8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0464652790783562E-5d + "'", double3 == 2.0464652790783562E-5d);
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.003641239572747525d), (-1.7298186808088977E11d), (-2.05941647888906E9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-83.99557343262602d) + "'", double3 == (-83.99557343262602d));
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.1921715267680537d), 610.6717742902828d, (-8.836147023196146E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6913238.815667574d + "'", double3 == 6913238.815667574d);
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7.1016758376404E12d), 0.0d, 8.446311121130446E-8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.40802065634769E19d) + "'", double3 == (-8.40802065634769E19d));
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.9187444995090514E8d, (-3.455366112240529d), (-405.875125756359d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1211886.1743243078d) + "'", double3 == (-1211886.1743243078d));
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.5107209676102247E14d), 4.081738306050536d, (-2.9279365079365083d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.575052637940297E13d + "'", double3 == 8.575052637940297E13d);
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-206664.29901807886d), (-0.0024576257582950697d), 75.25443661713334d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2746.207477598755d) + "'", double3 == (-2746.207477598755d));
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9383772.589843672d), (-3.073516221517825E-4d), 51.546592831758396d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-182044.4780931259d) + "'", double3 == (-182044.4780931259d));
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-869780.7489922586d), 5.073684543985856E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7142980440580644E-4d + "'", double3 == 1.7142980440580644E-4d);
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-376654.7752833643d), (-58.13506877150787d), 513.055607033662d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-734.0269457183498d) + "'", double3 == (-734.0269457183498d));
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.302580907015185E-4d), (-0.7371758664955071d), 25818.73660238466d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.8543054594574552E-5d + "'", double3 == 2.8543054594574552E-5d);
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-17369.135765433482d), 0.0d, (-163258.6002237716d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.10639032640011828d + "'", double3 == 0.10639032640011828d);
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(361.68765086156435d, (-1.8464478555125916E-4d), 574.9789906459908d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6290453066815405d + "'", double3 == 0.6290453066815405d);
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-16507.741822661697d), (-107.43934860046176d), (-8.636032248964638d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1899.0552607104316d + "'", double3 == 1899.0552607104316d);
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.804157375656192E-4d), 23614.599727171826d, (-3.354159244129613d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7040.393341168103d + "'", double3 == 7040.393341168103d);
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.748874415939053E12d), (-3.500603119037805E12d), 0.0061962104562358206d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.2132071826937669E14d + "'", double3 == 1.2132071826937669E14d);
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.9279365079365083d), 9.89405908905758E-4d, (-16.806592690791064d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1742724398533367d + "'", double3 == 0.1742724398533367d);
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.41380132472423d), 20826.009523456178d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.07735723043092034d, (-1.2153219925315082d), (-103839.33241119739d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.2448839885097661E-5d) + "'", double3 == (-1.2448839885097661E-5d));
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.03178106204069363d, (-243.73163541018437d), (-167.24598944079588d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.4575142715665292d) + "'", double3 == (-1.4575142715665292d));
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-0.003907855524390268d), (-0.5649782107488386d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.006916825197932293d) + "'", double3 == (-0.006916825197932293d));
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.07234121584390535d, 6.380980562044255E24d, 2.0795850947749175E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.068391179604457E17d) + "'", double3 == (-3.068391179604457E17d));
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.491069855535275E-7d, (-0.07890275625931009d), 23066.570071714337d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.4206648461815055E-6d + "'", double3 == 3.4206648461815055E-6d);
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-262.3990917404834d), (double) (byte) 0, 3.2301198734976446d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-81.23509405746974d) + "'", double3 == (-81.23509405746974d));
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.112407246300548E13d), 7.06120382455683E7d, 24.808215899027566d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.6731437458433125E12d) + "'", double3 == (-3.6731437458433125E12d));
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7.196254388502463E-7d), 105.89631860741352d, 1.6766908551054896E-9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.315792741672492E10d) + "'", double3 == (-6.315792741672492E10d));
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-571486.0460009018d), 9.818018633727817d, (-8.420100860672821E14d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.787280502645539E-10d + "'", double3 == 6.787280502645539E-10d);
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-14536.0398762607d), (-2.4609783275837713E8d), 7.298232900384636d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.371820275912703E7d + "'", double3 == 3.371820275912703E7d);
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-754.8638200168194d), (-1.1107568835548508E-7d), 42.23727158215395d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-17.871983478797624d) + "'", double3 == (-17.871983478797624d));
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(25.541268828888764d, (-0.0021673852483517562d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.8543054594574552E-5d, (-11.789401752698465d), (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-11.78943029575306d) + "'", double3 == (-11.78943029575306d));
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.0660528550971392E8d), 0.09028571428571429d, (-0.004580404729745688d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.510633836749852E10d + "'", double3 == 4.510633836749852E10d);
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 3831.409328119703d, (-0.04799920498346337d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 79822.34975432813d + "'", double3 == 79822.34975432813d);
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-123677.63919007055d), (-143.33881605486968d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.018955374159507227d), (-3.0344075987536987E12d), (-0.025726741920444312d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1794760518596108E14d) + "'", double3 == (-1.1794760518596108E14d));
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.015902138556718E-4d), 0.18860617878447877d, (-6.9483215375300094E-9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.7259499718786065E7d + "'", double3 == 2.7259499718786065E7d);
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.826309491848694E8d), (-336173.24236909073d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(397037.78437912045d, (-0.2144483607698758d), 763.4274479141789d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520.0729943785234d + "'", double3 == 520.0729943785234d);
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5031.801797281026d, 3.794910085761037E21d, 124619.75980701079d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.0451913016346104E16d) + "'", double3 == (-3.0451913016346104E16d));
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.061156423001374d, 2.884655272811615E12d, (-881.0664500596705d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.274049616363431E9d + "'", double3 == 3.274049616363431E9d);
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-17497.927436058242d), 0.004977897761984977d, 3454.554592124432d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.065177564090941d) + "'", double3 == (-5.065177564090941d));
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8595.796240032754d, (-0.11876521258589579d), 6.472826932117897E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.328000129679471E7d + "'", double3 == 1.328000129679471E7d);
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.5258795652904314E-6d, 1753.0335108122406d, 95270.75270671515d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.018400542186151937d) + "'", double3 == (-0.018400542186151937d));
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(36.87079326801912d, (-0.27451240016813794d), (-23.786077945244386d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.5616406266596723d) + "'", double3 == (-1.5616406266596723d));
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-960.4172186271933d), 2534.8928600888426d, 1960.9782688499408d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7824318271338813d) + "'", double3 == (-1.7824318271338813d));
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(58.526619029791355d, (-3.035427543652873E-7d), 5997.88850639995d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.009757870502408344d + "'", double3 == 0.009757870502408344d);
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.193882622027903E-5d), (-2.1783738876319942d), (-0.16449752507649265d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-13.242217156719176d) + "'", double3 == (-13.242217156719176d));
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.018211502704118795d), 1.4325933296457168E-4d, (-693868.8945905869d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.6452781181253965E-8d + "'", double3 == 2.6452781181253965E-8d);
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.400739446753103E7d, (-684.4354801089842d), 3.419279350979025E8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.216443499656794d + "'", double3 == 0.216443499656794d);
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.630524070364386E9d), (-2.5252343010996747E8d), (-0.0038449516805433214d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.785547702324001E11d + "'", double3 == 8.785547702324001E11d);
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) -1, 0.0d, 1.25518602529296E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.966946570860684E-8d) + "'", double3 == (-7.966946570860684E-8d));
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.28931843722377265d, (-3.348226725170131E-14d), (-0.028595986065227025d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-10.117449230947134d) + "'", double3 == (-10.117449230947134d));
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(14.733835328468443d, (-3699342.703851304d), (-11725.329107834981d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-315.50137345097505d) + "'", double3 == (-315.50137345097505d));
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-3.068391179604457E17d), (-1.03446372644643d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.9661660444537146E17d) + "'", double3 == (-2.9661660444537146E17d));
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.2878338723975912E-5d), (-505.71767751715976d), (-2.2981772614886277E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2200516.3531695814d) + "'", double3 == (-2200516.3531695814d));
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(12.166944436037914d, 1.0921455421803116E-5d, 3.3052596519620603E-7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.681082515668621E7d + "'", double3 == 3.681082515668621E7d);
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.0795850947749175E7d, 1.3653987762386734E9d, 0.03772346584992721d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.564367416928418E10d) + "'", double3 == (-3.564367416928418E10d));
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-348.29850002547926d), 0.8308667693731425d, (-1.806555377406182E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1932569.4144849617d + "'", double3 == 1932569.4144849617d);
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.6164313316388285E-6d, (-122.705164142011d), (-2.561724108503911E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-478994.46841722616d) + "'", double3 == (-478994.46841722616d));
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.102685542999733d), (-3.1891763536845264E-5d), 6.713381974561474d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.015290899821457217d) + "'", double3 == (-0.015290899821457217d));
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-86490.36092868313d), 1.8408914168554207E-9d, (-9190.743700139648d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.410594370874557d + "'", double3 == 9.410594370874557d);
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.029274577084296767d), (-0.03430050119057761d), (-1.6239623232758535E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-30.94852654058231d) + "'", double3 == (-30.94852654058231d));
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.5102368527754864E8d, (-1.079928620454693E7d), 3996251.8137153406d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 65.5171354776758d + "'", double3 == 65.5171354776758d);
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5649033.01590334d), 2.633613825676978d, 2.209516150696986E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.5566844794210682E10d) + "'", double3 == (-2.5566844794210682E10d));
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.00887663190746531d, 0.0452656794425087d, (-14.471720308386162d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0025144935612082305d + "'", double3 == 0.0025144935612082305d);
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(208006.7886686511d, 0.0d, (-1310504.6793179906d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.15872266001896418d) + "'", double3 == (-0.15872266001896418d));
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3564794.2149986466d), (-1.27096727177068d), 3.791967647385999E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.400905481060137E11d) + "'", double3 == (-9.400905481060137E11d));
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(226393.45127987943d, (-388.5799277552505d), 18.356021444943778d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12354.639696180051d + "'", double3 == 12354.639696180051d);
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.8242244722222174d, (-1321.0332618716707d), 8.572870432211102d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 154.19076921741848d + "'", double3 == 154.19076921741848d);
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-181059.0816808039d), 17.071702602005715d, (-91.96052516905407d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1969.0639331444404d + "'", double3 == 1969.0639331444404d);
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(961.3970359880889d, 8.205448750155846d, (-719841.5827076532d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0013241685533816258d) + "'", double3 == (-0.0013241685533816258d));
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.23008157613211774d), (double) (-1L), 0.5313323016898746d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4490337241293199d + "'", double3 == 1.4490337241293199d);
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.1751838892208806E21d), 0.1405837852482137d, 0.029268292682926824d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.431878288171344E22d) + "'", double3 == (-7.431878288171344E22d));
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(293422.11915345944d, 4.974668742231324E-6d, (-2.866259404314744E12d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0237109687517456E-7d) + "'", double3 == (-1.0237109687517456E-7d));
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.749024313681146E-16d), (-1.0156879047856051d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.9974572624531557d), 0.1543858692038345d, (-5900332.769841715d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.6469860524743193E-7d + "'", double3 == 3.6469860524743193E-7d);
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.8751410257822588E7d, (-171.92101887315275d), (-3696572.6629174864d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.072694057105845d) + "'", double3 == (-5.072694057105845d));
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-622.7364595859364d), (-376654.7752833643d), 3.895630454685881d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 96526.61955434353d + "'", double3 == 96526.61955434353d);
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(58.596196556130764d, 2176.404460537546d, 10533.596174050528d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.20105272966497684d) + "'", double3 == (-0.20105272966497684d));
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.234912444292453E8d, 4.193886950721749E-4d, (-32.93006978575139d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.2860320284291277E7d) + "'", double3 == (-1.2860320284291277E7d));
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.263231850117096d, 8.205125044751666E7d, 284.04288761832095d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-288869.22278631444d) + "'", double3 == (-288869.22278631444d));
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(568382.180627529d, 1.103081752400706d, 84.232524677725d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6747.762574141187d + "'", double3 == 6747.762574141187d);
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-54.15296692072759d), (-7.403142143295903E-5d), 2.9233794304743282E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1852407.2627999461d) + "'", double3 == (-1852407.2627999461d));
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.335726980586031E-4d, 1.8622382811577772E18d, (-1.1351037224275184E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.6405886478596141E24d + "'", double3 == 1.6405886478596141E24d);
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-762.1512963471386d), (-21.53556252309361d), (-7.138530936545357d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 103.74904030078503d + "'", double3 == 103.74904030078503d);
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-981709.5032598865d), (-0.0014047886765032086d), (-2.866259404314744E12d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.425054621285409E-7d + "'", double3 == 3.425054621285409E-7d);
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8.921611432383611E-10d, (-181443.57180934923d), (-20617.70491827632d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.800376789198863d) + "'", double3 == (-8.800376789198863d));
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.1811031120577702E-6d, (-123.13007499062992d), 14.733835328468443d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.35696031798478d + "'", double3 == 8.35696031798478d);
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.555596366295533d, 2392.665682152357d, 896966.3392134607d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.002665774601846038d) + "'", double3 == (-0.002665774601846038d));
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1594957.0014458017d), (-71.03144986490004d), 1.5669173418433585E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0010178494598315413d) + "'", double3 == (-0.0010178494598315413d));
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2309.7573905377603d, 66.52040403245798d, (-5.425453206243638E10d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.1346536431717345E-8d) + "'", double3 == (-4.1346536431717345E-8d));
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1752.7497570030052d, (-2.9029582280909035E7d), (-2.2720228548511667E9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.012777747798037795d) + "'", double3 == (-0.012777747798037795d));
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.861287326778879E-7d, 1.6401680487393793E10d, (-5.721082216921438E-10d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.8668842476834173E19d + "'", double3 == 2.8668842476834173E19d);
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-16507.741822661697d), 0.04885884127587127d, 0.10715747082037681d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-154051.7012497825d) + "'", double3 == (-154051.7012497825d));
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0038798067161635195d, 130951.78205790132d, (-1.5592487208195512E-8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.398389328757346E12d + "'", double3 == 8.398389328757346E12d);
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.236449517155761E15d, (-7.636204388855077E21d), 1000909.86017476d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.629268058135929E15d + "'", double3 == 7.629268058135929E15d);
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8808183.796906078d, 5103808.778389159d, (-707.0374707723358d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5239.290945174981d) + "'", double3 == (-5239.290945174981d));
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.199820329875534d, 1753.0335108122406d, 21.254180846933384d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-82.18776828251197d) + "'", double3 == (-82.18776828251197d));
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.410594370874557d, 22.628457922462168d, (-435023.874160688d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.0384225640694906E-5d + "'", double3 == 3.0384225640694906E-5d);
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.774234941044589E-11d, 68.14571631970391d, (-39279.50170768363d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.001734892586642867d + "'", double3 == 0.001734892586642867d);
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5530.313772316746d), 100.0d, (-2184632.52202271d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0025772360868745762d + "'", double3 == 0.0025772360868745762d);
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-1235.8660284815899d), 1.530915042136994E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8072727.711633512d + "'", double3 == 8072727.711633512d);
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1070455.1475922465d), (-0.014802498512616825d), 2.8644585131437445E11d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.737024390047538E-6d) + "'", double3 == (-3.737024390047538E-6d));
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(125529.76571116375d, (-32.6991661275839d), (-0.8232356292831313d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-152523.11781820035d) + "'", double3 == (-152523.11781820035d));
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0025772360868745762d, 1.5102365017054655E15d, (-3889.4785786173925d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.882876512055029E11d + "'", double3 == 3.882876512055029E11d);
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.943916529933855d), (-17.665145227465082d), 5.50661712731548E8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.4917709694155615E-8d + "'", double3 == 2.4917709694155615E-8d);
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.8950291631259039d), 5.453522315333847E-7d, (-1244.6388661197923d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.191079539950601E-4d + "'", double3 == 7.191079539950601E-4d);
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.1766349568378705E8d), 1.1047649682380912E-4d, (-22935.91014270929d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9490.074487106713d + "'", double3 == 9490.074487106713d);
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6373.854541228887d, 1.1948118355058969E-5d, 0.14167505396309205d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 44989.25076069658d + "'", double3 == 44989.25076069658d);
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.028571428571428d, (-9520.705174543298d), (-3.5980422167835707E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.6488665701348443E7d) + "'", double3 == (-2.6488665701348443E7d));
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.07403398050306184d), 111.88477646529707d, 0.7652849861370218d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-146.29688609329946d) + "'", double3 == (-146.29688609329946d));
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.227865789907042d), (-1.456360771016233E7d), 0.0024536239201452753d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.935546341361985E9d + "'", double3 == 5.935546341361985E9d);
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0235741479398853E-6d), (-488847.04253259435d), 520.0729943785234d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 939.9585208528911d + "'", double3 == 939.9585208528911d);
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7.822062407465601E-8d), 0.0d, (-1.173415136233868E20d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.666065713598075E-28d + "'", double3 == 6.666065713598075E-28d);
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.075006801426908E-4d), 810.3756614002864d, 5.707014525777801E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1419965.3167879777d) + "'", double3 == (-1419965.3167879777d));
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.397936185605344E-4d, (-762.1512963471386d), (-0.002585093514111664d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-294825.4799991873d) + "'", double3 == (-294825.4799991873d));
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(33.42567140151064d, (-1116.9628242387369d), (-63777.79938695224d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.018037444168630186d) + "'", double3 == (-0.018037444168630186d));
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.4071387060023755d), 0.09044170471181642d, (-0.03430050119057761d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 43.660598496606774d + "'", double3 == 43.660598496606774d);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-379.43816777049864d), (-184023.75077283388d), (-255.6532531526807d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-718.333564468228d) + "'", double3 == (-718.333564468228d));
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.818018633727817d, 1.6451240016813788d, (-5.908392924406798E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-138326.86377856287d) + "'", double3 == (-138326.86377856287d));
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.5491131900267425d), (-0.07317714068437882d), 61379.68352860197d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.663007447281204E-5d) + "'", double3 == (-5.663007447281204E-5d));
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.607592099632522E17d, 344.82566626838366d, (-591.4319859482376d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.4089466947780806E14d) + "'", double3 == (-4.4089466947780806E14d));
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.879866275440819E12d, 1.134801505989066E9d, (-9.638107591704713E12d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.6099466537388016d) + "'", double3 == (-0.6099466537388016d));
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-11118.923148453692d), 455658.72305348073d, 3.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-133365.04177198125d) + "'", double3 == (-133365.04177198125d));
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-230617.41344533928d), (-8.184557677321187d), (-22935.91014270929d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.054505247569887d + "'", double3 == 10.054505247569887d);
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-351.82617972841246d), 0.748316900146477d, (-1.8181301192142022E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.9392148719308493E8d + "'", double3 == 1.9392148719308493E8d);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0356625957491234E13d), (-6.075006801426908E-4d), 1.1576420949252476E8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-89463.10783696918d) + "'", double3 == (-89463.10783696918d));
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-797.9274532942393d), (-0.0011892729552951664d), 1.847317734307343E16d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.3193774909570097E-14d) + "'", double3 == (-4.3193774909570097E-14d));
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.097453561498216E-17d), (-5.078888328588823E-5d), 2853.87309695617d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7796475722773623E-8d + "'", double3 == 1.7796475722773623E-8d);
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.03137934133093799d), 1612.7780985572388d, (-3.0451913016346104E16d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.296250114181132E-14d + "'", double3 == 5.296250114181132E-14d);
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(95.77417289928937d, (-6347.187128421544d), 0.18932071331315758d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 34031.993586795d + "'", double3 == 34031.993586795d);
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.505351936903913E15d, (-3.7931008323228093E-4d), (-1.4515934587419813E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7259322311049595E8d) + "'", double3 == (-1.7259322311049595E8d));
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.9332867206382204E-8d, 18913.653098061826d, (-0.1d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 189136.53098032493d + "'", double3 == 189136.53098032493d);
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.649291939855877E9d), (-0.8451203032622264d), 684586.5526558252d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6791.386598194225d) + "'", double3 == (-6791.386598194225d));
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6137178.729746683d, (-3889.4785786173925d), 597.8273769433109d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10272.310110193612d + "'", double3 == 10272.310110193612d);
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.014001719089893854d), (-6.9483215375300094E-9d), (-8.636032248964638d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0016213130912348043d + "'", double3 == 0.0016213130912348043d);
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-138.83345206457793d), 1.8622382811577772E18d, 7.063798050884929E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.6363130255747932E22d) + "'", double3 == (-2.6363130255747932E22d));
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.037321193336271166d), 1880205.977375785d, 0.748316900146477d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2512579.9167825063d) + "'", double3 == (-2512579.9167825063d));
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5002642543097772d), 1396351.6467253643d, 595.4193621384683d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2345.157439916925d) + "'", double3 == (-2345.157439916925d));
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(207.60497635260663d, 9490.074487106713d, (-69.80731599711538d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 132.97273184285845d + "'", double3 == 132.97273184285845d);
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.2835718987712519d, (double) (-1), 1969.0639331444404d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0011597246083953033d + "'", double3 == 0.0011597246083953033d);
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(16.835853443683273d, (-56.98276689365725d), (-4.3193774909570097E-14d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.709010626922194E15d) + "'", double3 == (-1.709010626922194E15d));
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.5089578676489905d, 0.0d, 112.25635738831615d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.031258433368818804d + "'", double3 == 0.031258433368818804d);
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.8614145173028132d), 3.274049616363431E9d, 68.94559313988626d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.748743856017027E7d) + "'", double3 == (-4.748743856017027E7d));
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0018956268910081783d, 0.049517001548323815d, (-0.048757987726182596d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9766886797041336d + "'", double3 == 0.9766886797041336d);
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.2991569777479117d, 180261.19968012467d, (-0.0020064545047003323d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.984001386568648E7d + "'", double3 == 8.984001386568648E7d);
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(153.05698006005312d, 278.65489571357875d, 4.822969633882911E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.6041614438365924E-6d) + "'", double3 == (-2.6041614438365924E-6d));
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.001133714063698083d, (-390059.53854209953d), (-0.0010178494598315413d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.832192824864005E8d) + "'", double3 == (-3.832192824864005E8d));
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.018400542186151937d), (-155986.9414527414d), (-1.1373637071993737E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.371477936783291E10d) + "'", double3 == (-1.371477936783291E10d));
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.6164313316388285E-6d, 1.1098376324093855E-4d, (-9.862890208560951E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0885990783523606E-12d + "'", double3 == 1.0885990783523606E-12d);
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(99.7762533068953d, 4.54961223296115E-5d, 20.217292653100632d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.935191349444643d + "'", double3 == 4.935191349444643d);
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.988704564023696E7d), 121.31143566535053d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4988716.695167262d) + "'", double3 == (-4988716.695167262d));
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-343.01313818652534d), (-17.871983478797624d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.00868200610855715d), 0.906825088732021d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.821149763585813E13d), (-6.856033957438632d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.003907855524390268d), (-3009.8496426320967d), (-5.8615421012854727E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.1349042329944104E7d) + "'", double3 == (-5.1349042329944104E7d));
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-358086.1434094125d), (-153.6245291694921d), (-26.301275331512393d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 13608.941557727156d + "'", double3 == 13608.941557727156d);
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(59.97350352930122d, (-17.42944799602341d), (-485103.36811160494d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.5955970750447762E-4d) + "'", double3 == (-1.5955970750447762E-4d));
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-222.75294866864752d), (-915.6322250395841d), 2.7966111308613394E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2477567.469873918d + "'", double3 == 2477567.469873918d);
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.04777980054847063d), 0.0031457783087967305d, (-8.714129444159119E-9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5844023.684018328d + "'", double3 == 5844023.684018328d);
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(357578.98927461426d, 99.7762533068953d, (-0.005584544177643519d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.4012245520842314E7d) + "'", double3 == (-6.4012245520842314E7d));
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.21319582721798d, 239.9469715804795d, 8.7963291244323E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-264580.56816772616d) + "'", double3 == (-264580.56816772616d));
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.505351936903913E15d, 7.404186089167122E9d, (-9.235582520769095E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.712708729615889E18d) + "'", double3 == (-2.712708729615889E18d));
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.052888814265645E-4d, (-59221.74249123638d), 0.1526315789473684d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 388004.5224255104d + "'", double3 == 388004.5224255104d);
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(23066.570071714337d, (-3536713.2843062896d), (-1.2781233603923557E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.785161405144203E10d) + "'", double3 == (-2.785161405144203E10d));
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1289.7913696807416d, 239.9469715804795d, 357578.98927461426d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0029359789853144877d + "'", double3 == 0.0029359789853144877d);
    }
}

