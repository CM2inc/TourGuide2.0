package myTourGuide.service;

import myTourGuide.dto.TourEntry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TourServiceStub implements ITourService {
   /*@Override
    public void save(JournalEntry journalEntry) {

    }
    @Override
   public List<JournalEntry> fetchAll() {
        return null;
    } */

    List<TourEntry> allTourEntrys = new ArrayList<TourEntry>();

    @Override
    public TourEntry save(TourEntry tourEntry) {
        allTourEntrys.add(tourEntry);
        return tourEntry;
    }

    @Override
    public List<TourEntry> fetchAll() {
        return allTourEntrys;
    }


    /*@Override
    public JournalEntry fetch() {
        return null;
    } */

}
