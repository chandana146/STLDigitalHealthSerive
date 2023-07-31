//package com.Health.StlHealth_Dev.Controllers;
//
//
//import com.Health.StlHealth_Dev.repositories.UserDetailsRepository;
//import com.Health.StlHealth_Dev.repositories.UserRepository;
//import com.Health.StlHealth_Dev.jwt.JwtUtills;
//import com.Health.StlHealth_Dev.Model.Cases;
//import com.Health.StlHealth_Dev.Model.User;
//import com.Health.StlHealth_Dev.Model.UserDetails;
//import com.Health.StlHealth_Dev.security.UserLoginDetails;
//import com.Health.StlHealth_Dev.security.UserLoginDetailsService;
//import io.jsonwebtoken.Claims;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.web.bind.annotation.*;
//
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Locale;
//import java.util.Optional;
//
//@RestController
//@CrossOrigin("http://localhost:4200")
//@RequestMapping("/User")
//public class UserController {
//
//    /*-------------------------------- CREATING USER REPO VIA DEPENDENCY INJECTION ------------------------------*/
//    @Autowired(required=false)
//    UserRepository USER_REPO;
//    /*------------------------------- CREATING USER DETAILS REPO VIA DEPENDENCY INJECTION -----------------------*/
//    @Autowired(required=false)
//    UserDetailsRepository USER_DETAILS_REPO;
////
////   
////
////    /*------------------------------- CREATING AUTHENTICATION MANAGER VIA DEPENDENCY INJECTION ---------------------*/
////    @Autowired(required=false)
////    AuthenticationManager authenticationManager;
////
////
////    /*----------------------------- CREATING USER LOGIN DETAILS SERVICE VIA DEPENDENCY INJECTION ----------------------*/
////    @Autowired(required=false)
////    UserLoginDetailsService userLoginDetailsService;
////
////    /*----------------------------- CREATING JWT UTILS VIA DEPENDENCY INJECTION --------------------------------*/
////    @Autowired(required=false)
////    JwtUtills jwtUtills;
////
////    /*------------------------------- METHOD FOR USER LOGIN -----------------------------*/
////    @PostMapping("/login")
////    public String login(@RequestBody  User LOGIN_USER){
////        try {
////            Authentication authentication=authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(LOGIN_USER.getUNIQUE_ID(),LOGIN_USER.getPASSWORD()));
////            if(authentication.isAuthenticated()){
////                String USER_STATUS= USER_REPO.getUserStatusByUniqueId(LOGIN_USER.getUNIQUE_ID());
////                if(USER_STATUS.equals("active")){
////                    UserLoginDetails userLoginDetails=(UserLoginDetails) userLoginDetailsService.loadUserByUsername(LOGIN_USER.getUNIQUE_ID());
////                    String TOKEN=jwtUtills.generateJwtToken(userLoginDetails);
////                    return TOKEN;
////                }else{
////                    return "USER DELETED";
////                }
////
////            } else{
////                return "LOGIN FAILED";
////            }
////        }catch (Exception X){
////            X.printStackTrace();
////            return "LOGIN ERROR";
////        }
////    }
////
////
////    /*------------------------------ METHOD FOR CREATE USER ---------------------------*/
////    @PostMapping("/register")
////    public String register_user(@RequestBody User USER){
////        try{
////            /*------------------------ GET CURRENT DATE & TIME ----------------------*/
////            Date CREATED_AT=new Date();
////            SimpleDateFormat DATE_FORMATTER=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////            USER.setCREATED_DATE(DATE_FORMATTER.parse(DATE_FORMATTER.format(CREATED_AT)));
////            USER.setUPDATED_DATE(DATE_FORMATTER.parse(DATE_FORMATTER.format(CREATED_AT)));
////            /*--------------------------- ENCODING USER PASSWORD ---------------------*/
////            String ENCODE_PASSWORD=new BCryptPasswordEncoder().encode(USER.getPASSWORD());
////            USER.setPASSWORD(ENCODE_PASSWORD);
////            /*---------------------------- SAVE USER DATA TO DATABASE ---------------------------*/
////            USER.setROLE_ID(4);
////            User U=USER_REPO.save(USER);
////            return U.getUSER_ID().toString();
////        }catch(Exception X){
////            X.printStackTrace();
////            return null;
////        }
////
////    }
////    @PostMapping("/add_usr_details")
////    public String add_user_data(@RequestBody UserDetails USER_DETAILS){
////
////        try{
////            /*------------------------ GET CURRENT DATE & TIME ----------------------*/
////            Date CREATED_AT=new Date();
////            SimpleDateFormat DATE_FORMATTER=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////            /*------------------------------ GENERATING UNIQUE REGISTRATION NO ---------------------*/
////            String REG_NO=Long.toHexString(Double.doubleToLongBits(Math.random())).toUpperCase(Locale.ROOT).substring(0,8);
////            /*------------------------------ SET DATA TO USER DETAILS -----------------------------*/
////            USER_DETAILS.setREG_NUMBER(REG_NO);
////            USER_DETAILS.setCREATED_DATE(DATE_FORMATTER.parse(DATE_FORMATTER.format(CREATED_AT)));
////            USER_DETAILS.setUPDATED_DATE(DATE_FORMATTER.parse(DATE_FORMATTER.format(CREATED_AT)));
////            /*-------------------------------- SAVE USER DETAILS TO DATABASE ---------------------*/
////            System.out.println(USER_DETAILS);
////            USER_DETAILS_REPO.save(USER_DETAILS);
////            return "USER DETAILS CREATED" ;
////        }catch(Exception x){
////           System.out.println(x.toString());
////           return null;
////        }
////
////    }
////
////    /*---------------------------- METHOD FOR LOGOUT USER ------------------------------*/
////    @PostMapping("/logout")
////    public String logOut(@RequestHeader("Authorization") String token){
////        try{
////            String RAW_TOKEN=token.substring(7);
////            String UNIQUE_ID=jwtUtills.getUniqueIdFromToken(RAW_TOKEN);
////            UserLoginDetails userLoginDetails=(UserLoginDetails) userLoginDetailsService.loadUserByUsername(UNIQUE_ID);
////            if(jwtUtills.validateJwtToken(RAW_TOKEN,userLoginDetails)){
////                String EXP_TOKEN= jwtUtills.expireToken(RAW_TOKEN);
////                return EXP_TOKEN;
////            }
////            return "TOKEN ALREADY EXPIRED";
////        }catch (Exception x){
////            return "TOKEN ALREADY EXPIRED";
////        }
////
////
////    }
////
////    /*--------------------------- METHOD FOR RESET PASSWORD -------------------------*/
////    @PostMapping("/resetPass")
////    public String resetPassword(@RequestHeader("Authorization") String TOKEN){
////        try{
////            String RAW_TOKEN=TOKEN.substring(7);
////            String UNIQUE_ID=jwtUtills.getUniqueIdFromToken(RAW_TOKEN);
////            String NEW_PASSWORD=new BCryptPasswordEncoder().encode("12345");
////            USER_REPO.resetPassword(NEW_PASSWORD,UNIQUE_ID);
////            return "PASSWORD RESET SUCCESSFUL\n NEW PASSWORD: 12345";
////        }catch(Exception X){
////            X.printStackTrace();
////            return "RESET PASSWORD PROCESSING FAILED";
////        }
////    }
////
////    /*----------------------------------- METHOD FOR VIEW LOGGED IN USER ----------------------------------*/
////    @GetMapping("/view_user")
////    public UserDetails viewUser(@RequestHeader("Authorization") String TOKEN){
////        String RAW_TOKEN=TOKEN.substring(7);
////        String UNIQUE_ID=jwtUtills.getUniqueIdFromToken(RAW_TOKEN);
////        Long USER_ID= USER_REPO.findUserIdByUniqueId(UNIQUE_ID);
////        UserDetails userDetails=USER_DETAILS_REPO.findByUserId(USER_ID);
////        return userDetails;
////    }
////
////    /*----------------------------------- METHOD FOR VIEW LOGGED IN USER BY ID ----------------------------------*/
////    @GetMapping("/view_user/{id}")
////    public UserDetails viewUserById(@PathVariable("id") Long ID){
////        UserDetails userDetails=USER_DETAILS_REPO.findByUserId(ID);
////        return userDetails;
////    }
////
////
////    /*----------------------------------- METHOD FOR EDIT USER BY ID ----------------------------------*/
////    @RequestMapping(value="/edit_user/{id}",method = RequestMethod.PUT)
////    public UserDetails editUser(@PathVariable String id,UserDetails UPDATED_USER_DETAILS){
////            UPDATED_USER_DETAILS.setUSER_ID(Long.parseLong(id));
////            return UPDATED_USER_DETAILS;
////    }
////
////
////    /*----------------------------------- METHOD FOR DELETE  USER  BY ID ----------------------------------*/
////    @DeleteMapping("/delete_user/{id}")
////    public String deleteUser(@PathVariable("id") String UID){
////    	USER_REPO.updateUserStatusByUserId(0,UID);
////        USER_DETAILS_REPO.updateUserStatusByUserId(0,UID);
////        return "USER DELETED";
////    }
//    @GetMapping("/view_all_userdetails")
//	public ResponseEntity<List<UserDetails>> view_userdetails() {
//try {
//			List<UserDetails> UserList= new ArrayList<>();
//			USER_DETAILS_REPO.findAll().forEach(UserList::add);
//			if(UserList.isEmpty()) {
//				return new ResponseEntity<List<UserDetails>>(HttpStatus.NO_CONTENT);
//			}
//			return new ResponseEntity<List<UserDetails>>(UserList,HttpStatus.OK);
//		} catch(Exception ex) {
//			return new ResponseEntity<List<UserDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//    @GetMapping("/view_Userdetails/{id}")
//	public ResponseEntity<UserDetails> getusersById(@PathVariable Long id) {
//		Optional<UserDetails> UserData=USER_DETAILS_REPO.findById(id);
//		if(UserData.isPresent()) {
//			return new ResponseEntity<>(UserData.get(),HttpStatus.OK);
//		}
//		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	}
//    @PutMapping("/edit_userdetails/{id}")
//	public ResponseEntity<UserDetails> updateUserById(@PathVariable Long USER_ID, @RequestBody UserDetails newUserData) {
//		Optional<UserDetails>OldUserData=USER_DETAILS_REPO.findByUserId(USER_ID);
//		if(OldUserData.isPresent()) {
//			UserDetails updatedUserData =	OldUserData.get();
//		updatedUserData.setrole_id(newUserData.getrole_id());
//		updatedUserData.setaadhar_card_no(newUserData.getaadhar_card_no());
//		updatedUserData.setuser_image(newUserData.getuser_image());
//		updatedUserData.setfirst_name(newUserData.getfirst_name());
//		updatedUserData.setlast_name(newUserData.getlast_name());
//		updatedUserData.setcreated_date(newUserData.getcreated_date());
//		updatedUserData.setwhatsapp_no(newUserData.getwhatsapp_no());
//		updatedUserData.setage(newUserData.getage());
//		
//		UserDetails CasesObj=USER_DETAILS_REPO.save(updatedUserData);
//		return new ResponseEntity<>(CasesObj,HttpStatus.OK);
//		}
//		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	}
//	@DeleteMapping("/delete_userdetails/{id}")
//	public ResponseEntity<HttpStatus> deleteuserById(@PathVariable Long id) {
//		USER_DETAILS_REPO.deleteById(id);
//		return new ResponseEntity<>(HttpStatus.OK);
//	}
//}
