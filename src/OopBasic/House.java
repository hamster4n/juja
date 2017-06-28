package OopBasic;

import OopBasic.apartment.LivingApartment;
import OopBasic.staff.Cleaner;
import OopBasic.staff.Housemaid;

/**
 * Created by hamster on 22.06.2017.
 */
public class House {
    private Floor[] floors;
    private Cleaner[] cleaners; //TODO возможно убрать клинеров во Floor


    public House(int floorsCount, int apartmentsOnFloor) {
        NumberGenerator numbers = new NumberGenerator();

        cleaners = new Cleaner[floorsCount];

        floors = new Floor[floorsCount];
        for (int index = 0; index < floorsCount; index++) {
            floors[index] = new Floor(index + 1, apartmentsOnFloor, numbers);

        }
    }

    public void settle(Owner owner) {
        System.out.println("Try to settle " + owner.toString() + "\n");
        for (Floor floor: floors) {
            LivingApartment apartment = floor.getFreeApartment();
            if (apartment != null){
                apartment.addOwner(owner);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String result = "House: \n";
        for (Floor floor:floors) {
            result += floor.toString() + "\n";
        }
        return result;
    }

    public void addCleaner(Cleaner cleaner) {
        int floor = nextCleanerPlace();
        this.cleaners[floor] = cleaner;
        this.floors[floor].setCleaner(cleaner);
    }

    private int nextCleanerPlace() {
        for (int index = 0; index < cleaners.length; index++) {
            if (cleaners[index] == null){
                return index;
            }
        }
        throw new RuntimeException("No place for new cleaner!");
    }
}
