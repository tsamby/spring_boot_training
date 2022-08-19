package com.tsamby.roomwebapp.service;

import com.tsamby.roomwebapp.models.Position;
import com.tsamby.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {


    public static final List<StaffMember> staff = new ArrayList<>();

    static {

            staff.add(new StaffMember(
                    UUID.randomUUID().toString(),
                    "Novuyo",
                    "Tsambani",
                    Position.CONCIERGE)
                    );
            staff.add(new StaffMember(
                    UUID.randomUUID().toString(),
                    "Buhle",
                    "Tsambani",
                    Position.HOUSEKEEPING)
            );
            staff.add(new StaffMember(
                    UUID.randomUUID().toString(),
                    "Bongi",
                    "Tsambani",
                    Position.FRONT_DESK)
            );
            staff.add(new StaffMember(
                    UUID.randomUUID().toString(),
                    "Lizo",
                    "Tsambani",
                    Position.SECURITY)
            );

    }

    public List<StaffMember> getAllStaff(){
        return staff;
    }

}
