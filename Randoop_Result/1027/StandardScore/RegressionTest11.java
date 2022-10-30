package StandardScore;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test05501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05501");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0021673852483517562d), 4.54961223296115E-5d, (-3803250.056869858d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.818395681567696E-10d + "'", double3 == 5.818395681567696E-10d);
    }

    @Test
    public void test05502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05502");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-5.14148882451149E-8d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05503");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.734472336517926E7d), (-3999.7169329765625d), (-1.3004472184888757E11d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.409308031346048E-4d + "'", double3 == 4.409308031346048E-4d);
    }

    @Test
    public void test05504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05504");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-15.4449034606291d), 1.8651823612057754E-18d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05505");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.2854802570931832d, 0.0d, (-4.3193774909570097E-14d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.609291678971352E12d) + "'", double3 == (-6.609291678971352E12d));
    }

    @Test
    public void test05506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05506");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.747550537450502d), 7.803687768431432E10d, 0.009911364466483344d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.873474732662128E12d) + "'", double3 == (-7.873474732662128E12d));
    }

    @Test
    public void test05507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05507");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3144.743169398907d), 182.8987182597795d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05508");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.0014221816018785657d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05509");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.787280502645539E-10d, (-59059.8823397881d), 1.3643737287709883d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 43287.17351732448d + "'", double3 == 43287.17351732448d);
    }

    @Test
    public void test05510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05510");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.3962432147967874d), 12831.76042603731d, (-7.820594347784853d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1640.9439102140668d + "'", double3 == 1640.9439102140668d);
    }

    @Test
    public void test05511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05511");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.054505247569887d, (-117.58846188300636d), (-1.4310986388598355d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-89.19229161748777d) + "'", double3 == (-89.19229161748777d));
    }

    @Test
    public void test05512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05512");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.8622382811577772E18d, (-0.007561380684840925d), (-0.09681687808110309d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.9234645013008867E19d) + "'", double3 == (-1.9234645013008867E19d));
    }

    @Test
    public void test05513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05513");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-438.3209727923364d), 0.0d, 3.679109686196488E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1191377.833710303d) + "'", double3 == (-1191377.833710303d));
    }

    @Test
    public void test05514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05514");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0029268292682926825d, 161.5789184939156d, 0.005159774436090226d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-31314.545561235835d) + "'", double3 == (-31314.545561235835d));
    }

    @Test
    public void test05515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05515");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2959.7992059068197d), 0.0d, (-1.944207613631405E-11d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.5223678711855703E14d + "'", double3 == 1.5223678711855703E14d);
    }

    @Test
    public void test05516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05516");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.269675543538313d), 6.159241134737547E-8d, 2.1530201039826427E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2912037.650523151d) + "'", double3 == (-2912037.650523151d));
    }

    @Test
    public void test05517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05517");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-754.8638200168194d), (-6.4613331773058675d), (-5.860187268264517E10d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.2770965373281518E-8d + "'", double3 == 1.2770965373281518E-8d);
    }

    @Test
    public void test05518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05518");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(206735.92869969647d, (-4.897944878870512E-11d), 1.8554668589611745d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 111419.89828664596d + "'", double3 == 111419.89828664596d);
    }

    @Test
    public void test05519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05519");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.9104782871812895E19d), (-105386.50348406781d), (-28.591764407761374d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0179428753236422E18d + "'", double3 == 1.0179428753236422E18d);
    }

    @Test
    public void test05520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05520");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.484038060203528E14d, 1272930.7527273733d, (-0.2078226836897365d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.601165144536061E15d) + "'", double3 == (-3.601165144536061E15d));
    }

    @Test
    public void test05521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05521");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-89463.10783696918d), (-1.260997845776212E18d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.094628126180487E-14d) + "'", double3 == (-7.094628126180487E-14d));
    }

    @Test
    public void test05522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05522");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-139.65131017440473d), (-485103.36811160494d), 9.720037522782348E12d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.9893193896088E-8d + "'", double3 == 4.9893193896088E-8d);
    }

    @Test
    public void test05523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05523");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(33.42567140151064d, 5.76693132243629E15d, (-7.9419435525582E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7261360.250512805d + "'", double3 == 7261360.250512805d);
    }

    @Test
    public void test05524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05524");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(180261.19968012467d, (-3.835693318632824E7d), 0.009757870502408344d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.949344723984294E9d + "'", double3 == 3.949344723984294E9d);
    }

    @Test
    public void test05525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05525");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-58.13506877150787d), (-101.91349446313082d), (-3.3497925857524113d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-13.068995936591605d) + "'", double3 == (-13.068995936591605d));
    }

    @Test
    public void test05526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05526");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2126093.3056549923d), 0.08157580697563747d, 48836.06304766844d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-43.53531498138044d) + "'", double3 == (-43.53531498138044d));
    }

    @Test
    public void test05527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05527");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(875190.3914565492d, 1.1822786312871085E7d, 1.3108979819896279E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.8351218837638851d) + "'", double3 == (-0.8351218837638851d));
    }

    @Test
    public void test05528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05528");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(32176.917179642904d, 0.02430282824257907d, 0.2461619028910137d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 130714.34896674786d + "'", double3 == 130714.34896674786d);
    }

    @Test
    public void test05529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05529");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(22962.352280770876d, 0.0d, (-709.9891821169025d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-32.34183401542312d) + "'", double3 == (-32.34183401542312d));
    }

    @Test
    public void test05530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05530");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8341.733699559149d, 0.5641384869485567d, 9.495584411800701d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 878.4261399125846d + "'", double3 == 878.4261399125846d);
    }

    @Test
    public void test05531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05531");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.8668842476834173E19d, (-4.027936507936508d), 0.02d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4334421238417085E21d + "'", double3 == 1.4334421238417085E21d);
    }

    @Test
    public void test05532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05532");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.386932040045512E13d, (double) (byte) 100, 30594.960601322553d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.533204203490812E8d + "'", double3 == 4.533204203490812E8d);
    }

    @Test
    public void test05533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05533");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8933.264492222574d, 10272.310110193612d, 1.266860273815535E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.056979720374446E-4d) + "'", double3 == (-1.056979720374446E-4d));
    }

    @Test
    public void test05534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05534");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.7366386221523023E8d), 0.008199435590142542d, (-5.860187268264517E10d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.002963452433745515d + "'", double3 == 0.002963452433745515d);
    }

    @Test
    public void test05535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05535");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(216.13200675611134d, 0.008908682521772645d, 9.452903627643943d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 22.86314412870582d + "'", double3 == 22.86314412870582d);
    }

    @Test
    public void test05536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05536");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.193691698197172E7d), (-262953.66852689005d), (-7.660845117908977d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6745204.023593314d + "'", double3 == 6745204.023593314d);
    }

    @Test
    public void test05537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05537");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.11275911419512387d, (-57163.61954716919d), 928.9670256818828d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 61.53472698810155d + "'", double3 == 61.53472698810155d);
    }

    @Test
    public void test05538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05538");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.029266685342399384d, 2.135416666666667d, (-3418404.844999153d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.161206986367904E-7d + "'", double3 == 6.161206986367904E-7d);
    }

    @Test
    public void test05539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05539");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.3183639896594069E10d), (-0.12946784043962023d), 3.227855215051301E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.084334339096145E14d) + "'", double3 == (-4.084334339096145E14d));
    }

    @Test
    public void test05540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05540");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.857195500183787E16d), (-8586.388369914019d), (-5.143640726595629d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7219700929705392E16d + "'", double3 == 1.7219700929705392E16d);
    }

    @Test
    public void test05541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05541");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-451.01397919511584d), (-1.944207613631405E-11d), (-364.21568279392756d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.238315647847265d + "'", double3 == 1.238315647847265d);
    }

    @Test
    public void test05542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05542");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-73.79034869489334d), 3.014452771442996E9d, (-11118.923148453692d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 271110.14304047637d + "'", double3 == 271110.14304047637d);
    }

    @Test
    public void test05543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05543");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1543858692038345d, (-0.9651393133256551d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05544");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-36.47398433482066d), (-1.7148807716383915E7d), (-181648.79668820262d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-94.40619236159975d) + "'", double3 == (-94.40619236159975d));
    }

    @Test
    public void test05545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05545");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.3540648150012898E-4d), (-13.64938407658132d), (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 13.64914867009982d + "'", double3 == 13.64914867009982d);
    }

    @Test
    public void test05546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05546");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.003641239572747525d), (-9.223725091318671E7d), (-0.03373477679865521d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.734188859765107E9d) + "'", double3 == (-2.734188859765107E9d));
    }

    @Test
    public void test05547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05547");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3387673.5251900572d, (-8.447514277748364E9d), (-8.707111627607059E-10d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.705746650219624E18d) + "'", double3 == (-9.705746650219624E18d));
    }

    @Test
    public void test05548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05548");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.255617856184481E-4d), 22.78194810941361d, (-1.798677345107274E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.266623707313135E-6d + "'", double3 == 1.266623707313135E-6d);
    }

    @Test
    public void test05549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05549");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.4334421238417085E21d, (-1.7276983677308643E10d), 0.03790395662113255d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.781774388850477E22d + "'", double3 == 3.781774388850477E22d);
    }

    @Test
    public void test05550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05550");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-16.56612532673d), (-1.9006350650934987E7d), 0.0011294597975129053d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.6827809300217693E10d + "'", double3 == 1.6827809300217693E10d);
    }

    @Test
    public void test05551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05551");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.005159774436090226d, (-0.15847193644261548d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03255954683155298d + "'", double3 == 0.03255954683155298d);
    }

    @Test
    public void test05552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05552");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9383772.589843672d), (-0.0011892729552951664d), (-4804.102665491978d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1953.283108635112d + "'", double3 == 1953.283108635112d);
    }

    @Test
    public void test05553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05553");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-191691.53456346106d), 0.04867379286088883d, (-2617.688322231722d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 73.22933811838469d + "'", double3 == 73.22933811838469d);
    }

    @Test
    public void test05554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05554");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.9399350804124315d, (-8974.44264311559d), 213.07831205463037d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 42.12245953917092d + "'", double3 == 42.12245953917092d);
    }

    @Test
    public void test05555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05555");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.663007447281204E-5d), 1.852170470976744E12d, 581567.3571926672d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3184790.975747869d) + "'", double3 == (-3184790.975747869d));
    }

    @Test
    public void test05556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05556");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.177732502032082E18d), (-6.760935099832825E24d), (-628379.2650683811d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0759320521762585E19d) + "'", double3 == (-1.0759320521762585E19d));
    }

    @Test
    public void test05557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05557");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.7383031637295921d, (-1.0713645846301472E8d), (-1348326.0225686154d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-79.45886781686421d) + "'", double3 == (-79.45886781686421d));
    }

    @Test
    public void test05558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05558");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(28093.678889144416d, (-0.13691756025022556d), (-595966.1814338439d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.04713994968491892d) + "'", double3 == (-0.04713994968491892d));
    }

    @Test
    public void test05559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05559");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(75.83951627653596d, 9.24262767218969E-4d, 179.4136678795534d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.42270242234098804d + "'", double3 == 0.42270242234098804d);
    }

    @Test
    public void test05560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05560");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 6.413857741260789d, (-5.1574189064484197E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.2436177587283863E-8d + "'", double3 == 1.2436177587283863E-8d);
    }

    @Test
    public void test05561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05561");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.177899757574306E-6d), 296481.15346739156d, 56.677636926438495d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5231.007669821702d) + "'", double3 == (-5231.007669821702d));
    }

    @Test
    public void test05562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05562");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.4704140920127693d, 0.0d, 1.9885826207511344E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1745169.678040288d + "'", double3 == 1745169.678040288d);
    }

    @Test
    public void test05563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05563");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.9632194354821538d), 1.2826877801770398E7d, (-0.006009838541141801d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.1343133725108151E9d + "'", double3 == 2.1343133725108151E9d);
    }

    @Test
    public void test05564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05564");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.4817151066253044d), (-28666.819259111744d), 1.0452228585139721E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.7426053028309196E8d + "'", double3 == 2.7426053028309196E8d);
    }

    @Test
    public void test05565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05565");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10272.310110193612d, 1.2806492145618883E8d, (-44.316030867481174d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2889578.4807308707d + "'", double3 == 2889578.4807308707d);
    }

    @Test
    public void test05566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05566");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-449.17588062325603d), 0.0024455898857149343d, (-6.59109975575252E19d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.814922286999404E-18d + "'", double3 == 6.814922286999404E-18d);
    }

    @Test
    public void test05567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05567");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.093904382563665E10d, (double) (byte) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05568");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.005892945827514705d, 265922.8856994398d, (-1.9462754239039993E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3663167943264885E10d + "'", double3 == 1.3663167943264885E10d);
    }

    @Test
    public void test05569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05569");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.8380339339513037E12d), 559.8204717945758d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05570");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(601.4355178034649d, 1.9145084333160613E-5d, (-449.17588062325603d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.3389754984703452d) + "'", double3 == (-1.3389754984703452d));
    }

    @Test
    public void test05571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05571");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(37.018327125636084d, 3.753743136477039d, 0.7394755380732579d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 44.984022156881146d + "'", double3 == 44.984022156881146d);
    }

    @Test
    public void test05572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05572");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.245810793865246E9d, (-304.4349314474631d), (-0.001962612855972256d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.14429653890534E12d) + "'", double3 == (-1.14429653890534E12d));
    }

    @Test
    public void test05573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05573");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-225625.447794812d), 0.0128900382868361d, 2115.7793041403506d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-106.63941189108228d) + "'", double3 == (-106.63941189108228d));
    }

    @Test
    public void test05574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05574");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.13691756025022556d), (-224.57802254885536d), (-28.167158577118418d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.96818409546392d) + "'", double3 == (-7.96818409546392d));
    }

    @Test
    public void test05575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05575");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(15.415482455592363d, 612800.9223859196d, 56.677636926438495d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-10811.768805724803d) + "'", double3 == (-10811.768805724803d));
    }

    @Test
    public void test05576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05576");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8.759484919909787E-8d, (-0.2490862636873679d), (-0.03485350665241561d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.146665435024557d) + "'", double3 == (-7.146665435024557d));
    }

    @Test
    public void test05577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05577");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2757.3398259329165d), (-1.8669584192656033E10d), 8.214772259981027E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.27268399469413E15d + "'", double3 == 2.27268399469413E15d);
    }

    @Test
    public void test05578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05578");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-473.5693178919131d), (-1.1351037224275184E-6d), (-1.8299954929394666d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 258.78168475493305d + "'", double3 == 258.78168475493305d);
    }

    @Test
    public void test05579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05579");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1852407.2627999461d), (-1.2939290419913938E9d), (-881.0664500596705d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1466491.6983742686d) + "'", double3 == (-1466491.6983742686d));
    }

    @Test
    public void test05580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05580");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.8958392900636985E9d, 5.347321778220386E10d, (-1.9901506523656652E15d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.5916318662022307E-5d + "'", double3 == 2.5916318662022307E-5d);
    }

    @Test
    public void test05581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05581");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.11275911419512387d, (-60.79587815134084d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.001854716431834894d + "'", double3 == 0.001854716431834894d);
    }

    @Test
    public void test05582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05582");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.03580972901448908d, (-2.933398471805696E14d), 4.5390130493901927E-7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.462635026351804E20d + "'", double3 == 6.462635026351804E20d);
    }

    @Test
    public void test05583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05583");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(160437.86570407302d, 205.82319894001037d, (-16.413930126719503d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9761.954709694932d) + "'", double3 == (-9761.954709694932d));
    }

    @Test
    public void test05584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05584");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 1.7386449533570588E7d, (-30646.178926921853d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 567.3284612424244d + "'", double3 == 567.3284612424244d);
    }

    @Test
    public void test05585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05585");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1324884425673403E-8d), (-6.477614051195991E-7d), (-869780.7489922586d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.317206335404765E-13d) + "'", double3 == (-7.317206335404765E-13d));
    }

    @Test
    public void test05586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05586");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8460227.708496958d, 2.4420147012832565E9d, 237.57617814554723d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0243259625482658E7d) + "'", double3 == (-1.0243259625482658E7d));
    }

    @Test
    public void test05587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05587");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0016628171716879063d, 0.0d, 205.82319894001037d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.07886176218918E-6d + "'", double3 == 8.07886176218918E-6d);
    }

    @Test
    public void test05588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05588");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.7652849861370218d, (-66059.36190402122d), 278.65489571357875d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 237.0678864975286d + "'", double3 == 237.0678864975286d);
    }

    @Test
    public void test05589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05589");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.199820329875534d, 246711.10293941203d, (-4.815692192293446E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0051229375397764025d + "'", double3 == 0.0051229375397764025d);
    }

    @Test
    public void test05590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05590");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0025461456390488846d), 1.6556560725381615E7d, (-1.7667554787661454E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.371167049947635E10d + "'", double3 == 9.371167049947635E10d);
    }

    @Test
    public void test05591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05591");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.9879336775909635d), 0.0d, 1.134801505989066E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.705783984044894E-10d) + "'", double3 == (-8.705783984044894E-10d));
    }

    @Test
    public void test05592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05592");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.34888951651302d), 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05593");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1373637071993737E-5d), Double.NEGATIVE_INFINITY, (-1.0444639591918834E9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05594");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4884.154123260727d, 240.70698897028777d, 247.08631442271144d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 18.792813940906907d + "'", double3 == 18.792813940906907d);
    }

    @Test
    public void test05595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05595");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.003892003156145203d), (-2.4583528408548694E7d), (-9.404571800819559E10d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.6139976306538876E-4d) + "'", double3 == (-2.6139976306538876E-4d));
    }

    @Test
    public void test05596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05596");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.00465340551583337d, 0.55988381336898d, 16224.703271745246d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.422129813739404E-5d) + "'", double3 == (-3.422129813739404E-5d));
    }

    @Test
    public void test05597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05597");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-1.163067249003105E8d), 42.12245953917092d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2761157.0210460634d + "'", double3 == 2761157.0210460634d);
    }

    @Test
    public void test05598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05598");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2454.716377507236d), 1.7259598813067158E-6d, (-9.129567400301896d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 268.875432055195d + "'", double3 == 268.875432055195d);
    }

    @Test
    public void test05599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05599");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.453426257781344d, 0.3454446730258682d, (-40.22963705964476d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.07725601849570653d) + "'", double3 == (-0.07725601849570653d));
    }

    @Test
    public void test05600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05600");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.8863052387844411d, (-8.619442805864316E-13d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0282627992860923E12d + "'", double3 == 1.0282627992860923E12d);
    }

    @Test
    public void test05601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05601");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.5252343010996747E8d), (-2.402402592049422E7d), 2.99710411982308E-7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.624006209132355E14d) + "'", double3 == (-7.624006209132355E14d));
    }

    @Test
    public void test05602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05602");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1744926.1268026067d, (-0.020706915767274642d), 9.768898159572461E-9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.786205689737572E14d + "'", double3 == 1.786205689737572E14d);
    }

    @Test
    public void test05603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05603");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.04402532322633782d, 9.689171520250453E7d, (-23.117908130910667d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4191197.3440592797d + "'", double3 == 4191197.3440592797d);
    }

    @Test
    public void test05604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05604");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.360483774095394E-8d), 8.984001386568648E7d, 8.446311121130446E-8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0636597749866271E15d) + "'", double3 == (-1.0636597749866271E15d));
    }

    @Test
    public void test05605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05605");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.8380339339513037E12d), 1.1194823990936614E-5d, (-458.3069192947042d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.192430911404959E9d + "'", double3 == 6.192430911404959E9d);
    }

    @Test
    public void test05606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05606");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.223725091318671E7d), (-2.402402592049422E7d), (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1948949.2855055d) + "'", double3 == (-1948949.2855055d));
    }

    @Test
    public void test05607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05607");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.7377838126977587d, 3.662129817789373E18d, 6353590.515641501d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.763874471881384E11d) + "'", double3 == (-5.763874471881384E11d));
    }

    @Test
    public void test05608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05608");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.6882681256905212d, (-16016.834438307134d), (-4.2291339329899883E9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.7876603011973575E-6d) + "'", double3 == (-3.7876603011973575E-6d));
    }

    @Test
    public void test05609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05609");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.027966587474714467d, (-388.5799277552505d), (-31034.769381471466d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.012521694283145982d) + "'", double3 == (-0.012521694283145982d));
    }

    @Test
    public void test05610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05610");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(12361.723051847785d, (-2184632.52202271d), (-1449.5659560169545d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1515.6221322356039d) + "'", double3 == (-1515.6221322356039d));
    }

    @Test
    public void test05611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05611");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.616540227787099E11d, (-1.7810239775770843E-11d), 1.368534428228002d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.9119286835735895E11d + "'", double3 == 1.9119286835735895E11d);
    }

    @Test
    public void test05612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05612");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.157377406676948E8d, (-5.3599192135298215E-27d), (-166.57266975190436d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4296849.78774564d) + "'", double3 == (-4296849.78774564d));
    }

    @Test
    public void test05613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05613");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2454.716377507236d), (-3.3207142084400188E16d), 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.320714208439773E15d + "'", double3 == 3.320714208439773E15d);
    }

    @Test
    public void test05614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05614");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.0d, 1.616536760749328d, 2.27268399469413E15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.6872703822701078E-16d + "'", double3 == 1.6872703822701078E-16d);
    }

    @Test
    public void test05615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05615");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(23614.599727171826d, (-163258.6002237716d), 279724.6031996584d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.66806136397505d + "'", double3 == 0.66806136397505d);
    }

    @Test
    public void test05616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05616");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1932569.4144849617d, (-169.9868828143154d), (-0.20980700448575385d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9211987.016853917d) + "'", double3 == (-9211987.016853917d));
    }

    @Test
    public void test05617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05617");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.820528374206212d, (-1.040317362515685E7d), 4.631424270884752E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.246215599612488E10d + "'", double3 == 2.246215599612488E10d);
    }

    @Test
    public void test05618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05618");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2115.7793041403506d, 0.003619777294683477d, (-0.13774983309039368d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-15359.551709762505d) + "'", double3 == (-15359.551709762505d));
    }

    @Test
    public void test05619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05619");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.043560517815724E-4d, (-71.03144986490004d), (-4.445875784605726E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-159770.44268062283d) + "'", double3 == (-159770.44268062283d));
    }

    @Test
    public void test05620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05620");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-63102.099794689515d), 2.2481935371610478d, (-5.108854893339596E-9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.2351955439269902E13d + "'", double3 == 1.2351955439269902E13d);
    }

    @Test
    public void test05621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05621");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.646068000041423E11d), (-6.249630383537853d), (-9.638107591704713E12d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03782970842862358d + "'", double3 == 0.03782970842862358d);
    }

    @Test
    public void test05622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05622");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0049756812518887E19d), (-0.08101442761435378d), (-960.4172186271933d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0463949018827324E16d + "'", double3 == 1.0463949018827324E16d);
    }

    @Test
    public void test05623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05623");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.616425058066798d, 1.810544381455807E12d, (-35.03485350665242d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.167837739379742E10d + "'", double3 == 5.167837739379742E10d);
    }

    @Test
    public void test05624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05624");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.1798937248307912E-8d, (-0.23972449102197715d), 8083534.713821519d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.9655901942379832E-8d + "'", double3 == 2.9655901942379832E-8d);
    }

    @Test
    public void test05625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05625");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8.205448750155846d, (-7.138530936545357d), (-2746.207477598755d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.005587334464662431d) + "'", double3 == (-0.005587334464662431d));
    }

    @Test
    public void test05626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05626");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (-1L), 8.504480599076084d, 1.8790812182038447E8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.058046723579687E-8d) + "'", double3 == (-5.058046723579687E-8d));
    }

    @Test
    public void test05627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05627");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.238775313583944E8d), (-3714441.8990268465d), 5.495024606954893E-9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.466073888022488E16d) + "'", double3 == (-9.466073888022488E16d));
    }

    @Test
    public void test05628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05628");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5279258.98006403d), (-2746.207477598755d), 2.1700963351251683E8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.02431464763651651d) + "'", double3 == (-0.02431464763651651d));
    }

    @Test
    public void test05629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05629");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.1751838892208806E21d), 1835819.0847507995d, (-0.0031500412764029324d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.905255196226347E23d + "'", double3 == 6.905255196226347E23d);
    }

    @Test
    public void test05630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05630");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.5368910290116979E7d, 2.885026490603624d, (-5592.441403851674d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2748.1570740295074d) + "'", double3 == (-2748.1570740295074d));
    }

    @Test
    public void test05631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05631");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-469559.93234637764d), (-2.402402592049422E7d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05632");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0619456317945829E15d), 7035680.301041362d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05633");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(15.689240286163635d, 1.6507423041392261E-4d, (-0.8912424748253267d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-17.60359908229026d) + "'", double3 == (-17.60359908229026d));
    }

    @Test
    public void test05634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05634");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.614208552109683E11d, (double) 10.0f, (-2.3462883598823992E13d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.03245214306220793d) + "'", double3 == (-0.03245214306220793d));
    }

    @Test
    public void test05635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05635");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.44183650262893953d, 4.081738306050536d, (-5.439520370575405d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6691585940391577d + "'", double3 == 0.6691585940391577d);
    }

    @Test
    public void test05636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05636");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7.820859067894202E10d), 0.0d, 5.4061278290473E11d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.1446665583057891d) + "'", double3 == (-0.1446665583057891d));
    }

    @Test
    public void test05637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05637");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-41232.77548435679d), 838389.069754146d, (-2.8851258601270187E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.003048816196877377d + "'", double3 == 0.003048816196877377d);
    }

    @Test
    public void test05638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05638");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(111.88477646529707d, 1.4968582569709502E-5d, 0.02241010778895672d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4992.602559093856d + "'", double3 == 4992.602559093856d);
    }

    @Test
    public void test05639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05639");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.607721573961723E-4d), (-8.617483931146957E-4d), 0.13935478660469144d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.002877376841428311d + "'", double3 == 0.002877376841428311d);
    }

    @Test
    public void test05640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05640");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.818921841830124E10d, (-7116507.983360336d), (-5108603.444546262d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-15306.792898510032d) + "'", double3 == (-15306.792898510032d));
    }

    @Test
    public void test05641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05641");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.1214552933540486E-6d), (-103914.47138185291d), (-1.7366386221523023E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.98365543954937E-4d) + "'", double3 == (-5.98365543954937E-4d));
    }

    @Test
    public void test05642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05642");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(32.98195719587933d, (-9415.565925956449d), 0.0015003039240391093d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6297755.895828763d + "'", double3 == 6297755.895828763d);
    }

    @Test
    public void test05643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05643");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.614607268933817E8d, 1.3108979819896279E7d, (-717.351836035973d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-903812.7659311835d) + "'", double3 == (-903812.7659311835d));
    }

    @Test
    public void test05644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05644");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.013347200192383994d), (-3.2225975961041584d), (-449.17588062325603d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.007144752277123082d) + "'", double3 == (-0.007144752277123082d));
    }

    @Test
    public void test05645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05645");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.3642492621684885E-4d, (-7.995208882626328E12d), 0.018949957128151004d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.219117134966543E14d + "'", double3 == 4.219117134966543E14d);
    }

    @Test
    public void test05646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05646");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.5102365017054655E15d, (-3918775.245102388d), (-1.8679814789371052E9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-808485.802805484d) + "'", double3 == (-808485.802805484d));
    }

    @Test
    public void test05647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05647");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(15.689240286163635d, (-27.21311475409836d), (-0.06381003452916503d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-672.34495885836d) + "'", double3 == (-672.34495885836d));
    }

    @Test
    public void test05648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05648");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-139.36240834642797d), 0.10173053617986132d, 43287.17351732448d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0032218351892805202d) + "'", double3 == (-0.0032218351892805202d));
    }

    @Test
    public void test05649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05649");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.206390887176429E9d), (-5.743955639945776E9d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05650");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.0354567952486486d), (-1.7882610708918953E10d), (-69.80731599711538d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.5617101088118687E8d) + "'", double3 == (-2.5617101088118687E8d));
    }

    @Test
    public void test05651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05651");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-16016.834438307134d), 3.681082515668621E7d, 0.005159774436090226d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.137296881339978E9d) + "'", double3 == (-7.137296881339978E9d));
    }

    @Test
    public void test05652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05652");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(89.91771687002392d, (-313.6447737843823d), 36600.51340848494d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.011026142889046197d + "'", double3 == 0.011026142889046197d);
    }

    @Test
    public void test05653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05653");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.2891185707679995E-5d), (-0.005834529813510712d), (-0.0038632266354697077d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.5017598435815411d) + "'", double3 == (-1.5017598435815411d));
    }

    @Test
    public void test05654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05654");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.11646372775307832d, (-4.737471591409432E8d), (-3.5739557866807203E-12d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.3255540570002278E20d) + "'", double3 == (-1.3255540570002278E20d));
    }

    @Test
    public void test05655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05655");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.4834690530033927E7d, (-0.8932635507964994d), 17994.383089265015d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1380.1357512563582d + "'", double3 == 1380.1357512563582d);
    }

    @Test
    public void test05656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05656");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.554810999759364E11d), (-3.283013421848922d), (-4637.148358735402d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.665941921030034E7d + "'", double3 == 7.665941921030034E7d);
    }

    @Test
    public void test05657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05657");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1225.8551105601869d, (-1449.5659560169545d), (-251.31518130770863d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-10.645680267525796d) + "'", double3 == (-10.645680267525796d));
    }

    @Test
    public void test05658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05658");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.5669173418433585E9d, (-17558.157988926538d), 130951.78205790132d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11965.739414745158d + "'", double3 == 11965.739414745158d);
    }

    @Test
    public void test05659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05659");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(92249.58419921181d, 0.025957647204972262d, 1.8958392900636985E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.8658954756900887E-5d + "'", double3 == 4.8658954756900887E-5d);
    }

    @Test
    public void test05660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05660");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-335661.9987573057d), 2.2481935371610478d, (-0.0019585162882003212d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7138700810054758E8d + "'", double3 == 1.7138700810054758E8d);
    }

    @Test
    public void test05661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05661");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.7613584666792286d, 3454.554592124432d, (-75.3118672732359d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 45.84660238380248d + "'", double3 == 45.84660238380248d);
    }

    @Test
    public void test05662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05662");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5166505.993491054d, 2.025960109840764d, 0.3454446730258682d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4956096796270633E7d + "'", double3 == 1.4956096796270633E7d);
    }

    @Test
    public void test05663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05663");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.9293490277180415E7d, (-23.81572573286746d), (-3.5187680549348456E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.08324934646324267d) + "'", double3 == (-0.08324934646324267d));
    }

    @Test
    public void test05664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05664");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.219117134966543E14d, (-1.0619456317945829E15d), (-478994.46841722616d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.097859042494682E9d) + "'", double3 == (-3.097859042494682E9d));
    }

    @Test
    public void test05665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05665");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.482163476614191E17d, (-0.0d), (-1.6055529971127499E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.5459866358057573E10d) + "'", double3 == (-1.5459866358057573E10d));
    }

    @Test
    public void test05666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05666");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.8688391651617798E-8d, (-4.834446838468178E12d), 8072727.711633512d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 598861.625358838d + "'", double3 == 598861.625358838d);
    }

    @Test
    public void test05667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05667");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0013105542937609889d), (-3999.7169329765625d), (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.997156224222685d + "'", double3 == 39.997156224222685d);
    }

    @Test
    public void test05668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05668");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.265812656678443E8d), 7.105182184397304E-11d, 72.75319495886552d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4488892.423933994d) + "'", double3 == (-4488892.423933994d));
    }

    @Test
    public void test05669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05669");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.08632058739905799d, (-981709.5032598865d), (-979.540951465922d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1002.2139330788636d) + "'", double3 == (-1002.2139330788636d));
    }

    @Test
    public void test05670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05670");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-8.215608526483656d), (-94.57434905081192d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.08686931085372483d) + "'", double3 == (-0.08686931085372483d));
    }

    @Test
    public void test05671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05671");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8.250824899755272E-11d, 7.04656786324976E13d, 9.466557425978435d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.443643498017916E12d) + "'", double3 == (-7.443643498017916E12d));
    }

    @Test
    public void test05672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05672");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(15216.37191700468d, (-9.128965281837063d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05673");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.059007558641918464d, 2.918618922846063E16d, (-6.796424038651575E13d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 429.43449470600183d + "'", double3 == 429.43449470600183d);
    }

    @Test
    public void test05674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05674");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 1.769321799055415E14d, (-0.6527390014518221d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.710611431399211E14d + "'", double3 == 2.710611431399211E14d);
    }

    @Test
    public void test05675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05675");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.328901520848997E-8d, (-6.243005484975481E7d), 121.41567905453722d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 514184.45571360446d + "'", double3 == 514184.45571360446d);
    }

    @Test
    public void test05676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05676");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 4.058849729328089E14d, (-3.2225975961041584d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.259496293994288E14d + "'", double3 == 1.259496293994288E14d);
    }

    @Test
    public void test05677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05677");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6253390.42296602d), (-3.389262307990661E13d), 6.621154735348211E12d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.118837752812879d + "'", double3 == 5.118837752812879d);
    }

    @Test
    public void test05678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05678");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.011227054510797075d, (-8.40802065634769E19d), 397037.78437912045d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.1176877836692497E14d + "'", double3 == 2.1176877836692497E14d);
    }

    @Test
    public void test05679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05679");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.28125d, (-5.806748001360767E-5d), 7.077381450896908E-7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 397474.78559936007d + "'", double3 == 397474.78559936007d);
    }

    @Test
    public void test05680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05680");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.349624390585186E11d, 1.0615633650310281E15d, 4.699734714883293E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.2574218907126449E18d) + "'", double3 == (-2.2574218907126449E18d));
    }

    @Test
    public void test05681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05681");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.0543108361222895d, (-2.9131967183099814d), (-5903.977992713849d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.720058169811282E-4d) + "'", double3 == (-6.720058169811282E-4d));
    }

    @Test
    public void test05682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05682");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.01737925304935617d, 42.24317664692993d, 12.229950811309424d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.452654719987348d) + "'", double3 == (-3.452654719987348d));
    }

    @Test
    public void test05683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05683");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(336.3165885238276d, (-0.04430495926188295d), 4.968566132947576E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6769777.929544133d + "'", double3 == 6769777.929544133d);
    }

    @Test
    public void test05684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05684");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.779126012999823E8d, 113.97243455562777d, 0.7792320293230807d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.566492095672331E8d + "'", double3 == 3.566492095672331E8d);
    }

    @Test
    public void test05685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05685");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11.237877349479714d, (-543.0193960250996d), (-17653.92316509668d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.03139569987878918d) + "'", double3 == (-0.03139569987878918d));
    }

    @Test
    public void test05686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05686");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.177308738904288E-8d, (-790.4893398004218d), (-47798.408772969386d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.01653798442489631d) + "'", double3 == (-0.01653798442489631d));
    }

    @Test
    public void test05687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05687");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.9744701149674156E-11d, (-0.0354057321163793d), 75.83951627653596d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.6685071166623727E-4d + "'", double3 == 4.6685071166623727E-4d);
    }

    @Test
    public void test05688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05688");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.855029244997723E7d), (-9761.954709694932d), (-232260.55752452716d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 79.82642723704657d + "'", double3 == 79.82642723704657d);
    }

    @Test
    public void test05689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05689");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.609440237103271E-5d), 1745.6691307397193d, (-23.786077945244386d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 73.39037527971853d + "'", double3 == 73.39037527971853d);
    }

    @Test
    public void test05690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05690");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 9.9642872949936E-13d, (-9802.747628359715d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.016479019225849E-16d + "'", double3 == 1.016479019225849E-16d);
    }

    @Test
    public void test05691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05691");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.0282627992860923E12d, 0.43942386224590174d, 0.4822630255857173d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.1321617970542292E12d + "'", double3 == 2.1321617970542292E12d);
    }

    @Test
    public void test05692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05692");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.1098376324093855E-4d, 0.0016628171716879063d, (-49.24902537903796d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.1509931343889704E-5d + "'", double3 == 3.1509931343889704E-5d);
    }

    @Test
    public void test05693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05693");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.9173193882873576E7d), (-1.5042801290107587E7d), (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-42581.36693573184d) + "'", double3 == (-42581.36693573184d));
    }

    @Test
    public void test05694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05694");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.724977972557113E-4d), 0.7293713475550118d, 170932.7234551573d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.269772519851856E-6d) + "'", double3 == (-4.269772519851856E-6d));
    }

    @Test
    public void test05695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05695");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11159.803383559913d, (-4.218586422755532E-5d), (-127.9691388195903d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-87.20699012813365d) + "'", double3 == (-87.20699012813365d));
    }

    @Test
    public void test05696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05696");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-43.53531498138044d), (-1.4310986388598355d), (-1.6239623232758535E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 259268.43091770788d + "'", double3 == 259268.43091770788d);
    }

    @Test
    public void test05697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05697");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(240215.61399250352d, (-918.453064571191d), 1274.9471257860532d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 189.13260179978556d + "'", double3 == 189.13260179978556d);
    }

    @Test
    public void test05698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05698");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6378457.687275752d, 0.0d, (-0.0013586595187355624d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.694669708870011E9d) + "'", double3 == (-4.694669708870011E9d));
    }

    @Test
    public void test05699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05699");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-549292.2722069464d), 76.98393703032065d, (-1.6975888778528993E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.236173748020874E10d + "'", double3 == 3.236173748020874E10d);
    }

    @Test
    public void test05700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05700");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.27096727177068d), (-0.12221649526988561d), 336.3165885238276d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.003415682769449259d) + "'", double3 == (-0.003415682769449259d));
    }

    @Test
    public void test05701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05701");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-13.659944808043116d), (-1252.573857901445d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.010905500479571647d) + "'", double3 == (-0.010905500479571647d));
    }

    @Test
    public void test05702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05702");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.70852419736485E8d, (-0.19021316356975296d), (-20.319684608805325d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.809356694834354E7d) + "'", double3 == (-2.809356694834354E7d));
    }

    @Test
    public void test05703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05703");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2115.7793041403506d, 9.9642872949936E-13d, (-336013.11124774744d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.006296716506935214d) + "'", double3 == (-0.006296716506935214d));
    }

    @Test
    public void test05704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05704");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4804.102665491978d), (-2.2981772614886277E-4d), (-0.002056080024101499d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2336534.7551458413d + "'", double3 == 2336534.7551458413d);
    }

    @Test
    public void test05705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05705");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.770506194241969E-19d, (-1.056979720374446E-4d), (-2989893.9115929385d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.535174663810467E-11d) + "'", double3 == (-3.535174663810467E-11d));
    }

    @Test
    public void test05706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05706");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.008305859028016d), (-4.2605943282904565E-10d), 3.7626854154533386E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.33104559792133E-9d) + "'", double3 == (-1.33104559792133E-9d));
    }

    @Test
    public void test05707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05707");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.06710635270368362d, 2485.10722964984d, 39.997156224222685d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-62.130420207028884d) + "'", double3 == (-62.130420207028884d));
    }

    @Test
    public void test05708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05708");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.0101534650171442E-5d, 61.123686957121826d, 465146.84984962095d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.314072467121901E-4d) + "'", double3 == (-1.314072467121901E-4d));
    }

    @Test
    public void test05709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05709");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4375.844314461858d, 0.6142109459695451d, (-26.08692184267441d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-167.71737692557684d) + "'", double3 == (-167.71737692557684d));
    }

    @Test
    public void test05710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05710");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.0d), 1.9392148719308493E8d, 7.182891453207927E-9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.6997691731298308E16d) + "'", double3 == (-2.6997691731298308E16d));
    }

    @Test
    public void test05711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05711");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-36816.32715833758d), 1605.4849711336099d, 0.02369851381595228d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1621275.1748005461d) + "'", double3 == (-1621275.1748005461d));
    }

    @Test
    public void test05712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05712");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.2167147129656437E10d, 1.4325933296457168E-4d, (-2989893.9115929385d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4069.42436401496d) + "'", double3 == (-4069.42436401496d));
    }

    @Test
    public void test05713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05713");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-32.34183401542312d), 1.6468619994667089E7d, (-3.097453561498216E-17d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.316835913606187E23d + "'", double3 == 5.316835913606187E23d);
    }

    @Test
    public void test05714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05714");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.01349526848583852d, (-152627.5659945038d), 6.192430911404959E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.4647441638576736E-5d + "'", double3 == 2.4647441638576736E-5d);
    }

    @Test
    public void test05715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05715");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-11.513111369373007d), (-4.837615417050045E19d), (-1.1367100257351308E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.255804301472112E24d) + "'", double3 == (-4.255804301472112E24d));
    }

    @Test
    public void test05716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05716");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.4310986388598355d), (-112.57965019863204d), (-378.760498737663d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.2934533879066304d) + "'", double3 == (-0.2934533879066304d));
    }

    @Test
    public void test05717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05717");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-391344.3147438424d), 9707.584506901194d, (-3.2502105742179406E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0012339258952390921d + "'", double3 == 0.0012339258952390921d);
    }

    @Test
    public void test05718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05718");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(576.4304228548518d, (-1.294377897472212E-4d), 16290.685509473888d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03538405746998289d + "'", double3 == 0.03538405746998289d);
    }

    @Test
    public void test05719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05719");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(35.46556257452041d, (-4804.102665491978d), 0.9235288698516092d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5240.299882389287d + "'", double3 == 5240.299882389287d);
    }

    @Test
    public void test05720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05720");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.435014307432497d, 0.0d, (-1.316311424295841E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.8886716233393624E-8d) + "'", double3 == (-4.8886716233393624E-8d));
    }

    @Test
    public void test05721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05721");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(854847.725260599d, 0.0035197719547558812d, (-173357.16735155284d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.931135728627085d) + "'", double3 == (-4.931135728627085d));
    }

    @Test
    public void test05722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05722");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(167.88026345897654d, (-391.03047669513376d), (-1419965.3167879777d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.9360872659790754E-4d) + "'", double3 == (-3.9360872659790754E-4d));
    }

    @Test
    public void test05723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05723");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1607150.7194990006d, 3.98198386024562E12d, (-235489.70481514162d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.6909368739583492E7d + "'", double3 == 1.6909368739583492E7d);
    }

    @Test
    public void test05724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05724");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.3169580922613865E10d, 1.2351955439269902E13d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05725");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.324813408148684E-13d), 0.0d, 0.07570998391714802d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.391512500897028E-12d) + "'", double3 == (-4.391512500897028E-12d));
    }

    @Test
    public void test05726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05726");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.6164511207587138E8d, 6747.762574141187d, (-20617.70491827632d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7839.784542168651d) + "'", double3 == (-7839.784542168651d));
    }

    @Test
    public void test05727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05727");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.298232900384636d, (-4.737471591409432E8d), 1.8340517646892067d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.5830632240603963E8d + "'", double3 == 2.5830632240603963E8d);
    }

    @Test
    public void test05728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05728");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.528742302351696E-9d), (-146104.4775882591d), 108919.24954395257d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3414018017935068d + "'", double3 == 1.3414018017935068d);
    }

    @Test
    public void test05729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05729");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.008749560645735061d, 0.02008611793798241d, 12354.639696180051d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.175951360000014E-7d) + "'", double3 == (-9.175951360000014E-7d));
    }

    @Test
    public void test05730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05730");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.184809164896243E-5d), (-1.7882610708918953E10d), (-6.760935099832825E24d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.6449907364679537E-15d) + "'", double3 == (-2.6449907364679537E-15d));
    }

    @Test
    public void test05731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05731");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.17061005163973067d), 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05732");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.007519544840997297d, (-66.58694181730846d), 3086.91553409881d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.021573140122083372d + "'", double3 == 0.021573140122083372d);
    }

    @Test
    public void test05733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05733");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2134.8795212236446d, (-1.2195617816271611E26d), (-14.3322407794841d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.509219182061915E24d) + "'", double3 == (-8.509219182061915E24d));
    }

    @Test
    public void test05734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05734");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.7049771730371326E7d, 22.20560268691705d, (-5.691698223666517E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0023326480583846E13d) + "'", double3 == (-1.0023326480583846E13d));
    }

    @Test
    public void test05735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05735");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.791166565179179E9d), 8.572870432211102d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05736");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.1905204613571002E9d, 0.0d, 0.9235288698516092d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.289099345154625E9d + "'", double3 == 1.289099345154625E9d);
    }

    @Test
    public void test05737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05737");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.6827809300217693E10d, (-126.73621405922599d), (-181648.79668820262d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-92639.2562667981d) + "'", double3 == (-92639.2562667981d));
    }

    @Test
    public void test05738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05738");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.709010626922194E15d), 72865.40526567966d, (-1.340898259280106E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.2745266951965346E19d + "'", double3 == 1.2745266951965346E19d);
    }

    @Test
    public void test05739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05739");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.923599642030979d), (-0.9632194354821538d), (-5.844353879328693E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 84874.74080057922d + "'", double3 == 84874.74080057922d);
    }

    @Test
    public void test05740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05740");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(149227.19326520545d, (-2.8626146032068838d), (-2.8851258601270187E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.172393272064698E-4d) + "'", double3 == (-5.172393272064698E-4d));
    }

    @Test
    public void test05741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05741");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.884655272811615E12d, 9.157295926390527E-10d, (-1.106693040456312E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-260655.40916587072d) + "'", double3 == (-260655.40916587072d));
    }

    @Test
    public void test05742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05742");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2046.6526633199571d, (-5.067900382966007E-7d), (-9.404571800819559E10d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.1762316319902968E-8d) + "'", double3 == (-2.1762316319902968E-8d));
    }

    @Test
    public void test05743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05743");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-273.47492579646894d), 3.5089578676489905d, 2134.8795212236446d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.1297421615180231d) + "'", double3 == (-0.1297421615180231d));
    }

    @Test
    public void test05744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05744");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6292.277081597079d), (-1.5831170849805628E-5d), (-47373.13534095857d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.13282374114524012d + "'", double3 == 0.13282374114524012d);
    }

    @Test
    public void test05745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05745");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.647322480503532E-4d, 278.65489571357875d, (-1515.6221322356039d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.18385481780363297d + "'", double3 == 0.18385481780363297d);
    }

    @Test
    public void test05746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05746");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(864017.8193252782d, 1.9392148719308493E8d, 8.534600087290237E18d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.2620564220842833E-11d) + "'", double3 == (-2.2620564220842833E-11d));
    }

    @Test
    public void test05747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05747");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1593458532098562d), (-6.193882622027903E-5d), (-2.2720228548511667E9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.102430690379553E-10d + "'", double3 == 5.102430690379553E-10d);
    }

    @Test
    public void test05748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05748");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0023326480583846E13d), (-3009.8496426320967d), 0.013432020489288028d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.462262647356405E14d) + "'", double3 == (-7.462262647356405E14d));
    }

    @Test
    public void test05749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05749");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.31428793917108944d), (-3.1891763536845264E-5d), (-0.2144483607698758d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4654159457286795d + "'", double3 == 1.4654159457286795d);
    }

    @Test
    public void test05750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05750");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-111023.30276156776d), (-7.797725043868967E11d), 3.5552157025110684E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 21933.19501859863d + "'", double3 == 21933.19501859863d);
    }

    @Test
    public void test05751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05751");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5166596.250086365d, 0.0016628171716879063d, (-18.736836025677306d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-275745.3948651282d) + "'", double3 == (-275745.3948651282d));
    }

    @Test
    public void test05752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05752");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0022646656629954167d), (-1.7891073119675273E-4d), (-54.15296692072759d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.851598629585557E-5d + "'", double3 == 3.851598629585557E-5d);
    }

    @Test
    public void test05753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05753");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.046954265532444E9d, 2.567032561611063E7d, (-0.013347200192383994d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.758933566504788E11d) + "'", double3 == (-6.758933566504788E11d));
    }

    @Test
    public void test05754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05754");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.106683408386238E-5d, 7.083808037757274d, (-3.4192793605482405E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.071704655856899E-8d + "'", double3 == 2.071704655856899E-8d);
    }

    @Test
    public void test05755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05755");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 2853.87309695617d, (-4.6092955089565593E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.191560275123741E7d + "'", double3 == 6.191560275123741E7d);
    }

    @Test
    public void test05756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05756");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.697438194568149E9d), (-19.327740694555885d), 1.2835718987712519d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.217813027577019E9d) + "'", double3 == (-5.217813027577019E9d));
    }

    @Test
    public void test05757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05757");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8.075092422891396E-8d, (-1.0439892572448997E-5d), 1.8752524071118676E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.05610254628538816d + "'", double3 == 0.05610254628538816d);
    }

    @Test
    public void test05758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05758");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.14076420579551788d), (-145.90229267875606d), (-2.1983616138952145E23d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.630461865402109E-22d) + "'", double3 == (-6.630461865402109E-22d));
    }

    @Test
    public void test05759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05759");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-15.938505398217265d), 0.04380633171140876d, (-3.8807377563641367E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 41183.69426977849d + "'", double3 == 41183.69426977849d);
    }

    @Test
    public void test05760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05760");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.56213186762068E-8d, 5.704667865294932E7d, 24.808215899027566d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2299507.5053013153d) + "'", double3 == (-2299507.5053013153d));
    }

    @Test
    public void test05761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05761");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.113409323965263E10d, 8.2451967306892E-5d, (-0.0033358668367661198d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.8326299049430164E13d) + "'", double3 == (-1.8326299049430164E13d));
    }

    @Test
    public void test05762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05762");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4992.602559093856d, (-4.888049273720708E-6d), (-1.506547972393063E10d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.313935337917882E-7d) + "'", double3 == (-3.313935337917882E-7d));
    }

    @Test
    public void test05763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05763");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.14332976584043497d, 0.05937590591320742d, 81.72698993210076d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0010272476693070048d + "'", double3 == 0.0010272476693070048d);
    }

    @Test
    public void test05764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05764");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.316835913606187E23d, (-3.694612821637639E11d), (-8.470014531642763E12d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.277245326731073E10d) + "'", double3 == (-6.277245326731073E10d));
    }

    @Test
    public void test05765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05765");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5115706.55451133d), 0.0d, 44.54390881887077d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-114846.37720756313d) + "'", double3 == (-114846.37720756313d));
    }

    @Test
    public void test05766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05766");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3657423960275605E13d, 0.01783385900607776d, (-1244.6388661197923d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.097300135167168E10d) + "'", double3 == (-1.097300135167168E10d));
    }

    @Test
    public void test05767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05767");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.16492945430900932d), (-128.95093004349383d), 1640.9439102140668d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.07848287792626882d + "'", double3 == 0.07848287792626882d);
    }

    @Test
    public void test05768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05768");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10461.084046288302d, 2.050337475042722d, (-1068.1066237432544d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.792125127132762d) + "'", double3 == (-9.792125127132762d));
    }

    @Test
    public void test05769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05769");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.4476190476190476d), 2.616425058066798d, (-112.29052887000132d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.036192225173244906d + "'", double3 == 0.036192225173244906d);
    }

    @Test
    public void test05770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05770");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-135882.05416813647d), (-1.609427320082126d), 33.8476787380501d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4014.4686373445593d) + "'", double3 == (-4014.4686373445593d));
    }

    @Test
    public void test05771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05771");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.06120347455683E8d, (-5406.525295251469d), (-8.842334221024152E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.985739244079288E13d) + "'", double3 == (-7.985739244079288E13d));
    }

    @Test
    public void test05772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05772");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.015040670271043E-10d), (-4.93075499988197E9d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05773");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.5667148167224542E11d, (-9713.464857751387d), (-1.7619474657989375E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8891.950210029057d) + "'", double3 == (-8891.950210029057d));
    }

    @Test
    public void test05774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05774");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.906825088732021d, (-5.467459891820589d), 2.4647441638576736E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 258618.52414637434d + "'", double3 == 258618.52414637434d);
    }

    @Test
    public void test05775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05775");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-271834.0708458861d), 0.0d, 3.662129817789373E18d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.422840925119837E-14d) + "'", double3 == (-7.422840925119837E-14d));
    }

    @Test
    public void test05776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05776");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1310504.6793179906d), 5678.678064360523d, 3.424035308091776E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.8439538116675077E-4d) + "'", double3 == (-3.8439538116675077E-4d));
    }

    @Test
    public void test05777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05777");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.961920265214859E-11d), 16.835853443683273d, 1.8547001677696903E-24d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.077398997590161E24d) + "'", double3 == (-9.077398997590161E24d));
    }

    @Test
    public void test05778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05778");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.003383137578885628d), 99567.08401717755d, (-1646.1322506763238d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 60.485472755550084d + "'", double3 == 60.485472755550084d);
    }

    @Test
    public void test05779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05779");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7.624006209132355E14d), 0.0d, 0.30711943793911006d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.4824238609878875E15d) + "'", double3 == (-2.4824238609878875E15d));
    }

    @Test
    public void test05780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05780");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.122437454778529E-5d, 1.791627849440949d, (-622.7364595859364d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.00287695797714758d + "'", double3 == 0.00287695797714758d);
    }

    @Test
    public void test05781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05781");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.5344589016391586E13d, 0.0d, (-5443.012166329924d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.3307895758326435E9d) + "'", double3 == (-8.3307895758326435E9d));
    }

    @Test
    public void test05782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05782");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-979.540951465922d), 2081.075077892601d, 1.9325881608612576d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1583.6876636947623d) + "'", double3 == (-1583.6876636947623d));
    }

    @Test
    public void test05783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05783");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.969572545063305E-8d), 0.029266685342399384d, 56813.07268862819d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.15141210519017E-7d) + "'", double3 == (-5.15141210519017E-7d));
    }

    @Test
    public void test05784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05784");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(146.90526360719872d, 268142.06166852213d, (-34.80379148943222d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7700.171301344815d + "'", double3 == 7700.171301344815d);
    }

    @Test
    public void test05785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05785");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1395334.2043784088d, (-5.151674317084418E-8d), 0.030382784546844715d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.592515877625072E7d + "'", double3 == 4.592515877625072E7d);
    }

    @Test
    public void test05786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05786");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.15847193644261548d), 1.0708747019597697E-6d, 0.8996685492986446d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.1761459900325052d) + "'", double3 == (-0.1761459900325052d));
    }

    @Test
    public void test05787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05787");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.64353371263511d, (-7.028353450234405d), 0.0573834125894637d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 290.53495445007184d + "'", double3 == 290.53495445007184d);
    }

    @Test
    public void test05788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05788");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-32.93006978575139d), 9.990971428571429d, (-475976.7262444456d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.017466369202267E-5d + "'", double3 == 9.017466369202267E-5d);
    }

    @Test
    public void test05789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05789");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1198602.8454980063d, 12.223507767800605d, 1.474228282204198E10d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.130291871745678E-5d + "'", double3 == 8.130291871745678E-5d);
    }

    @Test
    public void test05790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05790");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(599.7651782375282d, 0.0d, 44593.07481455038d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.013449738120364586d + "'", double3 == 0.013449738120364586d);
    }

    @Test
    public void test05791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05791");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.7383031637295921d, 0.0d, 1.4939838194782124E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4941.8417663147875d + "'", double3 == 4941.8417663147875d);
    }

    @Test
    public void test05792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05792");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.9d, 0.0023457492850929374d, (-2.3542704299726557E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-42041.28007006343d) + "'", double3 == (-42041.28007006343d));
    }

    @Test
    public void test05793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05793");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.2854802570931832d, (-3.7045510834837865d), (-1.2618130177947d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.1621415251765597d) + "'", double3 == (-3.1621415251765597d));
    }

    @Test
    public void test05794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05794");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1172.73478143139d, 0.0d, (-8.83203902095204E-8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.3278188407561817E10d) + "'", double3 == (-1.3278188407561817E10d));
    }

    @Test
    public void test05795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05795");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.523618445715327d, 7.105182184397304E-11d, 5.347321778220386E10d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.459596473264336E-11d + "'", double3 == 8.459596473264336E-11d);
    }

    @Test
    public void test05796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05796");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1990.0527065092963d, (-31856.923773494596d), 3.3357441478551286d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10146.754361172267d + "'", double3 == 10146.754361172267d);
    }

    @Test
    public void test05797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05797");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 108919.24954395257d, (-8.800376789198863d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12376.65751739568d + "'", double3 == 12376.65751739568d);
    }

    @Test
    public void test05798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05798");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(59.552578146489715d, (-63102.099794689515d), 7.069643820228343E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.934205736378376E8d + "'", double3 == 8.934205736378376E8d);
    }

    @Test
    public void test05799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05799");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(44.693187122855626d, 1.5960486736072068d, 7526.922145443112d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.005725731928201216d + "'", double3 == 0.005725731928201216d);
    }

    @Test
    public void test05800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05800");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-543.0193960250996d), (-1.5379629534736016E-8d), 3.107672165448168d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-174.73509659324353d) + "'", double3 == (-174.73509659324353d));
    }

    @Test
    public void test05801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05801");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(16874.342303931215d, (-7.287382667409979E15d), (-2.9104782871812895E19d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.503843680787072E-4d) + "'", double3 == (-2.503843680787072E-4d));
    }

    @Test
    public void test05802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05802");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.4768862817473211E9d, 8.10962584978731E-8d, (-0.00868851227836562d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.6998149216233087E11d) + "'", double3 == (-1.6998149216233087E11d));
    }

    @Test
    public void test05803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05803");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.805061416816063E8d, 574.9789906459908d, 95.77417289928937d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7105313.949494466d + "'", double3 == 7105313.949494466d);
    }

    @Test
    public void test05804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05804");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0016213130912348043d, 0.0d, 0.12150050300469178d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.013344085424668544d + "'", double3 == 0.013344085424668544d);
    }

    @Test
    public void test05805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05805");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-3.694612821637639E11d), (-386.90167524923964d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.549229321009253E8d) + "'", double3 == (-9.549229321009253E8d));
    }

    @Test
    public void test05806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05806");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8695456.73058342d, 0.017005517219184554d, (-7.754923742649098E11d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1212820399195203E-5d) + "'", double3 == (-1.1212820399195203E-5d));
    }

    @Test
    public void test05807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05807");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8629.630557136725d), 2.884655272811615E12d, (-4004.667734764985d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.203232508902595E8d + "'", double3 == 7.203232508902595E8d);
    }

    @Test
    public void test05808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05808");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0017284719424440346d), (-201590.80145719493d), (-0.0036862874761002186d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.468667352606722E7d) + "'", double3 == (-5.468667352606722E7d));
    }

    @Test
    public void test05809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05809");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.3255540570002278E20d), (-9190.743700139648d), (-6.091297904014263E-9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.176143866033323E28d + "'", double3 == 2.176143866033323E28d);
    }

    @Test
    public void test05810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05810");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1351037224275184E-6d), (-28.202783456317604d), 0.0012952751777688372d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 21773.58356376001d + "'", double3 == 21773.58356376001d);
    }

    @Test
    public void test05811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05811");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11089.914183574241d, 0.2568306415813569d, 5.935546341361985E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.8683465202948782E-6d + "'", double3 == 1.8683465202948782E-6d);
    }

    @Test
    public void test05812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05812");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.5831170849805628E-5d), (-5.844353879328693E-5d), 5.960219830491476E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.14946246201921d + "'", double3 == 7.14946246201921d);
    }

    @Test
    public void test05813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05813");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.432333144893692E8d, (-1.8768837570345962E9d), (-9.990971428571429d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.5223944333552232E8d) + "'", double3 == (-2.5223944333552232E8d));
    }

    @Test
    public void test05814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05814");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.44038197934218E13d, (-1.1324884425673403E-8d), 4.236366323812702E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 812106.8189980933d + "'", double3 == 812106.8189980933d);
    }

    @Test
    public void test05815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05815");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-15.110196608694695d), 4.746731702532458d, 4.33292992491925E-9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.582794703654758E9d) + "'", double3 == (-4.582794703654758E9d));
    }

    @Test
    public void test05816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05816");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.743955665004311E8d), 6.302194638112576E7d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05817");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.9205495967394286d), (-18.264700793263554d), 1.8683465202948782E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8747922.839251766d + "'", double3 == 8747922.839251766d);
    }

    @Test
    public void test05818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05818");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-186.88913729354442d), (-4.730910153405653E-8d), 0.32571822743541134d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-573.7754952117155d) + "'", double3 == (-573.7754952117155d));
    }

    @Test
    public void test05819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05819");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0315173446192247d), 1712.6528023229725d, (-785.5642361992384d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.180196399920137d + "'", double3 == 2.180196399920137d);
    }

    @Test
    public void test05820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05820");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.0d, 0.02d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test05821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05821");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.4089466947780806E14d), (-0.2857142857142857d), 1.3005252786163886E-8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.3901276409395874E22d) + "'", double3 == (-3.3901276409395874E22d));
    }

    @Test
    public void test05822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05822");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.9399350804124315d, (-4.627277150041634E8d), 265922.8856994398d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1740.082335249242d + "'", double3 == 1740.082335249242d);
    }

    @Test
    public void test05823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05823");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.018400542186151937d), 4.763992402693168E7d, (-0.01356107481294527d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.5129902830309305E9d + "'", double3 == 3.5129902830309305E9d);
    }

    @Test
    public void test05824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05824");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.09335836511275178d), (-22760.964324167737d), (-5.15141210519017E-7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.4183750981348404E10d) + "'", double3 == (-4.4183750981348404E10d));
    }

    @Test
    public void test05825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05825");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(Double.POSITIVE_INFINITY, 1.0851566821486497E11d, 1.6674179665974676E13d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05826");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1948949.2855055d), (-2.232181032951314E-5d), (-8.509219182061915E24d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.290397325281869E-19d + "'", double3 == 2.290397325281869E-19d);
    }

    @Test
    public void test05827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05827");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-852.6097101830538d), 0.0d, (-9.578953279316647d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 89.00865108341756d + "'", double3 == 89.00865108341756d);
    }

    @Test
    public void test05828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05828");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(15216.37191700468d, (-621888.1325185596d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05829");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.29397590361445786d), (double) (short) 1, (-2.0516101979116837E-14d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.307123570216139E13d + "'", double3 == 6.307123570216139E13d);
    }

    @Test
    public void test05830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05830");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.0559357735884724E12d), (-4.1445130312798157E11d), (-2.18738560259926E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7504.321453473602d + "'", double3 == 7504.321453473602d);
    }

    @Test
    public void test05831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05831");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(84311.03524216182d, 4.341560276957069E10d, (-3.6731437458433125E12d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.011819716695723197d + "'", double3 == 0.011819716695723197d);
    }

    @Test
    public void test05832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05832");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.387357239931889E17d), 4.264057921254216E11d, 1.1948118355058969E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.672010415039245E22d) + "'", double3 == (-3.672010415039245E22d));
    }

    @Test
    public void test05833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05833");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.1446576867922154d), 762.9930593548173d, 3086.4304719818083d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.24725576162148116d) + "'", double3 == (-0.24725576162148116d));
    }

    @Test
    public void test05834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05834");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11.391352756079183d, (-1.504451572129765E-4d), (-285.1082099874354d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.039955016383914084d) + "'", double3 == (-0.039955016383914084d));
    }

    @Test
    public void test05835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05835");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5086896265246781d), 0.03790395662113255d, 0.0029268292682926825d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-186.75280757481866d) + "'", double3 == (-186.75280757481866d));
    }

    @Test
    public void test05836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05836");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6745204.023593314d, 5138.52728919737d, (-5.917006091502119E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.011391006519300457d) + "'", double3 == (-0.011391006519300457d));
    }

    @Test
    public void test05837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05837");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.4485220705049915E9d, 0.0d, 7.818921841830124E10d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.044104828520677715d + "'", double3 == 0.044104828520677715d);
    }

    @Test
    public void test05838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05838");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-103016.32495324952d), (-881.0664500596705d), 8.130291871745678E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.2562311429203353E9d) + "'", double3 == (-1.2562311429203353E9d));
    }

    @Test
    public void test05839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05839");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.3642492621684885E-4d, 20.872471222336255d, (-1.7824318271338813d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11.709976493727797d + "'", double3 == 11.709976493727797d);
    }

    @Test
    public void test05840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05840");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(395.75027058366766d, 1.0537580918860483d, 1.595785590994323E-8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.4733680684875027E10d + "'", double3 == 2.4733680684875027E10d);
    }

    @Test
    public void test05841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05841");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-186.88913729354442d), 45995.76085555168d, 25.952296866832235d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1779.5207194885302d) + "'", double3 == (-1779.5207194885302d));
    }

    @Test
    public void test05842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05842");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(700345.219991915d, 831.4388614823163d, (-3.617076520730803d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-193392.0327981066d) + "'", double3 == (-193392.0327981066d));
    }

    @Test
    public void test05843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05843");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(27398.61526880327d, (-2568.4106182548826d), (-69.80731599711538d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-429.2820237967102d) + "'", double3 == (-429.2820237967102d));
    }

    @Test
    public void test05844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05844");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-13.208362369337976d), (-8.60508745826035d), 0.005138283873363884d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-895.8778892969175d) + "'", double3 == (-895.8778892969175d));
    }

    @Test
    public void test05845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05845");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.219117134966543E14d, (-4.509238218882756E-4d), 1162073.5446158105d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.6306799638584083E8d + "'", double3 == 3.6306799638584083E8d);
    }

    @Test
    public void test05846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05846");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2028.024422328365d, 1.5375461225231327E19d, 1.8156587824828305E13d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-846825.481393926d) + "'", double3 == (-846825.481393926d));
    }

    @Test
    public void test05847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05847");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2943857134042933d), 1.5747220000666506E-4d, 1.0452228585139721E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2817.994107238161d) + "'", double3 == (-2817.994107238161d));
    }

    @Test
    public void test05848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05848");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.5322970449077552E7d, 2.025960109840764d, (-1.0636597749866271E15d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.4405892545207974E-8d) + "'", double3 == (-1.4405892545207974E-8d));
    }

    @Test
    public void test05849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05849");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1058043.0098599058d), (-788.9973698525272d), (-96.05344860883405d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11006.934449543725d + "'", double3 == 11006.934449543725d);
    }

    @Test
    public void test05850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05850");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1794.4566385400612d, 2.1440837670229755E10d, 0.3071310427636022d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.981005789205118E10d) + "'", double3 == (-6.981005789205118E10d));
    }

    @Test
    public void test05851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05851");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.01146206392065246d, 4.3379362614423923E-16d, 2.659021368920301E18d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.3106324960849084E-21d + "'", double3 == 4.3106324960849084E-21d);
    }

    @Test
    public void test05852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05852");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3918775.245102388d), (-43.53531498138044d), (-3.0022736668044643d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1305254.6651945938d + "'", double3 == 1305254.6651945938d);
    }

    @Test
    public void test05853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05853");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.681859244579233E8d, (-99863.29077424272d), (-9.360483774095394E-8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.207757272918785E15d) + "'", double3 == (-8.207757272918785E15d));
    }

    @Test
    public void test05854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05854");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.07890275625931009d), 8.075092422891396E-8d, 1698482.184390229d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.6454909998694616E-8d) + "'", double3 == (-4.6454909998694616E-8d));
    }

    @Test
    public void test05855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05855");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1899.0552607104316d, 2.567032561611063E7d, (-1.7433329696664744E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.472376591705294E11d + "'", double3 == 1.472376591705294E11d);
    }

    @Test
    public void test05856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05856");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.9564552553569562E13d, (-8.260892661984556E-5d), 3.569865740221003E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.480472930155172E16d + "'", double3 == 5.480472930155172E16d);
    }

    @Test
    public void test05857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05857");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.026476870386276552d), 2.4475593178317983d, (-87171.92570003681d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.8381112019153547E-5d + "'", double3 == 2.8381112019153547E-5d);
    }

    @Test
    public void test05858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05858");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.462338981444688d, 0.0d, (-0.20105272966497684d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-22.194868922597983d) + "'", double3 == (-22.194868922597983d));
    }

    @Test
    public void test05859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05859");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.730910153405653E-8d), 0.0d, (-5.0466132302070993E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.374425852744632E-17d + "'", double3 == 9.374425852744632E-17d);
    }

    @Test
    public void test05860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05860");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.746730576927694d), 0.0d, (-0.6286799921599484d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.778409681730879d + "'", double3 == 2.778409681730879d);
    }

    @Test
    public void test05861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05861");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.0688034965874028E9d), 2.240920385533724E9d, (-0.15191765223849601d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.836881572758429E10d + "'", double3 == 2.836881572758429E10d);
    }

    @Test
    public void test05862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05862");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.0255671671688266E13d, 1.0704115209187394E22d, (-10.014048401229294d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0689098724166061E21d + "'", double3 == 1.0689098724166061E21d);
    }

    @Test
    public void test05863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05863");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.631959843509194E-23d), 0.12875385111887264d, 0.053050316762281974d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.427013804570057d) + "'", double3 == (-2.427013804570057d));
    }

    @Test
    public void test05864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05864");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.9564552553569562E13d, 0.11368226294575147d, 1.8447581352872d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0605483818898326E13d + "'", double3 == 1.0605483818898326E13d);
    }

    @Test
    public void test05865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05865");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-21767.230402447247d), (-6.357325234240991d), (-881.0664500596705d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 24.69833356580454d + "'", double3 == 24.69833356580454d);
    }

    @Test
    public void test05866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05866");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.597181214382933E9d, 0.7394978813337217d, 25.272195976724745d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.0061420941181E8d + "'", double3 == 3.0061420941181E8d);
    }

    @Test
    public void test05867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05867");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.07458508556817531d), (-9520.702958270625d), 0.2068022172246937d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 46037.36120895045d + "'", double3 == 46037.36120895045d);
    }

    @Test
    public void test05868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05868");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(84.45213259648938d, (-86920.64717975413d), 27.030611294143107d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3218.761809179009d + "'", double3 == 3218.761809179009d);
    }

    @Test
    public void test05869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05869");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.046904311177548515d), (-0.03500183740763517d), 1157.6861385734317d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0281261365520249E-5d) + "'", double3 == (-1.0281261365520249E-5d));
    }

    @Test
    public void test05870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05870");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-39279.50170768363d), 6.7681206835101976E16d, 7.803687768431432E10d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-867297.7295290405d) + "'", double3 == (-867297.7295290405d));
    }

    @Test
    public void test05871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05871");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1863471470806576E13d), (-3.694612821637639E11d), (-0.007878734965412646d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4588649369601962E15d + "'", double3 == 1.4588649369601962E15d);
    }

    @Test
    public void test05872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05872");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5026278.486811852d), (-0.0038632266354697077d), 1303093.029576357d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.857190828948488d) + "'", double3 == (-3.857190828948488d));
    }

    @Test
    public void test05873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05873");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.23007705294454095d, 14178.070884733845d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.6227669815946193E-5d) + "'", double3 == (-1.6227669815946193E-5d));
    }

    @Test
    public void test05874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05874");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.729781025267267E-4d, 4.5344589016391586E13d, (-181443.57180934923d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.4991014321541876E8d + "'", double3 == 2.4991014321541876E8d);
    }

    @Test
    public void test05875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05875");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-391.3017493936714d), 0.6656266955699158d, (-7.401098251697938d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.960704311595556d + "'", double3 == 52.960704311595556d);
    }

    @Test
    public void test05876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05876");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.004719704291657331d), (-1772547.842024869d), (-9.851781547575932E-12d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.799215531470353E17d) + "'", double3 == (-1.799215531470353E17d));
    }

    @Test
    public void test05877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05877");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.60059466498972E8d, 285.7592298652327d, 181765.15533114015d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5281.865927441947d + "'", double3 == 5281.865927441947d);
    }

    @Test
    public void test05878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05878");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.22105977646893E10d, 7504.321453473602d, (-1.1107568835548508E-7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.899877618339085E17d) + "'", double3 == (-2.899877618339085E17d));
    }

    @Test
    public void test05879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05879");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-876.4615394435142d), 12.223136781466463d, 7.850934101625734E16d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1319476952952082E-14d) + "'", double3 == (-1.1319476952952082E-14d));
    }

    @Test
    public void test05880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05880");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4.2717554380867966E10d, 296931.0529225544d, (-0.03815356579406859d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1196137650771277E12d) + "'", double3 == (-1.1196137650771277E12d));
    }

    @Test
    public void test05881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05881");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.3496190917066646d, (-1.5728314270361984E18d), (-1.099038750463345E14d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-14310.973351695804d) + "'", double3 == (-14310.973351695804d));
    }

    @Test
    public void test05882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05882");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.7347788886478163E-4d, (-0.015142796934924478d), 0.2443810045243917d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06308295055007256d + "'", double3 == 0.06308295055007256d);
    }

    @Test
    public void test05883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05883");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(805588.8368964394d, 99.42430000952295d, (-2501809.788313929d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.3219626913120689d) + "'", double3 == (-0.3219626913120689d));
    }

    @Test
    public void test05884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05884");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-981709.5032598865d), 4.813601074268386E-6d, (-3.2891185707679995E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.9847191037429638E10d + "'", double3 == 2.9847191037429638E10d);
    }

    @Test
    public void test05885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05885");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.748743856017027E7d), 36.083486963278496d, 0.42734743841663353d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1112146786138053E8d) + "'", double3 == (-1.1112146786138053E8d));
    }

    @Test
    public void test05886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05886");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-18.87433095138013d), (-22935.91014270929d), 614397.1823443279d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03730003403387105d + "'", double3 == 0.03730003403387105d);
    }

    @Test
    public void test05887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05887");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(58.58234368006642d, (-9258.829279944614d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05888");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1831958.304746285d, 4.341560276957069E10d, 4.631424270884752E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.373740834797781E13d) + "'", double3 == (-9.373740834797781E13d));
    }

    @Test
    public void test05889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05889");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.368735385069102E-4d), (-18.178161845656373d), (-684.4354801089842d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.026558566147423277d) + "'", double3 == (-0.026558566147423277d));
    }

    @Test
    public void test05890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05890");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.12066715596398438d), 0.261351713964122d, (-118.20573347844831d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0032318133705228217d + "'", double3 == 0.0032318133705228217d);
    }

    @Test
    public void test05891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05891");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.815341787055284E7d), 2.4733680684875027E10d, 3218.761809179009d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7689861.993565435d) + "'", double3 == (-7689861.993565435d));
    }

    @Test
    public void test05892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05892");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.810505379137091E-9d, 1.3639495421412378E-16d, 2.836258914699179E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0486512048066715E-18d + "'", double3 == 2.0486512048066715E-18d);
    }

    @Test
    public void test05893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05893");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.157377406676948E8d, (-4139206.0172883417d), (-6.545530556939807E11d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0010997992300589654d) + "'", double3 == (-0.0010997992300589654d));
    }

    @Test
    public void test05894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05894");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.7879353125979627d, (-118.20573347844831d), (-4.724977972557113E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-251839.6265171328d) + "'", double3 == (-251839.6265171328d));
    }

    @Test
    public void test05895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05895");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.7745004283150366E12d), 4.4161076612627E9d, (-485103.36811160494d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5728503.899682201d + "'", double3 == 5728503.899682201d);
    }

    @Test
    public void test05896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05896");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-734.0269457183498d), (-3149.559288236844d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05897");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.230355848015107E7d), (-8.60508745826035d), 614397.1823443279d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-85.12986611607054d) + "'", double3 == (-85.12986611607054d));
    }

    @Test
    public void test05898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05898");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7629.932706928724d), (-15203.024370552523d), (-40.22963705964476d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-188.24658180226376d) + "'", double3 == (-188.24658180226376d));
    }

    @Test
    public void test05899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05899");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.582794703654758E9d), (-87171.92570003681d), 150931.04401946944d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-30362.922097974155d) + "'", double3 == (-30362.922097974155d));
    }

    @Test
    public void test05900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05900");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.5814060839476284E7d, (-3.4826862578626947E9d), 2.177308738904288E-8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.6113931184916813E17d + "'", double3 == 1.6113931184916813E17d);
    }

    @Test
    public void test05901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05901");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(162772.69699750235d, 5.4061278290473E11d, (-17193.10596899805d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.1443569364770096E7d + "'", double3 == 3.1443569364770096E7d);
    }

    @Test
    public void test05902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05902");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2046.6526633199571d, (-8.206390887176429E9d), 0.02056567333201051d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.990335157690084E11d + "'", double3 == 3.990335157690084E11d);
    }

    @Test
    public void test05903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05903");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.960219830491476E-6d, (-1.3389754984703452d), 1.8752524071118676E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7140.273243282387d + "'", double3 == 7140.273243282387d);
    }

    @Test
    public void test05904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05904");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.2926002329822405d, 6.846975582996936E-5d, 2.060070448649351E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4200085410584084E-8d + "'", double3 == 1.4200085410584084E-8d);
    }

    @Test
    public void test05905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05905");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(54.71206935067825d, (-26406.993606320168d), (-6.799403549977962E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.8917686648789376E7d) + "'", double3 == (-3.8917686648789376E7d));
    }

    @Test
    public void test05906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05906");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0037198347731897145d), (-2.359719333258184E-11d), (-8.207757272918785E15d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.532096437434851E-19d + "'", double3 == 4.532096437434851E-19d);
    }

    @Test
    public void test05907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05907");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.719611572674374E10d), (-5.587479427085652E-7d), 597.8273769433109d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.567329622672561E7d) + "'", double3 == (-9.567329622672561E7d));
    }

    @Test
    public void test05908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05908");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.051754094399986086d, 8.530852879493978E-13d, (-128.95093004349383d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.0134719758653056E-4d) + "'", double3 == (-4.0134719758653056E-4d));
    }

    @Test
    public void test05909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05909");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.4416775822289938E11d), (-0.0036862874761002186d), (-1449.5659560169545d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.684419789312711E8d + "'", double3 == 1.684419789312711E8d);
    }

    @Test
    public void test05910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05910");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2336534.7551458413d, (double) (short) -1, 0.06444874751764998d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.625416854696759E7d + "'", double3 == 3.625416854696759E7d);
    }

    @Test
    public void test05911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05911");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.184809164896243E-5d), (-51.64639858342376d), 914650.5056079684d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.646561874582117E-5d + "'", double3 == 5.646561874582117E-5d);
    }

    @Test
    public void test05912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05912");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(144982.25462279818d, 213.07831205463037d, (-1363992.3449477204d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.10613635541795678d) + "'", double3 == (-0.10613635541795678d));
    }

    @Test
    public void test05913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05913");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.4321112837709945d, (-91.96052516905407d), 1.36545998839045E-7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.766411117013676E8d + "'", double3 == 6.766411117013676E8d);
    }

    @Test
    public void test05914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05914");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-166.57266975190436d), 7.077381450896908E-7d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05915");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-34.13353624341552d), 233951.2658488795d, 0.03580972901448908d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6534129.294596152d) + "'", double3 == (-6534129.294596152d));
    }

    @Test
    public void test05916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05916");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.9819000684834857E-7d), (-0.02296422630797628d), 0.01695327433135027d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3545482523988879d + "'", double3 == 1.3545482523988879d);
    }

    @Test
    public void test05917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05917");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 296.9731800110935d, 1.0921455421803116E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.7191722031683546E7d) + "'", double3 == (-2.7191722031683546E7d));
    }

    @Test
    public void test05918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05918");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1358.5549978183717d, (-7.233569750336349E8d), (-25.203544966414682d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.8700658361851614E7d) + "'", double3 == (-2.8700658361851614E7d));
    }

    @Test
    public void test05919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05919");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.097453561498216E-17d), (-105785.4529149172d), (-7.146665435024557d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-14802.071522262844d) + "'", double3 == (-14802.071522262844d));
    }

    @Test
    public void test05920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05920");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(336.3165885238276d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05921");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1837801832831516E-10d), (-1.0087742059352795E7d), (-1.173415136233868E20d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.596908074434667E-14d) + "'", double3 == (-8.596908074434667E-14d));
    }

    @Test
    public void test05922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05922");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.9680347141994425d, (-0.9569215772565901d), (-8.842334221024152E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-330790.0627078144d) + "'", double3 == (-330790.0627078144d));
    }

    @Test
    public void test05923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05923");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.5813701510766837E-5d), 2.4309755204295454E-7d, 19.59852272192897d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.192861926702103E-7d) + "'", double3 == (-8.192861926702103E-7d));
    }

    @Test
    public void test05924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05924");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.387357239931889E17d), (-0.019837549573001118d), 6.346549939556586E18d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.06912979936684183d) + "'", double3 == (-0.06912979936684183d));
    }

    @Test
    public void test05925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05925");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-488847.04253259435d), 9.768898159572461E-9d, (-2.1840050174198713E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.238305492128016E10d + "'", double3 == 2.238305492128016E10d);
    }

    @Test
    public void test05926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05926");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6347.187128421544d), 8.117008934212009E21d, (-0.08513640106250044d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.534122693597468E22d + "'", double3 == 9.534122693597468E22d);
    }

    @Test
    public void test05927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05927");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.41466339807368535d), (-672.34495885836d), (-1.2555776668766197E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.351562975246151E7d) + "'", double3 == (-5.351562975246151E7d));
    }

    @Test
    public void test05928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05928");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7.137296881339978E9d), (-4488892.423933994d), (-0.0031500412764029324d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.264353817312857E12d + "'", double3 == 2.264353817312857E12d);
    }

    @Test
    public void test05929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05929");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.4547216102072306E7d, (-1.3962432147967874d), 12066.55111938192d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2034.3192727942376d + "'", double3 == 2034.3192727942376d);
    }

    @Test
    public void test05930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05930");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.07630497445598548d, 2.7175841417407885E7d, (-2.2847901963673088E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.1894239297906219E13d + "'", double3 == 1.1894239297906219E13d);
    }

    @Test
    public void test05931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05931");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2857142857142857d), (-1.4871867012740664E-8d), 5350101.265477213d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.3403525777363737E-8d) + "'", double3 == (-5.3403525777363737E-8d));
    }

    @Test
    public void test05932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05932");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-5.172393272064698E-4d), 0.005552037864342852d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.09316206766678654d + "'", double3 == 0.09316206766678654d);
    }

    @Test
    public void test05933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05933");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.6573983248002416E-5d), (-0.039789568689739d), 29424.487220774823d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3506775634965325E-6d + "'", double3 == 1.3506775634965325E-6d);
    }

    @Test
    public void test05934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05934");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.691046597984912E8d), (-1904166.9092130475d), 21.254180846933384d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.6686537438167866E7d) + "'", double3 == (-2.6686537438167866E7d));
    }

    @Test
    public void test05935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05935");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.791967647385999E-6d, (-2299.0769252473447d), 1.595785590994323E-8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.440717939812186E11d + "'", double3 == 1.440717939812186E11d);
    }

    @Test
    public void test05936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05936");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.677566251341691E10d), (-18490.129125224554d), (-1.5622855469442368E11d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.2994052151015474d + "'", double3 == 0.2994052151015474d);
    }

    @Test
    public void test05937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05937");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.11672409552027026d), 2.0d, 0.0010348342930370253d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2045.4715404802846d) + "'", double3 == (-2045.4715404802846d));
    }

    @Test
    public void test05938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05938");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1d, 7.769388172058685E9d, (-0.0012111748197741678d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.414753712769015E12d + "'", double3 == 6.414753712769015E12d);
    }

    @Test
    public void test05939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05939");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1711985.4951348926d, 5323.305579925703d, 21.442485754099575d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 79592.55326676252d + "'", double3 == 79592.55326676252d);
    }

    @Test
    public void test05940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05940");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.068391179604457E17d), (-4.4999183035714285d), (-4.234808354025509d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.245643540604894E16d + "'", double3 == 7.245643540604894E16d);
    }

    @Test
    public void test05941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05941");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(161.5789184939156d, (-2.950776074419095E-4d), 60.78212003088318d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.6583346136894406d + "'", double3 == 2.6583346136894406d);
    }

    @Test
    public void test05942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05942");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5434642561268097d), (-0.00730320598354372d), (-8.509219182061915E24d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.300942996903106E-26d + "'", double3 == 6.300942996903106E-26d);
    }

    @Test
    public void test05943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05943");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.7045510834837865d), 3.820528374206212d, 48.51857524710401d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.15509687618329554d) + "'", double3 == (-0.15509687618329554d));
    }

    @Test
    public void test05944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05944");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8.921611432383611E-10d, (-5150878.856112595d), (-4.927041344738404d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1045430.4106080271d) + "'", double3 == (-1045430.4106080271d));
    }

    @Test
    public void test05945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05945");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1835819.0847507995d, 1.1873447244237535E13d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05946");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.9694083806370692d), (-2.3472392633885765E-15d), (-1.8929671162328545d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0403817180703783d + "'", double3 == 1.0403817180703783d);
    }

    @Test
    public void test05947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05947");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-16719.06947781108d), 0.0d, 4.018771965668327E18d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.160243382963551E-15d) + "'", double3 == (-4.160243382963551E-15d));
    }

    @Test
    public void test05948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05948");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4774778.973697376d), 1.9348791641602132E7d, (-546.8637110016421d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 44112.58258682861d + "'", double3 == 44112.58258682861d);
    }

    @Test
    public void test05949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05949");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3218.761809179009d, 5.043560517815724E-4d, 0.906825088732021d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3549.48417817115d + "'", double3 == 3549.48417817115d);
    }

    @Test
    public void test05950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05950");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1553.821497993468d), (-1.0421258573956778d), (-331793.38626693597d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.004679958782803534d + "'", double3 == 0.004679958782803534d);
    }

    @Test
    public void test05951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05951");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-226.4166965971634d), (-5026278.486811852d), (-1518585.3593761062d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.309693484849711d) + "'", double3 == (-3.309693484849711d));
    }

    @Test
    public void test05952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05952");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.666065713598075E-28d, 1.0885990783523606E-12d, (-7.443643498017916E12d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4624546146550823E-25d + "'", double3 == 1.4624546146550823E-25d);
    }

    @Test
    public void test05953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05953");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.09865590851564983d), (-1119.0111575101134d), 182.07752598368612d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.145253213193652d + "'", double3 == 6.145253213193652d);
    }

    @Test
    public void test05954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05954");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3506.236488741913d), 2.27268399469413E15d, (-2504476.7970477305d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.074486125711641E8d + "'", double3 == 9.074486125711641E8d);
    }

    @Test
    public void test05955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05955");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(185.41419335293355d, (-0.008675328906899083d), 81.91723186732399d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.2635392389986735d + "'", double3 == 2.2635392389986735d);
    }

    @Test
    public void test05956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05956");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.245810793865246E9d, (-1.9899495607422277E-4d), (-4.97271665616187d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.5162653518224907E8d) + "'", double3 == (-4.5162653518224907E8d));
    }

    @Test
    public void test05957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05957");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.060070448649351E7d, 1.407706191138976E-4d, 0.12392501274221063d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.6623524202661505E8d + "'", double3 == 1.6623524202661505E8d);
    }

    @Test
    public void test05958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05958");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-16719.06947781108d), (-8.7551265025586E-10d), (-52.17277789640387d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 320.45580381033545d + "'", double3 == 320.45580381033545d);
    }

    @Test
    public void test05959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05959");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11089.914183574241d, (-0.10524276048567995d), (-3.348226725170131E-14d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.312206829652857E17d) + "'", double3 == (-3.312206829652857E17d));
    }

    @Test
    public void test05960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05960");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-59221.74249123638d), 658621.8333815158d, 5.646561874582117E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.2712932078263597E10d) + "'", double3 == (-1.2712932078263597E10d));
    }

    @Test
    public void test05961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05961");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.2093580749564157d), 6.145253213193652d, 2.7347788886478163E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-30549.494596548244d) + "'", double3 == (-30549.494596548244d));
    }

    @Test
    public void test05962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05962");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.999055320812887E11d, 7.818921841830124E10d, 1.849453400114393E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 65.81204676768769d + "'", double3 == 65.81204676768769d);
    }

    @Test
    public void test05963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05963");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.944570738517136E-6d), (-43.3677108287897d), (-1.9405370566867156E14d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.2348298237739E-13d) + "'", double3 == (-2.2348298237739E-13d));
    }

    @Test
    public void test05964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05964");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(320.45580381033545d, (-84647.53766178714d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05965");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-22836.891809025565d), (-0.9632194354821538d), 2.3642492621684885E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.658849832375534E7d) + "'", double3 == (-9.658849832375534E7d));
    }

    @Test
    public void test05966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05966");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.621154735348211E12d, 0.0d, (-5.541622719503886E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-119480.4314636015d) + "'", double3 == (-119480.4314636015d));
    }

    @Test
    public void test05967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05967");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(38.92379864376867d, 9685905.616190005d, 81626.45741613832d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-118.66087294481035d) + "'", double3 == (-118.66087294481035d));
    }

    @Test
    public void test05968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05968");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 1.786205689737572E14d, 2.231324226953313E-10d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.005137344725946E23d) + "'", double3 == (-8.005137344725946E23d));
    }

    @Test
    public void test05969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05969");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.2170764758790193d, 0.0d, 2.1439450754549277E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10341.106688139265d + "'", double3 == 10341.106688139265d);
    }

    @Test
    public void test05970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05970");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-41561.496272450415d), (-0.005547064099042615d), (-0.08576417320182057d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 484602.0100675798d + "'", double3 == 484602.0100675798d);
    }

    @Test
    public void test05971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05971");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.7175841417407885E7d, (-2.0443057633248803E17d), (-0.0018250241312549778d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1201527303591716E20d) + "'", double3 == (-1.1201527303591716E20d));
    }

    @Test
    public void test05972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05972");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(34.09921842693194d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05973");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.016479019225849E-16d, 16.90347621356856d, 68.14571631970391d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.24804899157954885d) + "'", double3 == (-0.24804899157954885d));
    }

    @Test
    public void test05974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05974");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.0198770953768246E20d), 1712.6528023229725d, 113185.33392677283d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.010682391383422E14d) + "'", double3 == (-9.010682391383422E14d));
    }

    @Test
    public void test05975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05975");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.232181032951314E-5d), (-3.1760147154461245E12d), (-7689861.993565435d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-413013.2267788011d) + "'", double3 == (-413013.2267788011d));
    }

    @Test
    public void test05976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05976");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3717184637042988E-4d, 1752.7497570030052d, 4560.2361265867285d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.3843550139021128d) + "'", double3 == (-0.3843550139021128d));
    }

    @Test
    public void test05977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05977");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.15141210519017E-7d), 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05978");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.2857142857142857d), 85.14070865971769d, 165.57094881135654d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5159505550865852d) + "'", double3 == (-0.5159505550865852d));
    }

    @Test
    public void test05979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05979");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.6922069195208471d), 1.679900070095145d, (-1.5449461602692176d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.1826695818502695d + "'", double3 == 2.1826695818502695d);
    }

    @Test
    public void test05980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05980");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8629.630557136725d), (-6.651159273789213E8d), 2247.1423993239137d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 295979.1502080471d + "'", double3 == 295979.1502080471d);
    }

    @Test
    public void test05981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05981");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5592.441403851674d), (-2.471664179522527E9d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05982");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.005138283873363884d, (-1.015487449417205E8d), (-1.4855227054802647E10d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.006835893155468694d) + "'", double3 == (-0.006835893155468694d));
    }

    @Test
    public void test05983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05983");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.309693484849711d), (-26406.993606320168d), 0.019108774049942618d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1381757.0841450503d + "'", double3 == 1381757.0841450503d);
    }

    @Test
    public void test05984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05984");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3845594236562015E11d, 610.6717742902828d, 0.051754094399986086d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.6752654714596953E12d + "'", double3 == 2.6752654714596953E12d);
    }

    @Test
    public void test05985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05985");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7.218577656757598E-5d, (-1.8765772420390457E12d), (-75.33225042923146d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.491067545900461E10d) + "'", double3 == (-2.491067545900461E10d));
    }

    @Test
    public void test05986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05986");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.905255196226347E23d, 0.18932071331315758d, (-6.075006801426908E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1366662494278078E27d) + "'", double3 == (-1.1366662494278078E27d));
    }

    @Test
    public void test05987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05987");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(25.058534698933222d, (-85.36544808441977d), (-32.16059602649007d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.433517920264875d) + "'", double3 == (-3.433517920264875d));
    }

    @Test
    public void test05988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05988");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1282.1682354050427d), (-1193.0628697512193d), 1.7259885344907074E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.1625699634277086E-8d) + "'", double3 == (-5.1625699634277086E-8d));
    }

    @Test
    public void test05989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05989");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.1363415853798087d), (-4.1445130312798157E11d), (-8.207757272918785E15d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.0495073056718326E-5d) + "'", double3 == (-5.0495073056718326E-5d));
    }

    @Test
    public void test05990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05990");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5282846310233278d), 7.504986785569953E15d, 92.56364379175143d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.107920645879697E13d) + "'", double3 == (-8.107920645879697E13d));
    }

    @Test
    public void test05991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05991");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.821950305768511E-8d), (-1.0478259012122826d), 621.1016918522355d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0016870439361837462d + "'", double3 == 0.0016870439361837462d);
    }

    @Test
    public void test05992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05992");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-48.72822680118256d), 1.3142124542124545d, (-2.420426275262313E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.067505206287338E-6d + "'", double3 == 2.067505206287338E-6d);
    }

    @Test
    public void test05993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05993");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.8046316105070166d, (-1.52016650123837E11d), 757.7856488949959d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.00606398853439E8d + "'", double3 == 2.00606398853439E8d);
    }

    @Test
    public void test05994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05994");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.8354533699461755d), 6.191560275123741E7d, 30101.605597068716d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2056.887111454284d) + "'", double3 == (-2056.887111454284d));
    }

    @Test
    public void test05995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05995");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.05672342154368765d), (-1.2862521104683366E7d), 0.07735723043092034d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.6627432208093485E8d + "'", double3 == 1.6627432208093485E8d);
    }

    @Test
    public void test05996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05996");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-166187.67860869045d), (double) 1L, 1.8753501198696607d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-88617.41434193673d) + "'", double3 == (-88617.41434193673d));
    }

    @Test
    public void test05997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05997");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.0771850190680747E-8d, (-0.06381003452916503d), 20.872471222336255d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.00305713897608493d + "'", double3 == 0.00305713897608493d);
    }

    @Test
    public void test05998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05998");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(183299.3891781771d, (-275745.3948651282d), (-165.75236969763668d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2769.4613650513043d) + "'", double3 == (-2769.4613650513043d));
    }

    @Test
    public void test05999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05999");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 0, (-2.1762316319902968E-8d), 6.149027647970006E15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.5391475800385146E-24d + "'", double3 == 3.5391475800385146E-24d);
    }

    @Test
    public void test06000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test06000");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.758008474535696E11d, (-83.99557343262602d), (-9.658849832375534E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3890.741175806636d) + "'", double3 == (-3890.741175806636d));
    }
}

