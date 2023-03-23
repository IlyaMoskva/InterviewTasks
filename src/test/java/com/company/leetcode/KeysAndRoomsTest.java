package  com.company.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KeysAndRoomsTest {

    @Test
    void cantVisitAllRooms() {
        List<List<Integer>> rooms = new ArrayList<>(4);
        rooms.add(new ArrayList<>());
        rooms.add(new ArrayList<>());
        rooms.add(new ArrayList<>());
        rooms.add(new ArrayList<>());
        rooms.get(0).add(1);
        rooms.get(0).add(3);
        rooms.get(1).add(3);
        rooms.get(1).add(0);
        rooms.get(1).add(1);
        rooms.get(2).add(2);
        rooms.get(3).add(0);

        assertFalse(new KeysAndRooms().canVisitAllRooms(rooms));
    }

    @Test
    void canVisitAllRooms() {
        List<List<Integer>> rooms = new ArrayList<>(4);
        rooms.add(new ArrayList<>());
        rooms.add(new ArrayList<>());
        rooms.add(new ArrayList<>());
        rooms.add(new ArrayList<>());
        rooms.get(0).add(1);
        rooms.get(1).add(2);
        rooms.get(2).add(3);
        rooms.get(3).add(0);

        assertTrue(new KeysAndRooms().canVisitAllRooms(rooms));
    }
}