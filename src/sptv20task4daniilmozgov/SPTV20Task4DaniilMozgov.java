/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20task4daniilmozgov;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author user
 */
public class SPTV20Task4DaniilMozgov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Создать программу, которая выводит в консоль одномерный массив нечетных случайных чисел от 0 до 100 (выводить по десять чисел в одном ряду). 
        //Отсортировать массив и посчитать среднее арифметическое всех чисел массива.
        //Загрузить код проекта на удаленный репозиторий Git.
        int[] nums;
        int avg = 0, sum = 0;
        nums = new int[10];
        Random random = new Random();
        int min = 0, max = 99;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(max-min+1)-min;
            
        }
        Arrays.sort(nums);
        System.out.println("nums = "+Arrays.toString(nums));
        int length;
        length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            }
        avg = sum/length;
        System.out.println("Average = "+avg);
        System.out.println("");
        }
        }
   
    
    

