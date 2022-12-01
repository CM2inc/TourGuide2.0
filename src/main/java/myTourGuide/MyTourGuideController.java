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
        tourEntry.setEntry("I completed my first entry");
        String entry = tourEntry.getEntry();
        tourEntry.setLocation("Cincinnati, OH");
        String location = tourEntry.getLocation();
        return "start";
    }

}
