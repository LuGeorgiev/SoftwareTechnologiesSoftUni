<?php
/**
 * Created by PhpStorm.
 * User: Lubo
 * Date: 1.4.2018 г.
 * Time: 13:39
 */

namespace SoftUniBlogBundle\Form;

use SoftUniBlogBundle\Entity\Article;
use Symfony\Component\Form\AbstractType;
use Symfony\Component\Form\Extension\Core\Type\TextType;
use Symfony\Component\Form\FormBuilderInterface;
use Symfony\Component\OptionsResolver\OptionsResolver;

class ArticleType extends AbstractType
{
    public function buildForm(FormBuilderInterface $builder, array $options)
    {
        $builder
            ->add('title',TextType::class)
            ->add('content', TextType::class);
    }

    public function configureOptions(OptionsResolver $resolver)
    {
        $resolver->setDefaults([
            'data_class'=>Article::class
        ]
        );
    }
}