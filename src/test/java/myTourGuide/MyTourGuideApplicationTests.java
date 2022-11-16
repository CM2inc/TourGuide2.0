package myTourGuide;

import myTourGuide.dto.TourEntry;
import myTourGuide.service.ITourService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class MyTourGuideApplicationTests {

    @Autowired
    private ITourService tourService;
    private TourEntry tourEntry;

    @Test
    void contextLoads() {
    }

    /**
     * Validate that the DTO properties can be set and retrieved.
     */
    @Test
    void verifyTourEntryProperties() {
        String entry =  "I am testing a new entry";
        String location = "Cincinnati";

        TourEntry tourEntry1 = new TourEntry();
        tourEntry.setEntry(entry);
        assertEquals(entry, tourEntry.getEntry());

        tourEntry.setLocation(location);
        assertEquals(location, tourEntry.getLocation());
    }

    /**
     * Validate that the JournalService can save and return Journal Entries.
     */
    @Test
    void verifyAddAndRemoveJournalEntries() {
        String entry =  "My first entry!";
        String location = "Cincinnati";

        TourEntry journalEntry = new TourEntry();
        tourEntry.setEntry(entry);
        tourEntry.setLocation(location);

        tourService.save(tourEntry);

        List<TourEntry> tourEntries = tourService.fetchAll();
        boolean tourEntryPresent = false;
        for (TourEntry je : tourEntries) {
            if (je.getEntry().equals(entry) && je.getLocation().equals(location)) {
                tourEntryPresent = true;
                break;
            }
        }
        assertTrue(tourEntryPresent);

    }

}
