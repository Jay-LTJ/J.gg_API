package com.example.J.gg_API;

import jakarta.persistence.*;

@Entity
@Table(name = "riftstats")
public class ChampionStats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int statId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "championId", nullable = false)
    private Champion champion;

    @Column(name = "flathp")
    private int flatHP;

    @Column(name = "percenthp")
    private int percentHP;

    @Column(name = "perlevelhp")
    private int perLevelHP;

    @Column(name = "percentlevelhp")
    private int PercentLevelHP;

    @Column(name = "flathpregen")
    private int flatHpRegen;

    @Column(name = "percenthpregen")
    private int percentHpRegen;

    @Column(name = "perlevelhpregen")
    private int perLevelHpRegen;

    @Column(name = "percentlevelhpregen")
    private int PercentLevelHpRegen;

    @Column(name = "flatmana")
    private int flatMana;

    @Column(name = "percentmana")
    private int percentMana;

    @Column(name = "perlevelmana")
    private int perLevelMana;

    @Column(name = "percentlevelmana")
    private int PercentLevelMana;

    @Column(name = "flatmanaregen")
    private int flatManaRegen;

    @Column(name = "percentmanaregen")
    private int percentManaRegen;

    @Column(name = "perlevelmanaregen")
    private int perLevelManaRegen;

    @Column(name = "percentlevelmanaregen")
    private int PercentLevelManaRegen;

    @Column(name = "flatarmour")
    private int flatArmour;

    @Column(name = "percentarmour")
    private int percentArmour;

    @Column(name = "perlevelarmour")
    private int perLevelArmour;

    @Column(name = "percentlevelarmour")
    private int PercentLevelArmour;

    @Column(name = "flatmagicresistance")
    private int flatMagicResistance;

    @Column(name = "percentmagicresistance")
    private int percentMagicResistance;

    @Column(name = "perlevelmagicresistance")
    private int perLevelMagicResistance;

    @Column(name = "percentlevelmagicresistance")
    private int PercentLevelMagicResistance;

    @Column(name = "flatattackdamage")
    private int flatAttackDamage;

    @Column(name = "percentattackdamage")
    private int percentAttackDamage;

    @Column(name = "perlevelattackdamage")
    private int perLevelAttackDamage;

    @Column(name = "percentlevelattackdamage")
    private int PercentLevelAttackDamage;

    @Column(name = "flatmovemenetspeed")
    private int flatMovementSpeed;

    @Column(name = "percentmovemenetspeed")
    private int percentMovementSpeed;

    @Column(name = "perlevelmovemenetspeed")
    private int perLevelMovementSpeed;

    @Column(name = "percentlevelmovemenetspeed")
    private int PercentLevelMovementSpeed;

    @Column(name = "flatcritdamage")
    private int flatCritDamage;

    @Column(name = "percentcritdamage")
    private int percentCritDamage;

    @Column(name = "perlevelcritdamage")
    private int perLevelCritDamage;

    @Column(name = "percentlevelcritdamage")
    private int PercentLevelCritDamage;

    @Column(name = "flatcritdamagemod")
    private int flatCritDamageMod;

    @Column(name = "percentcritdamagemod")
    private int percentCritDamageMod;

    @Column(name = "perlevelcritdamagemod")
    private int perLevelCritDamageMod;

    @Column(name = "percentlevelcritdamagemod")
    private int PercentLevelCritDamageMod;

    @Column(name = "flatattackspeed")
    private int flatAttackSpeed;

    @Column(name = "percentattackspeed")
    private int percentAttackSpeed;

    @Column(name = "perlevelattackspeed")
    private int perLevelAttackSpeed;

    @Column(name = "percentlevelattackspeed")
    private int PercentLevelAttackSpeed;

    @Column(name = "flatattackspeedratio")
    private int flatAttackSpeedRatio;

    @Column(name = "percentattackspeedratio")
    private int percentAttackSpeedRatio;

    @Column(name = "perlevelattackspeedratio")
    private int perLevelAttackSpeedRatio;

    @Column(name = "percentlevelattackspeedratio")
    private int PercentLevelAttackSpeedRatio;

    @Column(name = "flatattackrange")
    private int flatAttackRange;

    @Column(name = "percentattackrange")
    private int percentAttackRange;

    @Column(name = "perlevelattackrange")
    private int perLevelAttackRange;

    @Column(name = "percentlevelattackrange")
    private int PercentLevelAttackRange;

    public ChampionStats( int flatHP, int percentHP, int perLevelHP, int percentLevelHP, int flatHpRegen, int percentHpRegen, int perLevelHpRegen, int percentLevelHpRegen, int flatMana, int percentMana, int percentLevelMana, int perLevelMana, int flatManaRegen, int percentManaRegen, int perLevelManaRegen, int percentLevelManaRegen, int flatArmour, int percentArmour, int perLevelArmour, int percentLevelArmour, int flatMagicResistance, int percentMagicResistance, int perLevelMagicResistance, int percentLevelMagicResistance, int flatAttackDamage, int percentAttackDamage, int perLevelAttackDamage, int percentLevelAttackDamage, int flatMovementSpeed, int perLevelMovementSpeed, int percentMovementSpeed, int percentLevelMovementSpeed, int flatCritDamage, int percentCritDamage, int perLevelCritDamage, int percentLevelCritDamage, int flatCritDamageMod, int percentCritDamageMod, int perLevelCritDamageMod, int percentLevelCritDamageMod, int flatAttackSpeed, int percentAttackSpeed, int perLevelAttackSpeed, int percentLevelAttackSpeed, int flatAttackSpeedRatio, int percentAttackSpeedRatio, int perLevelAttackSpeedRatio, int percentLevelAttackSpeedRatio, int flatAttackRange, int percentAttackRange, int perLevelAttackRange, int percentLevelAttackRange) {

        this.flatHP = flatHP;
        this.percentHP = percentHP;
        this.perLevelHP = perLevelHP;
        PercentLevelHP = percentLevelHP;
        this.flatHpRegen = flatHpRegen;
        this.percentHpRegen = percentHpRegen;
        this.perLevelHpRegen = perLevelHpRegen;
        PercentLevelHpRegen = percentLevelHpRegen;
        this.flatMana = flatMana;
        this.percentMana = percentMana;
        PercentLevelMana = percentLevelMana;
        this.perLevelMana = perLevelMana;
        this.flatManaRegen = flatManaRegen;
        this.percentManaRegen = percentManaRegen;
        this.perLevelManaRegen = perLevelManaRegen;
        PercentLevelManaRegen = percentLevelManaRegen;
        this.flatArmour = flatArmour;
        this.percentArmour = percentArmour;
        this.perLevelArmour = perLevelArmour;
        PercentLevelArmour = percentLevelArmour;
        this.flatMagicResistance = flatMagicResistance;
        this.percentMagicResistance = percentMagicResistance;
        this.perLevelMagicResistance = perLevelMagicResistance;
        PercentLevelMagicResistance = percentLevelMagicResistance;
        this.flatAttackDamage = flatAttackDamage;
        this.percentAttackDamage = percentAttackDamage;
        this.perLevelAttackDamage = perLevelAttackDamage;
        PercentLevelAttackDamage = percentLevelAttackDamage;
        this.flatMovementSpeed = flatMovementSpeed;
        this.perLevelMovementSpeed = perLevelMovementSpeed;
        this.percentMovementSpeed = percentMovementSpeed;
        PercentLevelMovementSpeed = percentLevelMovementSpeed;
        this.flatCritDamage = flatCritDamage;
        this.percentCritDamage = percentCritDamage;
        this.perLevelCritDamage = perLevelCritDamage;
        PercentLevelCritDamage = percentLevelCritDamage;
        this.flatCritDamageMod = flatCritDamageMod;
        this.percentCritDamageMod = percentCritDamageMod;
        this.perLevelCritDamageMod = perLevelCritDamageMod;
        PercentLevelCritDamageMod = percentLevelCritDamageMod;
        this.flatAttackSpeed = flatAttackSpeed;
        this.percentAttackSpeed = percentAttackSpeed;
        this.perLevelAttackSpeed = perLevelAttackSpeed;
        PercentLevelAttackSpeed = percentLevelAttackSpeed;
        this.flatAttackSpeedRatio = flatAttackSpeedRatio;
        this.percentAttackSpeedRatio = percentAttackSpeedRatio;
        this.perLevelAttackSpeedRatio = perLevelAttackSpeedRatio;
        PercentLevelAttackSpeedRatio = percentLevelAttackSpeedRatio;
        this.flatAttackRange = flatAttackRange;
        this.percentAttackRange = percentAttackRange;
        this.perLevelAttackRange = perLevelAttackRange;
        PercentLevelAttackRange = percentLevelAttackRange;
    }

    @Override
    public String toString() {
        return "ChampionStats{" +
                "championName=" + champion.getChampionName() +
                ", flatHP=" + flatHP +
                ", percentHP=" + percentHP +
                ", perLevelHP=" + perLevelHP +
                ", PercentLevelHP=" + PercentLevelHP +
                ", flatHpRegen=" + flatHpRegen +
                ", percentHpRegen=" + percentHpRegen +
                ", perLevelHpRegen=" + perLevelHpRegen +
                ", PercentLevelHpRegen=" + PercentLevelHpRegen +
                ", flatMana=" + flatMana +
                ", percentMana=" + percentMana +
                ", perLevelMana=" + perLevelMana +
                ", PercentLevelMana=" + PercentLevelMana +
                ", flatManaRegen=" + flatManaRegen +
                ", percentManaRegen=" + percentManaRegen +
                ", perLevelManaRegen=" + perLevelManaRegen +
                ", PercentLevelManaRegen=" + PercentLevelManaRegen +
                ", flatArmour=" + flatArmour +
                ", percentArmour=" + percentArmour +
                ", perLevelArmour=" + perLevelArmour +
                ", PercentLevelArmour=" + PercentLevelArmour +
                ", flatMagicResistance=" + flatMagicResistance +
                ", percentMagicResistance=" + percentMagicResistance +
                ", perLevelMagicResistance=" + perLevelMagicResistance +
                ", PercentLevelMagicResistance=" + PercentLevelMagicResistance +
                ", flatAttackDamage=" + flatAttackDamage +
                ", percentAttackDamage=" + percentAttackDamage +
                ", perLevelAttackDamage=" + perLevelAttackDamage +
                ", PercentLevelAttackDamage=" + PercentLevelAttackDamage +
                ", flatMovementSpeed=" + flatMovementSpeed +
                ", percentMovementSpeed=" + percentMovementSpeed +
                ", perLevelMovementSpeed=" + perLevelMovementSpeed +
                ", PercentLevelMovementSpeed=" + PercentLevelMovementSpeed +
                ", flatCritDamage=" + flatCritDamage +
                ", percentCritDamage=" + percentCritDamage +
                ", perLevelCritDamage=" + perLevelCritDamage +
                ", PercentLevelCritDamage=" + PercentLevelCritDamage +
                ", flatCritDamageMod=" + flatCritDamageMod +
                ", percentCritDamageMod=" + percentCritDamageMod +
                ", perLevelCritDamageMod=" + perLevelCritDamageMod +
                ", PercentLevelCritDamageMod=" + PercentLevelCritDamageMod +
                ", flatAttackSpeed=" + flatAttackSpeed +
                ", percentAttackSpeed=" + percentAttackSpeed +
                ", perLevelAttackSpeed=" + perLevelAttackSpeed +
                ", PercentLevelAttackSpeed=" + PercentLevelAttackSpeed +
                ", flatAttackSpeedRatio=" + flatAttackSpeedRatio +
                ", percentAttackSpeedRatio=" + percentAttackSpeedRatio +
                ", perLevelAttackSpeedRatio=" + perLevelAttackSpeedRatio +
                ", PercentLevelAttackSpeedRatio=" + PercentLevelAttackSpeedRatio +
                ", flatAttackRange=" + flatAttackRange +
                ", percentAttackRange=" + percentAttackRange +
                ", perLevelAttackRange=" + perLevelAttackRange +
                ", PercentLevelAttackRange=" + PercentLevelAttackRange +
                '}';
    }

    public int getFlatHP() {
        return flatHP;
    }

    public void setFlatHP(int flatHP) {
        this.flatHP = flatHP;
    }

    public int getChampionId() {
        return champion.getChampionId();
    }

    public int getPercentHP() {
        return percentHP;
    }

    public void setPercentHP(int percentHP) {
        this.percentHP = percentHP;
    }

    public int getPerLevelHP() {
        return perLevelHP;
    }

    public void setPerLevelHP(int perLevelHP) {
        this.perLevelHP = perLevelHP;
    }

    public int getFlatHpRegen() {
        return flatHpRegen;
    }

    public void setFlatHpRegen(int flatHpRegen) {
        this.flatHpRegen = flatHpRegen;
    }

    public int getPercentLevelHP() {
        return PercentLevelHP;
    }

    public void setPercentLevelHP(int percentLevelHP) {
        PercentLevelHP = percentLevelHP;
    }

    public int getPercentHpRegen() {
        return percentHpRegen;
    }

    public void setPercentHpRegen(int percentHpRegen) {
        this.percentHpRegen = percentHpRegen;
    }

    public int getPerLevelHpRegen() {
        return perLevelHpRegen;
    }

    public void setPerLevelHpRegen(int perLevelHpRegen) {
        this.perLevelHpRegen = perLevelHpRegen;
    }

    public int getPercentLevelHpRegen() {
        return PercentLevelHpRegen;
    }

    public void setPercentLevelHpRegen(int percentLevelHpRegen) {
        PercentLevelHpRegen = percentLevelHpRegen;
    }

    public int getFlatMana() {
        return flatMana;
    }

    public void setFlatMana(int flatMana) {
        this.flatMana = flatMana;
    }

    public int getPercentMana() {
        return percentMana;
    }

    public void setPercentMana(int percentMana) {
        this.percentMana = percentMana;
    }

    public int getPerLevelMana() {
        return perLevelMana;
    }

    public void setPerLevelMana(int perLevelMana) {
        this.perLevelMana = perLevelMana;
    }

    public int getPercentLevelMana() {
        return PercentLevelMana;
    }

    public void setPercentLevelMana(int percentLevelMana) {
        PercentLevelMana = percentLevelMana;
    }

    public int getFlatManaRegen() {
        return flatManaRegen;
    }

    public void setFlatManaRegen(int flatManaRegen) {
        this.flatManaRegen = flatManaRegen;
    }

    public int getPercentManaRegen() {
        return percentManaRegen;
    }

    public void setPercentManaRegen(int percentManaRegen) {
        this.percentManaRegen = percentManaRegen;
    }

    public int getPerLevelManaRegen() {
        return perLevelManaRegen;
    }

    public void setPerLevelManaRegen(int perLevelManaRegen) {
        this.perLevelManaRegen = perLevelManaRegen;
    }

    public int getPercentLevelManaRegen() {
        return PercentLevelManaRegen;
    }

    public void setPercentLevelManaRegen(int percentLevelManaRegen) {
        PercentLevelManaRegen = percentLevelManaRegen;
    }

    public int getFlatArmour() {
        return flatArmour;
    }

    public void setFlatArmour(int flatArmour) {
        this.flatArmour = flatArmour;
    }

    public int getPercentArmour() {
        return percentArmour;
    }

    public void setPercentArmour(int percentArmour) {
        this.percentArmour = percentArmour;
    }

    public int getPerLevelArmour() {
        return perLevelArmour;
    }

    public void setPerLevelArmour(int perLevelArmour) {
        this.perLevelArmour = perLevelArmour;
    }

    public int getFlatMagicResistance() {
        return flatMagicResistance;
    }

    public void setFlatMagicResistance(int flatMagicResistance) {
        this.flatMagicResistance = flatMagicResistance;
    }

    public int getPercentLevelArmour() {
        return PercentLevelArmour;
    }

    public void setPercentLevelArmour(int percentLevelArmour) {
        PercentLevelArmour = percentLevelArmour;
    }

    public int getPercentMagicResistance() {
        return percentMagicResistance;
    }

    public void setPercentMagicResistance(int percentMagicResistance) {
        this.percentMagicResistance = percentMagicResistance;
    }

    public int getPerLevelMagicResistance() {
        return perLevelMagicResistance;
    }

    public void setPerLevelMagicResistance(int perLevelMagicResistance) {
        this.perLevelMagicResistance = perLevelMagicResistance;
    }

    public int getPercentLevelMagicResistance() {
        return PercentLevelMagicResistance;
    }

    public void setPercentLevelMagicResistance(int percentLevelMagicResistance) {
        PercentLevelMagicResistance = percentLevelMagicResistance;
    }

    public int getFlatAttackDamage() {
        return flatAttackDamage;
    }

    public void setFlatAttackDamage(int flatAttackDamage) {
        this.flatAttackDamage = flatAttackDamage;
    }

    public int getPercentAttackDamage() {
        return percentAttackDamage;
    }

    public void setPercentAttackDamage(int percentAttackDamage) {
        this.percentAttackDamage = percentAttackDamage;
    }

    public int getPerLevelAttackDamage() {
        return perLevelAttackDamage;
    }

    public void setPerLevelAttackDamage(int perLevelAttackDamage) {
        this.perLevelAttackDamage = perLevelAttackDamage;
    }

    public int getPercentLevelAttackDamage() {
        return PercentLevelAttackDamage;
    }

    public void setPercentLevelAttackDamage(int percentLevelAttackDamage) {
        PercentLevelAttackDamage = percentLevelAttackDamage;
    }

    public int getFlatMovementSpeed() {
        return flatMovementSpeed;
    }

    public void setFlatMovementSpeed(int flatMovementSpeed) {
        this.flatMovementSpeed = flatMovementSpeed;
    }

    public int getPercentMovementSpeed() {
        return percentMovementSpeed;
    }

    public void setPercentMovementSpeed(int percentMovementSpeed) {
        this.percentMovementSpeed = percentMovementSpeed;
    }

    public int getPerLevelMovementSpeed() {
        return perLevelMovementSpeed;
    }

    public void setPerLevelMovementSpeed(int perLevelMovementSpeed) {
        this.perLevelMovementSpeed = perLevelMovementSpeed;
    }

    public int getPercentLevelMovementSpeed() {
        return PercentLevelMovementSpeed;
    }

    public void setPercentLevelMovementSpeed(int percentLevelMovementSpeed) {
        PercentLevelMovementSpeed = percentLevelMovementSpeed;
    }

    public int getFlatCritDamage() {
        return flatCritDamage;
    }

    public void setFlatCritDamage(int flatCritDamage) {
        this.flatCritDamage = flatCritDamage;
    }

    public int getPercentCritDamage() {
        return percentCritDamage;
    }

    public void setPercentCritDamage(int percentCritDamage) {
        this.percentCritDamage = percentCritDamage;
    }

    public int getPerLevelCritDamage() {
        return perLevelCritDamage;
    }

    public void setPerLevelCritDamage(int perLevelCritDamage) {
        this.perLevelCritDamage = perLevelCritDamage;
    }

    public int getPercentLevelCritDamage() {
        return PercentLevelCritDamage;
    }

    public void setPercentLevelCritDamage(int percentLevelCritDamage) {
        PercentLevelCritDamage = percentLevelCritDamage;
    }

    public int getFlatCritDamageMod() {
        return flatCritDamageMod;
    }

    public void setFlatCritDamageMod(int flatCritDamageMod) {
        this.flatCritDamageMod = flatCritDamageMod;
    }

    public int getPercentCritDamageMod() {
        return percentCritDamageMod;
    }

    public void setPercentCritDamageMod(int percentCritDamageMod) {
        this.percentCritDamageMod = percentCritDamageMod;
    }

    public int getPerLevelCritDamageMod() {
        return perLevelCritDamageMod;
    }

    public void setPerLevelCritDamageMod(int perLevelCritDamageMod) {
        this.perLevelCritDamageMod = perLevelCritDamageMod;
    }

    public int getPercentLevelCritDamageMod() {
        return PercentLevelCritDamageMod;
    }

    public void setPercentLevelCritDamageMod(int percentLevelCritDamageMod) {
        PercentLevelCritDamageMod = percentLevelCritDamageMod;
    }

    public int getFlatAttackSpeed() {
        return flatAttackSpeed;
    }

    public void setFlatAttackSpeed(int flatAttackSpeed) {
        this.flatAttackSpeed = flatAttackSpeed;
    }

    public int getPercentAttackSpeed() {
        return percentAttackSpeed;
    }

    public void setPercentAttackSpeed(int percentAttackSpeed) {
        this.percentAttackSpeed = percentAttackSpeed;
    }

    public int getPerLevelAttackSpeed() {
        return perLevelAttackSpeed;
    }

    public void setPerLevelAttackSpeed(int perLevelAttackSpeed) {
        this.perLevelAttackSpeed = perLevelAttackSpeed;
    }

    public int getPercentLevelAttackSpeed() {
        return PercentLevelAttackSpeed;
    }

    public void setPercentLevelAttackSpeed(int percentLevelAttackSpeed) {
        PercentLevelAttackSpeed = percentLevelAttackSpeed;
    }

    public int getFlatAttackSpeedRatio() {
        return flatAttackSpeedRatio;
    }

    public void setFlatAttackSpeedRatio(int flatAttackSpeedRatio) {
        this.flatAttackSpeedRatio = flatAttackSpeedRatio;
    }

    public int getPerLevelAttackSpeedRatio() {
        return perLevelAttackSpeedRatio;
    }

    public void setPerLevelAttackSpeedRatio(int perLevelAttackSpeedRatio) {
        this.perLevelAttackSpeedRatio = perLevelAttackSpeedRatio;
    }

    public int getPercentAttackSpeedRatio() {
        return percentAttackSpeedRatio;
    }

    public void setPercentAttackSpeedRatio(int percentAttackSpeedRatio) {
        this.percentAttackSpeedRatio = percentAttackSpeedRatio;
    }

    public int getPercentLevelAttackSpeedRatio() {
        return PercentLevelAttackSpeedRatio;
    }

    public void setPercentLevelAttackSpeedRatio(int percentLevelAttackSpeedRatio) {
        PercentLevelAttackSpeedRatio = percentLevelAttackSpeedRatio;
    }

    public int getFlatAttackRange() {
        return flatAttackRange;
    }

    public void setFlatAttackRange(int flatAttackRange) {
        this.flatAttackRange = flatAttackRange;
    }

    public int getPercentAttackRange() {
        return percentAttackRange;
    }

    public void setPercentAttackRange(int percentAttackRange) {
        this.percentAttackRange = percentAttackRange;
    }

    public int getPerLevelAttackRange() {
        return perLevelAttackRange;
    }

    public void setPerLevelAttackRange(int perLevelAttackRange) {
        this.perLevelAttackRange = perLevelAttackRange;
    }

    public int getPercentLevelAttackRange() {
        return PercentLevelAttackRange;
    }

    public void setPercentLevelAttackRange(int percentLevelAttackRange) {
        PercentLevelAttackRange = percentLevelAttackRange;
    }
}
