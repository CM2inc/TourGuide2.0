package myTourGuide;

import myTourGuide.dto.TourEntry;
import myTourGuide.service.ITourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class MyTourGuideController {

    @Autowired
    ITourService tourService;

    /**
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/")
    public String index() {
        TourEntry tourEntry = new TourEntry();
        tourEntry.setNotes("I did it");
        String notes = tourEntry.getNotes();
        tourEntry.setDate("Oct 10, 2022");
        String date = tourEntry.getDate();
        return "start";
    }

}
