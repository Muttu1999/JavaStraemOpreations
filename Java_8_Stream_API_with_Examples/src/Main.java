import Java8StreamAPI.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static Java8StreamAPI.Main.getEmpList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


        public class Main {
            public static void main(String[] args) {

               /*// Filter Method
               // We will filter the employees list with gender as Female

                List<Employee> empList = getEmpList();
                empList.stream().filter(e -> e.getGender().equals("Female")).forEach(e -> System.out.println(e));*/



            /*//We will filter the employees list with newJoiner as True
                List<Employee> empList = getEmpList();
                empList.stream().filter(e -> e.getNewJoiner().equals("True")).forEach(e -> System.out.println(e));*/


               /*// Sort Method
                //We will sort the employee list by rating asc.

                List<Employee> empList = getEmpList();
                empList.stream()
                        .sorted(Comparator.comparing(Employee::getRating))
                        .forEach(e -> System.out.println(e));*/

                /*//We will sort the employee list by rating desc.
                List<Employee> empList = getEmpList();
                empList.stream()
                        .sorted(Comparator.comparing(Employee::getRating).reversed())
                        .forEach(e -> System.out.println(e));*/


                //We will sort the employee list by both rating and salary
                List<Employee> empList = getEmpList();

                empList.stream()
                        .sorted(Comparator.comparing(Employee::getSalary))
                        .sorted(Comparator.comparing(Employee::getRating))
                        .forEach(e -> System.out.println(e));

                /*Employee{empId='63-019-1110', firstName='Elroy', lastName='Baverstock', email='ebaverstock7@ehow.com', gender='Male', newJoiner='TRUE', salary=2510, rating=0}
                Employee{empId='59-385-1088', firstName='Zacharias', lastName='Schwerin', email='zchwerin@gmail.com', gender='Male', newJoiner='True', salary=101146, rating=0}
                Employee{empId='81-697-2363', firstName='Joete', lastName='Braybrooke', email='jbraybrooke6@prnewswire.com', gender='Male', newJoiner='TRUE', salary=128907, rating=0}
                Employee{empId='73-274-6476', firstName='Kyle', lastName='Frudd', email='kfrudd1@ovh.net', gender='Male', newJoiner='FALSE', salary=29310, rating=2}
                Employee{empId='85-939-9584', firstName='Axe', lastName='Gumb', email='agumb2@twitter.com', gender='Female', newJoiner='FALSE', salary=62291, rating=4}
                Employee{empId='08-180-8292', firstName='Robinet', lastName='Batterham', email='rbatterham3@last.fm', gender='Male', newJoiner='FALSE', salary=142439, rating=4}
                Employee{empId='66-708-5539', firstName='Tailor', lastName='Ridding', email='Ridding', gender='Female', newJoiner='FALSE', salary=152924, rating=4}
                Employee{empId='21-825-2623', firstName='Ulick', lastName='Burrel', email='uburrel4@google.ru', gender='Male', newJoiner='FALSE', salary=128764, rating=5}
*/



                //Match Method
                //
                //We will see all employees with salary more than 1000
                /*List<Employee> empList = getEmpList();
                boolean isSalary = empList.stream().allMatch(e -> e.getSalary() > 1000);
                System.out.println(isSalary);*/

                //true


                //Max Function
                //
                //We will retrieve employee with max salary

                /*List<Employee> empList = getEmpList();
                empList.stream()
                        .max(Comparator.comparing(Employee::getSalary))
                        .ifPresent(System.out::println);*/

                //Output
                /*Employee{empId='66-708-5539',
                        firstName='Tailor',
                        lastName='Ridding',
                        email='Ridding',
                        gender='Female',
                        newJoiner='FALSE',
                        salary=152924,
                        rating=4}*/


                //We will retrieve employee with max rating

                /*List<Employee> empList = getEmpList();
                empList.stream()
                        .max(Comparator.comparing(Employee::getRating))
                        .ifPresent(System.out::println);*/

                //Output

                /*Employee{empId='21-825-2623',
                        firstName='Ulick',
                        lastName='Burrel',
                        email='uburrel4@google.ru',
                        gender='Male',
                        newJoiner='FALSE',
                        salary=128764, rating=5}*/

                //Min Function
                //
                //We will retrieve employee with min salary

                /*List<Employee> empList = getEmpList();
                empList.stream()
                        .min(Comparator.comparing(Employee::getSalary))
                        .ifPresent(System.out::println);*/
                //output

                /*Employee{empId='63-019-1110',
                        firstName='Elroy',
                        lastName='Baverstock',
                        email='ebaverstock7@ehow.com',
                        gender='Male', newJoiner='TRUE',
                        salary=2510, rating=0}*/


        //We will retrieve employee with min rating

                /*List<Employee> empList = getEmpList();
                empList.stream()
                        .min(Comparator.comparing(Employee::getRating))
                        .ifPresent(System.out::println);*/

                //GroupBy Function
                //
                //We will group all our employees by Gender

                /*List<Employee> empList = getEmpList();
                Map<String, List<Employee>> employeesBygender = empList.stream()
                        .collect(Collectors.groupingBy(Employee::getGender));
                employeesBygender.forEach(((g,e)->{
                    System.out.println(g);
                    e.forEach(System.out::println);
                }));*/

                /*Conclusion

                We have gone through a few simple examples and If you’re interested in learning more about Java 8 streams, I recommend viewing the offical Stream Javadoc package documentation.

                        Hopefully this tutorial was helpful to you and you’ve enjoyed reading it.

                Happy coding..*/







            }


            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.

        }
