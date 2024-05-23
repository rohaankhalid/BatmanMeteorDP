import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;

public class MeteorManagerTest {
    
    private MeteorManager meteorManager;

    @Before
    public void setUp() {
        meteorManager = new MeteorManager();
    }

    @Test
    public void testAddMeteor() {
        meteorManager.addMeteor(new Meteor("A", 10));
        meteorManager.addMeteor(new Meteor("B", 5));
        meteorManager.addMeteor(new Meteor("C", 15));
        meteorManager.addMeteor(new Meteor("D", 1));
        meteorManager.addMeteor(new Meteor("E", 20));

        assertEquals("Meteor{name='D', impactTime=1}", meteorManager.getNextMeteor().toString());
        assertEquals("Meteor{name='B', impactTime=5}", meteorManager.getNextMeteor().toString());
        assertEquals("Meteor{name='A', impactTime=10}", meteorManager.getNextMeteor().toString());
        assertEquals("Meteor{name='C', impactTime=15}", meteorManager.getNextMeteor().toString());
        assertEquals("Meteor{name='E', impactTime=20}", meteorManager.getNextMeteor().toString());
    }


    @Test
    public void testGetNextMeteor() {
        meteorManager.addMeteor(new Meteor("A", 10));
        meteorManager.addMeteor(new Meteor("B", 5));
        meteorManager.addMeteor(new Meteor("C", 15));
        meteorManager.addMeteor(new Meteor("D", 1));
        meteorManager.addMeteor(new Meteor("E", 20));
        assertEquals("Meteor{name='D', impactTime=1}", meteorManager.getNextMeteor().toString());
        assertEquals("Meteor{name='B', impactTime=5}", meteorManager.getNextMeteor().toString());
        assertEquals("Meteor{name='A', impactTime=10}", meteorManager.getNextMeteor().toString());
        assertEquals("Meteor{name='C', impactTime=15}", meteorManager.getNextMeteor().toString());
        assertEquals("Meteor{name='E', impactTime=20}", meteorManager.getNextMeteor().toString());
    }

    @Test
    public void testEmptyQueue() {
        assertEquals("[]", meteorManager.toString());
        assertThrows(IllegalStateException.class, () -> {
            meteorManager.getNextMeteor();
        });
    }

    @Test
    public void testAddNullMeteor() {
        assertThrows(IllegalArgumentException.class, () -> {
            meteorManager.addMeteor(null);
        });
    }
}