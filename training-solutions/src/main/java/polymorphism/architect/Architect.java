package polymorphism.architect;

public class Architect {
    public static void main(String[] args) {
        Plan planS1 = new SketchPlan(135, "Családi ház");
        System.out.println(planS1.getPagesOfDocumentation());
        Plan planP1 = new PermitPlan(135, "Családi ház", "Gipsz Jakab", "Budapest, Fő utca 3.");
        System.out.println(planP1.getPagesOfDocumentation());
        Plan planC1 = new ConstructionPlan(135, "Családi ház", "Gipsz Jakab", "Budapest, Fő utca 3.", 70);
        System.out.println(planC1.getPagesOfDocumentation());
        System.out.println();

        SketchPlan planS2 = new SketchPlan(135, "Családi ház");
        System.out.println(planS2.getPagesOfDocumentation());
        System.out.println(planS2.getTitle());
        SketchPlan planP2 = new PermitPlan(135, "Családi ház", "Gipsz Jakab", "Budapest, Fő utca 3.");
        System.out.println(planP2.getPagesOfDocumentation());
        System.out.println(planP2.getTitle());
        SketchPlan planC2 = new ConstructionPlan(135, "Családi ház", "Gipsz Jakab", "Budapest, Fő utca 3.", 70);
        System.out.println(planC2.getPagesOfDocumentation());
        System.out.println(planC2.getTitle());
        System.out.println();

        Header planP3 = new PermitPlan(135, "Családi ház", "Gipsz Jakab", "Budapest, Fő utca 3.");
        System.out.println(planP3.getNameOfClient());
        System.out.println(planP3.getAddressOfBuilding());
        Header planC3 = new ConstructionPlan(135, "Családi ház", "Gipsz Jakab", "Budapest, Fő utca 3.", 70);
        System.out.println(planC3.getNameOfClient());
        System.out.println(planC3.getAddressOfBuilding());
        System.out.println();

        PermitPlan planP4 = new PermitPlan(135, "Családi ház", "Gipsz Jakab", "Budapest, Fő utca 3.");
        System.out.println(planP4.getPagesOfDocumentation());
        System.out.println(planP4.getTitle());
        System.out.println(planP4.getNameOfClient());
        System.out.println(planP4.getAddressOfBuilding());
        System.out.println(planP4.getHeader());
        PermitPlan planC4 = new ConstructionPlan(135, "Családi ház", "Gipsz Jakab", "Budapest, Fő utca 3.", 70);
        System.out.println(planC4.getPagesOfDocumentation());
        System.out.println(planC4.getTitle());
        System.out.println(planC4.getNameOfClient());
        System.out.println(planC4.getAddressOfBuilding());
        System.out.println(planC4.getHeader());
        System.out.println();

        ConstructionPlan planC5 = new ConstructionPlan(135, "Családi ház", "Gipsz Jakab", "Budapest, Fő utca 3.", 70);
        System.out.println(planC5.getPagesOfDocumentation());
        System.out.println(planC5.getTitle());
        System.out.println(planC5.getNameOfClient());
        System.out.println(planC5.getAddressOfBuilding());
        System.out.println(planC5.getHeader());
        System.out.println(planC5.getSheetsOfConstructionDrawings());
    }
}
