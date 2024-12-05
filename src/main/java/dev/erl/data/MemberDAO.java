package dev.erl.data;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.sql.rowset.CachedRowSet;

import dev.erl.App;
import dev.erl.models.enums.CivilStatus;
import dev.erl.models.hr.Member;
import dev.sol.db.DBParam;
import dev.sol.db.DBService;
import dev.sol.db.DBType;

public class MemberDAO {
    public static String TABLE = "member";
    public static final DBService DB = App.DB_COOP;

   // private static final ObservableList<Office> officelist = App.COLLECTIONS_REGISTER.getList("OFFICE");

    private static Member data(CachedRowSet crs) {
        try {
            Integer memberID = crs.getInt("memberID");
            String Lname = crs.getString("Lname");
            String Fname = crs.getString("Fname");
            String Mname = crs.getString("Mname");
            String birthDate = crs.getString("DateofBirth");
            String birthplace = crs.getString("PlaceofBirth");
            // CivilStatus.valueOf(crs.getString("Status").toUpperCase().trim());
            String homeAddress = crs.getString("CurrentAddress");
            String occupation = crs.getString("Occupation");
            //Office office = Office.values(crs.getString("OfficeID"));
            double salary = crs.getDouble("Salary");
            String sourceofincome = crs.getString("SourceofIncome");
            String relative = crs.getString("NearestRelative");
            String relationship = crs.getString("Relationship");
            String dependent = crs.getString("Dependent");
            Integer stockshare = crs.getInt("StockShare");
            long stockamount = crs.getLong("StockAmount");
            long stockpaid = crs.getLong("StockPaid");
            long AmountPaid = crs.getLong("AmountPaid");
            Integer office = crs.getInt("OfficeID");
            CivilStatus civil_status = CivilStatus.values()[crs.getInt("Status")];
            // Office office = officelist.stream().filter(off -> {
            //     try {
            //         return off.getOfficeId().equals(crs.getString("OfficeID"));
            //     } catch (SQLException e) {
            //         e.printStackTrace();
            //     }
            //     return true;
            // }).findFirst().get();
            
            return new Member(memberID,
                    Lname,
                    Fname,
                    Mname,
                    birthDate,
                    birthplace,
                    civil_status,
                    homeAddress,
                    occupation,
                    office,
                    salary,
                    sourceofincome,
                    relative,
                    relationship,
                    dependent,
                    stockshare,
                    stockamount,
                    stockpaid,
                    AmountPaid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static DBParam[] paramlist(Member member) {
        List<DBParam> paramlist = new LinkedList<>();
        paramlist.add(new DBParam(DBType.NUMERIC, "memberID", member.getMemberID()));
        paramlist.add(new DBParam(DBType.TEXT, "Lname", member.getLname()));
        paramlist.add(new DBParam(DBType.TEXT, "Fname", member.getFname()));
        paramlist.add(new DBParam(DBType.TEXT, "Mname", member.getMname()));
        paramlist.add(new DBParam(DBType.TEXT, "DateofBirth", member.getBirthDate()));
        paramlist.add(new DBParam(DBType.TEXT, "PlaceofBirth", member.getBirthPlace()));
        paramlist.add(new DBParam(DBType.NUMERIC, "Status", member.getCivil_Status()));
        paramlist.add(new DBParam(DBType.TEXT, "CurrentAddress", member.getHomeAddress()));
        paramlist.add(new DBParam(DBType.TEXT, "Occupation", member.getOccupation()));
        paramlist.add(new DBParam(DBType.TEXT, "OfficeID", member.getOffice()));
        paramlist.add(new DBParam(DBType.DECIMAL, "Salary", member.getSalary()));
        paramlist.add(new DBParam(DBType.TEXT, "SourceofIncome", member.getSourceOfIncome()));
        paramlist.add(new DBParam(DBType.TEXT, "NearestRelative", member.getRelative()));
        paramlist.add(new DBParam(DBType.TEXT, "Relationship", member.getRelationship()));
        paramlist.add(new DBParam(DBType.TEXT, "Dependemt", member.getDependent()));
        paramlist.add(new DBParam(DBType.NUMERIC, "StockShare", member.getStockshare()));
        paramlist.add(new DBParam(DBType.DECIMAL, "StockAmount", member.getStockAmount()));
        paramlist.add(new DBParam(DBType.NUMERIC, "StockPaid", member.getStockPaid()));
        paramlist.add(new DBParam(DBType.DECIMAL, "AmountPaid", member.getAmountPaid()));
        // paramlist.add(new DBParam(Types.INTEGER, "Status",
        // CivilStatus.valueOf(member.getCivil_Status().toUpperCase()).ordinal()));

        return paramlist.toArray(new DBParam[0]);
    }

    public static List<Member> getMemberList() {
        CachedRowSet crs = DB.select_all(TABLE);
        List<Member> list = new LinkedList<>();

        try {
            while (crs.next()) {
                Member member = data(crs);
                if (member != null)
                    ;
                list.add(member);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        
        return list;
    }

    public static void insert(Member member) {
        DB.insert(TABLE, paramlist(member));
    }

    public static void delete(Member member) {
        DB.delete(TABLE, new DBParam(DBType.NUMERIC, "memberID", member.getMemberID()));
    }

}
